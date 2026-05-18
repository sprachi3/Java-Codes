import java.util.*;

public class Combination{
    public static int factorial(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result*=i;
        }

        return result; 
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n=sc.nextInt();
        System.out.print("Enter value of r: ");
        int r=sc.nextInt();
        int comb=factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println("C= "+comb);
       
    }
}