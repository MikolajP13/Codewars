public class Kata {
    public static boolean validPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}");
    }
}