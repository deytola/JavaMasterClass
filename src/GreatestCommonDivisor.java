import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){
        List<Integer> firstDivisors = new ArrayList<>();
        List<Integer> secondDivisors = new ArrayList<>();
        int greatestCommonDivisor = 0;

        if (first < 0 || second < 0){
            return -1;
        }else if(second % first == 0 ){
            return first;
        }
        firstDivisors = getDivisors(first);
        secondDivisors = getDivisors(second);

        for(int firstNumber: firstDivisors){
            for(int secondNumber: secondDivisors){
                if(firstNumber == secondNumber){
                    greatestCommonDivisor = firstNumber;
                }
            }
        }
        return greatestCommonDivisor;
    }
    public static List<Integer> getDivisors(int number){
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                divisors.add(i);
            }
        }
        return divisors;
    }
}
