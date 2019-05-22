public class LastDigitChecker {
    public static boolean hasSameLastDigit(int p1, int p2, int p3){
        if((isValid(p1)&&(isValid(p2)&&isValid(p3)))){
            if((p1%10 == p2%10) || (p2%10 == p3%10) || (p1%10 == p3%10)){
               return true;
            }
        }
        return false;
    }

    public static boolean isValid(int number){
        if((number >= 10 && number <= 1000)){
            return true;
        }
        return false;
    }
}
