public class IntEqualityPrinter {
    // write your code here
    public static void printEqual(int p1, int p2, int p3){
        if((p1<0) || (p2<0) || (p3<0)){
            System.out.println("Invalid Value");
        }else if((p1==p2) && (p2==p3)){
            System.out.println("All numbers are equal");
        }else if ((p1!=p2) && (p2!=p3) && (p3!=p1)){
            System.out.println("All numbers different");
        }else{
            System.out.println("Neither all equal or different");
        }

    }
}