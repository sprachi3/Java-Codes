// I/P
// arr={8,12,16,5,6,8,1,2,1}
// here 16,8,2,1 are leading as all elements in right are smaller
// O/P={16,8,2,1}

import java.util.ArrayList;
import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();

        System.out.println("Enter elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        ArrayList result=new ArrayList<>();

        // Brut 
        // for(int i=0;i<n;i++){
        //     int j;
        //    for(j=i+1;j<n;j++){
        //     if(arr[j]>=arr[i]){
        //         break;
        //     } 
        //    }
        //    if(j==n){
        //     result.add(arr[i]);
        //    }
           
        // }

        //Optimal
        int max=arr[n-1];
        result.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                result.add(max);
            }
        }
        System.out.println(result);
    }
    
}
