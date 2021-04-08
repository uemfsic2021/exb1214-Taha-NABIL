import java.util.Scanner;
public class Palindrome{
     public static void main(String args[])
    {
       String S;
       Scanner sc = new Scanner(System.in);
  
       System.out.println("Entrer un mot ");
       S = sc.nextLine();
  
       if (is_palindrome(S))
          System.out.println("true");
       else
          System.out.println("false");
    }
        public static boolean is_palindrome(String S)
        {
          int i=0, longueur=S.length()-1;
       boolean egale=true;
       while(i<longueur/2 && egale){
           if(S.charAt(i) == S.charAt(longueur-i))
              egale = true;
           else
              egale = false;
           i++;
        }

        return egale;
    }
}
