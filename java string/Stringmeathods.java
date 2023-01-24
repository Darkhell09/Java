public class Main
{
  public static void main (String[]args)
  {
    String name = "Enthusiastic";
      System.out.println (name.length ());

    String hell = "DarkImpulse";
      System.out.println (hell.toLowerCase ());
      System.out.println (hell.toUpperCase ());

    String three = "     Convert    ";
      System.out.println (three.trim ());

    String four = "Creativity";
      System.out.println (four.substring (4));

      System.out.println (four.substring (4, 10));

    String five = "Sappy";
      System.out.println (five.replace ('S', 'H'));
    
    String six = "Mortel";
    System.out.println(six.startsWith("Mor"));
    
    
    System.out.println(six.endsWith("el"));
    
     System.out.println(six.charAt(3));
    
    String seven = "Hell";
    System.out.println(seven.indexOf('H'));
    
    String names = "Dark";
    System.out.println(names.equals("Dark"));
  }
}
