import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("Checking If else-if ladder");

    int age = sc.nextInt ();

    if (age >= 1 && age <= 18)
      {
	System.out.println ("Time to study hard");
      }
    else if (age >= 19 && age <= 24)
      {
	System.out.println ("Eligble for Internship");
      }
    else if (age >= 25 && age <= 61)
      {
	System.out.println ("Eligible for job");
      }
    else
      {
	System.out.println ("Surpaased the age job");
      }
  }
}
