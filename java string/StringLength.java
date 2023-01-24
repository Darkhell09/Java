import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.print ("Enter String Length 6 : ");
    String name = sc.nextLine ();

      System.out.println (name.charAt (0));
      System.out.println (name.charAt (1));
      System.out.println (name.charAt (2));
      System.out.println (name.charAt (3));
      System.out.println (name.charAt (4));
      System.out.println (name.charAt (5));

  }
}
