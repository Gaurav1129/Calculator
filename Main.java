import java.util.*;

public class Main{
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        String str = sc.next();

        if(str.equals("+")) {
            System.out.println(a+b);
        } else if(str.equals("-")){
            System.out.println(a-b);
        } else if(str.equals("*")) {
            
            System.out.println(a*b);
        } else if(str.equals("/")) {
            System.out.println(a/b);
        }
         

    } 
        
    
}