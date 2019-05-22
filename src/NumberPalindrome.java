public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if (number < 0){
            number *= -1;
        }
        int num = number;
        int reverse = 0;
        while (num > 0){
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
            System.out.println(num);

        }
        if (reverse == number){
            return true;
        }
        return false;
    }
}
