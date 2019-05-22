public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int reverse = 0;
        int lastDigit = number%10;
        if (number < 0){
            return -1;
        }

        while (number > 0){
            int lastNumber = number % 10;
            reverse = reverse * 10 + lastNumber;
            number /= 10;
        }

        int firstDigit = reverse%10;
        return lastDigit + firstDigit;
    }
}
