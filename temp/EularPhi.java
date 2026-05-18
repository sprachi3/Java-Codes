// findinng co-prime
// if n is prime output is n-1
// if n=pq output is (p-1)(q-1)
// if n=a^2b^2.......n(1-1/a)(1-1/b)    composite

// FOR CODING:-  n(1-1/p1)(1-1/p2)...... base i.e. p1,p2......,pn should be prime

import java.util.Scanner;

public class EularPhi {

    // public static int GCD(int a,int b){
    //     if(a==0){
    //         return b;
    //     }
    //     return GCD(b%a,a);
    // }

    static int phi(int n) {
        float result = n;
        for (int p = 2; p * p <= n; ++p) {
            if (n % p == 0) {
                while (n % p == 0){
                    n /= p;
                    result *= (1.0 - (1.0 / (float) p));
                }
            }
        }
        if (n > 1)
            result -= result / n;
        return (int) result;
    }

    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int n=sc.nextInt();
        // int res=n;
          int n = 35;
        System.out.println("phi(" + n + ") = " + phi(n));


        
        // int c=0;
        // for(int i=1;i<=n;i++){
        //     if(GCD(i,n)==1){
        //         c++;
        //     }
        // }

        // for(int p=2;p*p<=n;p++){
        //     if(n%p==0){
        //         while(n%p==0){
        //             n=n/p;
        //         }
        //     }
        //     res=res-(res/p);
        //     if(n>1){
        //             res=res-(res/n);
        //         }
        // }
        // System.out.println("Number of co-prime pairs "+c);
        // sc.close();
        
    }
    
}
