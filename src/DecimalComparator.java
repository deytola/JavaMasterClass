import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double fNum, double sNum){
        DecimalFormat df = new DecimalFormat("#.###");

        df.setRoundingMode(RoundingMode.CEILING);


        String newFNum = df.format(fNum);
        String newSNum = df.format(sNum);

        System.out.println(newFNum+ " and "+newSNum);


        if (newFNum.equals(newSNum)){
            return true;
        }
        return false;
    }
}