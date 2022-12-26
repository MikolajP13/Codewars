class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int sum = 0, num = 1, i = 0;
        int oddsBefore = 0;
        boolean count = true;

        for (int j = n; j > 0; j--) {
            oddsBefore+=j;
        }

        int from = oddsBefore-n+1;
        int to = from+n;

        while (count){
            if(num%2!=0){
                i++;
            }

            if(i >= from){
                sum+=num;
                from++;
            }

            if(from == to){
                count = false;
            }

            num++;
        }

        return sum;
    }
}