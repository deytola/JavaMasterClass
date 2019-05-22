import java.util.ArrayList;
import java.util.List;

public class SharedDigit {
    public static boolean hasSharedDigit(int p1, int p2){
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();

        if((p1 >= 10 && p1 <= 99)&&(p2 >= 10 && p2 <= 99)){

            while(p1 > 0){
                int lastDigit = p1%10;
                a1.add(lastDigit);
                p1/=10;
            }

            while(p2 > 0){
                int lastDigit = p2%10;
                a2.add(lastDigit);
                p2/=10;
            }
            System.out.println(a1.toString()+" and "+a2.toString());
            for (int a1Element: a1){
                for(int a2Element: a2){
                    if(a1Element == a2Element){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
