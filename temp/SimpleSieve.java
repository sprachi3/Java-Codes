import java.util.*;

public class SimpleSieve {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[] isPrime=new boolean[n+1];
        for(int i=2;i<=n;i++){
            isPrime[i]=true;
        }

        for(int p=2;p*p<=n;p++){
                if(isPrime[p]==true){
                    for(int i=p*p;i<n;i=i+p){
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
            System.out.println(count);

            int[] res=new int[count];
            int index=0;
            for(int i=2;i<=n;i++){
                if(isPrime[i]){
                    res[index++]=i;
                }
            }
            // System.out.println("Prime numbers: ");
            // for(int i=0;i<count;i++){
            //     System.out.print(res[i]);
            // }
            System.out.println();
            for(int i=0;i<res.length-1;i++){
                if(res[i+1]-res[i]==2){
                   System.out.println('('+res[i]+','+res[i+1]+')');
            }
            sc.close();
        }
    }
}

