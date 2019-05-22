public class MinutesToYearsDaysCalculator {
    // write your code here
    public static void printYearsAndDays (long minutes){
        long days = 0;
        long years = 0;
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else if (minutes > 0){
            years = minutes/(60*24*365);
            if (years < 1){
                years = 0;
                days = minutes/(60*24);
                System.out.println(minutes+" min = "+years+" y and "+days+" d");
            }else{
                days = (minutes-(years*365*24*60))/(60*24);
                System.out.println(minutes+" min = "+years+" y and "+days+" d");
            }

        }else{
            System.out.println(minutes+" min = "+years+" y and "+days+" d");
        }
    }
}