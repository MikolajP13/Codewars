public class TwiceAsOld{

    public static int TwiceAsOld(int dadYears, int sonYears){

        return dadYears - sonYears * 2 < 0 ?
                (dadYears - sonYears * 2) * -1 : (dadYears - sonYears * 2);
    }

}