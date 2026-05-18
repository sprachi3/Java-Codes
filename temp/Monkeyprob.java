// Locker problem

import java.util.Scanner;

public class Monkeyprob {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of monkeys: ");
        int n=sc.nextInt();
        boolean[] arr=new boolean[n+1];
        for(int i=1;i<=n;i++){
           for(int j=i;j<=n;j+=i){
            arr[j]= !arr[j];
           }
        }

        for(int i=1;i<Math.sqrt(n);i++){
            System.out.print((int)Math.pow(i,2)+" ");
        }
        System.out.println();
        int c=0;
        for(int i=0;i<n;i++){
           
            if(arr[i]==true){
                System.out.println(i);
                c++;
            }
        }
        System.out.println();
        System.out.println("Number of open doors: "+c);


        sc.close();
    }
    
}