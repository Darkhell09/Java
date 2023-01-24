import java.util.Scanner;
public class swapno{
    public static void main(String[] args) {
        System.out.println("Swap Numbers");
        Scanner sc = new Scanner (System.in);

        System.out.println("Number One");
        float a = sc.nextFloat();

        System.out.println("Number Two");
        float b = sc.nextFloat();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After swapping, a is " + a + " and b is " + b);
    }

}