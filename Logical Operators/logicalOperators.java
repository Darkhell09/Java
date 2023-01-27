public class Main{
    public static void main(String[] args){
        System.out.println("AND LOGICAL OPERATOR");
        boolean a = true;
        boolean b = true;
        boolean c = true;
        
        if(a && b && c) {
            System.out.println("True!");
        } else {
            System.out.println("False");
        }
        
        System.out.println("OR LOGICAL OPERATOR");
        boolean a1 = true;
        boolean b1= false;
        boolean c1= true;
        
        if(a1 || b1 || c1) {
            System.out.println("is right");
        } else {
            System.out.println("is wrong");
        }
        
        System.out.println("NOT EQUAL OPERATOR");
        boolean a2 = true;
        boolean b2 = true;
        boolean c2 = true;
        
        if(a2 != b2 != c2){
            System.out.println("False");
        }else {
            System.out.println("True!");
        }
    }
}