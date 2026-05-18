import java.util.*;

public class AliceAppleTree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("M: ");
        int M=sc.nextInt();
        System.out.print("\nK: ");
        int K=sc.nextInt();
        System.out.print("\nN: ");
        int N=sc.nextInt();
        System.out.print("\nS: ");
        int S=sc.nextInt();
        System.out.print("\nE: ");
        int E=sc.nextInt();
        System.out.print("\nW: ");
        int W=sc.nextInt();

        if(M<=S*K){
            System.out.println("M= "+M);
        }
        else if(M<=S*K+E+W){
            System.out.println("M= "+M);
        }
        else{
            System.out.println("-1");
        }
    }
    
}
