import java.util.Scanner;
public class numdetect{
    public static void main(String[] args){
        System.out.println("Number Detector");
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Number To Check");
        int a = sc.nextInt ();

        if(a>0) {
            System.out.println("Its Positive");  
        } else if (a < 0) {
            System.out.println("Its Negative");
        } else {
            System.out.println("Its Zero");
        }
    }
}