import java.util.*;

public class ModifiedMjorElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int can=arr[n/2];
        int max=n/2;
        int c=0;
        for(int i=0;i<n;i++){
            
            if(arr[i]==can){
                c++;
            }
        }
        if(c>max){
                max=c;
    
            }
        System.out.println("Maximum: "+max);
        
    }
}
