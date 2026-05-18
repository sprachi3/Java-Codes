// maximum sum of hour glass

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int[][] arr = { { 1, 2, 3, 4, 5, 9 }, { 6, 4, 5, 3, 5, 2 }, { 1, 5, 3, 2, 5, 3 }, { 4, 9, 7, 0, 3, 2 },
        //         { 1, 4, 2, 8, 5, 3 } };
        System.out.print("Enter number of columns: ");
        int col=sc.nextInt();
        System.out.print("Enter number of rows: ");
        int row=sc.nextInt();

        int[][] arr=new int[row][col];

        System.out.println("Enter elements for 2D array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("The given array is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        int maxSum = Integer.MIN_VALUE;
        if (arr[0].length > 3 || arr.length > 3) {
            for (int i = 0; i <= arr.length - 3; i++) {
                for (int j = 0; j <= arr[0].length - 3; j++) {
                    int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
                            + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
        }
        else{
            System.out.println("Invalid array for hour glass sum application");
        }

        System.out.println("Maximum hour glass sum= " + maxSum);

        sc.close();

    }

}
