import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    //Problem 1 - convert all spaces between string to underscore.

      System.out.println ("Solution 1");

    String names = "D A R K";
      names = names.replace (" ", "_");
      System.out.println (names);

    /* Problem 2 - write a java program to fill in a letter template which looks like

       letter = "Dear <|name|>, thanks alot"
       replce <|name|> with string "some name" */

      System.out.println ("Solution 2");

      System.out.println ("Hey name thanks alot!");
      System.out.print ("Enter Name : ");

    String a = "Hey name thanks alot";

    String na = sc.nextLine ();
      a = a.replace ("name", na);
      System.out.println (a);

    // java programm to detect double or triple spaces.

      System.out.println ("Solution 3");

    String user = "this contains  double   triple spaces";
      System.out.println (user.indexOf (" "));	//double space
      System.out.println (user.indexOf ("  "));	// triple space

    // write the program to format the following letter using escape sequence char
      System.out.println ("Solution 4");

    String txt = "Helloo\navir\n\tdoing well!";	//\n , \t is used
      System.out.println (txt);
  }
}
