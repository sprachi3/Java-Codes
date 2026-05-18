import java.util.Scanner;

public class MaxProSubarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Given array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        // BRUT FORCE
        // int maxProd=arr[0];
        // for(int i=0;i<n;i++){
        //     int current=1;

        //     for(int j=i;j<n;j++){
        //         current*=arr[j];
        //         maxProd=Math.max(maxProd,current);
        //         // if(current>maxProd){
        //         //     maxProd=current;
        //         // }
        //     }
        // }

        //OPTIMAL SOLUTION
        int currMax=arr[0];
        int currMin=arr[0];
        int maxProd=arr[0];
        for(int i=1;i<n;i++){
            int temp=Math.max(arr[i],Math.max(arr[i]*currMax,arr[i]*currMin));
            currMin=Math.min(arr[i],Math.min(arr[i]*currMax,arr[i]*currMin));
            currMax=temp;
            maxProd=Math.max(maxProd, temp);

        }

        System.out.println("Maximum product subarray for given array is= "+maxProd);


        sc.close();

    }
}
