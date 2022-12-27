public class AscendDescend {

    public static String ascendDescend(int length, int minimum, int maximum) {
        StringBuilder res = new StringBuilder();
        StringBuilder up = new StringBuilder();
        StringBuilder down = new StringBuilder();

        if(length == 0 || maximum < minimum){
            return "";
        }

        if(minimum == maximum){
            for (int i = 0; i < length; i++) {
                res.append(minimum);
            }
        }else {
            for (int i = minimum; i < maximum; i++) {
                up.append(i);
            }

            for (int i = maximum; i > minimum; i--) {
                down.append(i);
            }

            while (res.length() < length){
                res.append(up);
                res.append(down);
            }
        }

        return res.substring(0,length);
    }
}