//PRECEDENCE and ASSOCIATIVE
/* 
 every operator have its place bout who is superior
 SEQUENCE : - (LEFT - RIGHT)
 * / %  ---EQUAL PRECEDENCE THEN CHECK ON THE BASIS OF ASSOCIATIVE (LEFT TO RIGHT)
 + -    [EQUAL PRECEDENCE THEN CHECK ON THE BASIS OF ASSOCIATIVE (LEFT TO RIGHT)
 << >> EQUAL PRECEDENCE THEN CHECK ON THE BASIS OF ASSOCIATIVE (LEFT TO RIGHT)
 < <= > >= ----EQUAL PRECEDENCE THEN CHECK ON THE BASIS OF ASSOCIATIVE (LEFT TO RIGHT)
++ = -----EQUAL PRECEDENCE THEN CHECK ON THE BASIS OF ASSOCIATIVE (RIGHT TO LEFT)
*/

public class javassociative{
    public static void main (String[] args){

        int a = 45/5+8*2;
        System.out.println(a);
    }
}
/*
 45/5 and 8*2 [equal precedence..check on associativity]
 45/5 = 9 then 8*2=16
 then add 9+16 = 25
 */