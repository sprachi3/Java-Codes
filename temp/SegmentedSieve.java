import java.util.*;

public class SegmentedSieve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting point: ");
        int s=sc.nextInt();
        System.out.print("Enter ending point: ");
        int n=sc.nextInt();

         boolean[] isPrime=new boolean[n+1];
        for(int i=2;i<=n;i++){
            isPrime[i]=true;
        }

        for(int p=2;p*p<=n;p++){
                if(isPrime[p]==true){
                    for(int i=p*p;i<=n;i=i+p){
                        isPrime[i]=false;
                }
            }
        }
         int count=0;
            for(int i=2;i<=n;i++){
                if(isPrime[i]){
                    count++;
                }
            }
           

            int[] res=new int[count];
            int index=0;
            for(int i=s;i<=n;i++){
                if(isPrime[i]){
                    res[index++]=i;
                }
            }

            int c=0;
            System.out.println("Prime numbers: ");
            for(int i=0;i<count;i++){
                if(res[i]==0){
                    break;
                }
                System.out.print(res[i]+" ");
                c++;
            }
            System.out.println();
            System.out.println("Number of prime numbers: "+ c);
            sc.close();
    }    
}
