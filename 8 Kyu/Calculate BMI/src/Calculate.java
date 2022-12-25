public class Calculate {
    public static String bmi(double weight, double height) {
        double bmiResult = weight/Math.pow(height, 2);
        if(bmiResult <= 18.5){
            return "Underweight";
        }else if(bmiResult <= 25.0){
            return "Normal";
        }else if(bmiResult <= 30.0){
            return "Overweight";
        }else{
            return "Obese";
        }
    }
}