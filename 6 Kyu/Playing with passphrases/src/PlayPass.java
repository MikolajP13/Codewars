import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class PlayPass {
    public static String playPass(String s, int n) {
        AtomicInteger counter = new AtomicInteger(0);

        List<String> list = Arrays.stream(s.split(""))
                .map(str -> str.charAt(0))
                .map(c -> {
                    char c2 = c;
                    if(Character.isDigit(c)){
                        return (char)(9 - Integer.parseInt(String.valueOf(c)) + 48);
                    } else if (Character.isLetter(c)) {
                        int i = 0;
                        while (i < n){
                            if(c2+1 < 91 || c2+1>96 && c2+1<123){
                                c2 += 1;
                            }else{
                                c2 = c2 + 1 == 91 ? 'a' : 'A';
                            }
                            i++;
                        }
                        return c2;
                    } else{
                        return c;
                    }
                })
                .map(String::valueOf)
                .map(c -> counter.getAndIncrement()%2 == 0 ? c.toUpperCase() : c.toLowerCase())
                .collect(Collectors.toList());

        return new StringBuilder(String.join("", list)).reverse().toString();
    }
}