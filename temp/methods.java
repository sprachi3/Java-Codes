import java.util.Scanner;

public class methods {
    Scanner sc=new Scanner(System.in);
    /*int sum(int x,int y){
        int z;
        z=x+y;
        System.out.format("Sum of %d and %d is %d.",x,y,z);
        return 0;
     }

    static void telljoke(){
        System.out.println("I am human.  ");
    }

    static void change1(int a){
        a=98;
    }

    static void change2(int[] arr){
        arr[0]=98;
    }*/

    /*static void area(int a){
        System.out.println("Area of circle="+2*3.14*a);
    }
    static void area(int x,int y){
        System.out.println("area of rectangle= "+x*y);
    }*/

    /*static void sum(int...arr){
        int sum=0;
        for(int e:arr){
            sum=sum+e;
            
        }
        System.out.println(sum);
    }*/

    /*static void sum(int x,int...arr){//default value.we have to give value of x in any case
        int sum=x;
        for(int e:arr){
            sum=sum+e;
            
        }
        System.out.println(sum);
    }*/

    
    
    
    
    
    
    public static void main(String[] args) {
        //sum(2,3);
        //methods a1=new methods();
        //a1.sum(4,5);
        //telljoke();

        //case 1: Changing a integer
        /*int x=45;
        change1(x);
        System.out.println("Value of x after changing: "+x);    //-->Output: 45*/
        
         //Case 2: changing the array
         /*int[] marks={1,4,3,6,3};
         change2(marks);
         System.out.println("marks[0] after changing: "+marks[0]);  //---> Output: 98 */

         //overloading
        //area(3); 
        //area(9,8);

        //varARGS
        /*sum( 5);
        sum(9,7,6);
        sum(8,9);*/

        //factorial
        System.out.println(factorial(4));
        System.out.println(factorial(0)); 

    }
}
