
import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisor1 {

    public static int getGreatestCommonDivisor(int first, int second) {
        List<Integer> firstDivisors = new ArrayList<>();
        List<Integer> secondDivisors = new ArrayList<>();
        int greatestCommonDivisor = 0;

        if (first < 10 || second < 10) {
            return -1;
        } else if (second % first == 0) {
            return first;
        }

        for (int i = 1; i <= first; i++) {
            if (first % i == 0) {
                firstDivisors.add(i);
            }
        }

        for (int i = 1; i <= second; i++) {
            if (second % i == 0) {
                secondDivisors.add(i);
            }
        }

        for (int firstNumber : firstDivisors) {
            for (int secondNumber : secondDivisors) {
                if (firstNumber == secondNumber) {
                    greatestCommonDivisor = firstNumber;
                }
            }
        }
        return greatestCommonDivisor;
    }


}

