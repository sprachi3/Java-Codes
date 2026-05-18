// index where left sum = right sum
// here we have to find maximum sum point

import java.util.Scanner;

public class MaxEquilSum {

    public static void CheckEqui(int[] arr){
        int n=arr.length;
        int max=-1;

        //brut method
        // for(int i=0;i<n;i++){
        //     int left=arr[i];
        //     for(int j=0;j<i;j++){
        //         left=left+arr[j];
        //     }
        //     int right=arr[i];
        //     for(int j=i+1;j<n;j++){
        //         right=right+arr[j];
        //     }
        //     if(left==right){
        //         max=i;
        //     }
        // }


        // create two different arrays and then compare them
        // int[] left=new int[n];
        // int[] right=new int[n];
        // left[0]=arr[0];
        // for(int i=1;i<n;i++){
        //     left[i]=left[i-1]+arr[i];
        // }
        // right[n-1]=arr[n-1];
        // for(int i=n-2;i>=0;i--){
        //     right[i]=right[i+1]+arr[i];
        // }

        // for(int j=0;j<n;j++){
        //     if(left[j]==right[j]){
        //         max=j;
        //     }
        // }



        // right=total-left-arr[i]
        // left=left+arr[i]
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int left=0;
        int right=sum;

        for(int i=0;i<n;i++){
            right=sum-left-arr[i];
            if(left==right){
                max=i;
                System.out.println("Equilibrium sum= "+right);
                
            }
            left+=arr[i];
        }
        
        System.out.println("Maximum Equilibrium point: "+arr[max]);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        CheckEqui(arr);

        sc.close();
    }
}
