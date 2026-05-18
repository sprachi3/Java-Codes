import java.util.Scanner;
public class MyString {
    public static void main(String[] args)
    {
        /*String address;
        address=new String("Patna");
        System.out.println(address);  
        System.out.print("My name is: ");  //removes space  
        String name="Prachi";
        System.out.println(name);
        
        int a=12;
        String n ="sarvin";
        System.out.printf("Age of %s is %d",n,a);
        System.out.format("Age of %s is %d",n,a);  */

        /*float f=1.092343f;
        System.out.printf("value is %.3f",f);

        /*Scanner s=new Scanner(System.in);
        String na=s.next();
        System.out.println(na);*/
        
        String nam="Prachi";
        System.out.println(nam.length());
        System.out.println(nam.toLowerCase());
        System.out.println(nam.toUpperCase());
        System.out.println(nam.substring(0, 4));
        System.out.println(nam.replace("Pra","Sin"));


        String colo="Magenta ";
        System.out.println(colo.toLowerCase());
        System.out.println(colo.replace(" ","_")); 


        String letter="Dear name, Thanks a lot";
        System.out.println(letter.replace("name","Sinchi"));

         String space="Is the  double and tripple string";
         System.out.println(space.indexOf("  "));
         System.out.println(space.indexOf("   "));

  
    }
    
}
