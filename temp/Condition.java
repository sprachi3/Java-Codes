import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
      /*int age=20;
      boolean cond =(age>=18);
      if (cond==true){
        System.out.println("y");
      }  

      boolean a= false;
      boolean b= true;
      if (a&&b){
        System.out.println("yes");
      }*/


      /*int age=40;
      if (age>40){
        System.out.println("Good");
      }
      else if(age>30){
        System.out.println("bad");
      }
      else{
        System.out.println("not applicable");
      }*/

      // SWITCH STATEMENT
      Scanner sc= new Scanner(System.in);
      int age;
      System.out.print("Enter your age:");
      age=sc.nextInt();

      switch(age){
        case 18->{
        System.out.println("you are an adult.");}
       
        case 21->
        System.out.println("Allowed for drinking.");
        
        case 25->
        System.out.println("work!!");
       
        default->
        System.out.println("Nothing to say"); 


        /*case 18:
        System.out.println("you are an adult.");
        break;
        case 21:
        System.out.println("Allowed for drinking.");
        break;
        case 25:
        System.out.println("work!!");
        break;
        default:
        System.out.println("Nothing to say");
 */
      }




    }
    
    
}
