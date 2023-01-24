import java.util.Scanner;
public class percentage{
    public static void main(String[] args){
        System.out.println("Enter Alloted Marks");
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter English");
        float a = sc.nextFloat();

        System.out.println("Enter Hindi");
        float b = sc.nextFloat();

        System.out.println("Enter Maths");
        float c = sc.nextFloat();

        System.out.println("Enter Science");
        float d = sc.nextFloat();

        float add = a+b+c+d;
        System.out.println("Addition");
        System.out.println(add);
        
        float per = add/400;
        
        float fin = per*100;
        System.out.print("Percentage = ");
        System.out.print(fin);
    }
}