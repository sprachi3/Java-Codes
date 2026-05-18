import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
      /*   float a=7/4*9/2;
        float b = 7/4.0f*9/2.0f;
        System.out.println(a); 
        System.out.println(b); */

      /*   //Encrypt
        char a='A';
        a= (char)(a+8);
        System.out.println(a);
        //Decrypt
        a=(char)(a-8);
        System.out.println(a);  */

        Scanner s= new Scanner(System.in);
        
        /*System.out.print("enter number=");
        float b= s.nextFloat();
        float c=4;
        System.out.print("given number=");
        System.out.println(c);
        System.out.println(c>b);    */

        float v=4.0f;
        float u=9.0f;
        float a=3.0f;
        float t=2.0f;
        float z= ((v*v)-(u*u))/(2*a*t);
        System.out.println(z);

        
    }
    
}
