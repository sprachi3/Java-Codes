import java.util.Scanner;

public class Pracarray {
    public static void main(String[] args) {
        
        //Ques1
        /*double [] add = {10.5,11.6,12.7,13.5,14.4,15.7};
        double sum=0;
        for (double e: add){
            sum+=e;
        }
        System.out.println("Sum of elements are= "+sum);*/


        //Ques 2
        /*int [] arr = {1,2,3,4,5,6};
        System.out.print("Enter the integer you want to check:- ");
        int i=sc.nextInt();
        boolean isinArr = false;
        for(int e:arr){
            if(e==i){
                isinArr=true;
                break;
            }
        }
        if (isinArr){
            System.out.println(i+" is present in the given array.");
        }
        else{
            System.out.println(i+" is not present in the given array.");
        } */

        
        //Ques3
        /*System.out.println("Marks in Physics:-");
        double [] marks=new double[10];
        double sum=0;
        for (int i=0;i<10;i++){
            System.out.print("Student "+(i+1)+":-");
            marks[i]=sc.nextDouble();
        }
        for(double e:marks){
            sum+=e;
        }
        System.out.println("Total marks of students in physics= "+sum);
        System.out.println("Average marks of class in physics= "+sum/marks.length);*/





        //Ques 4
        int [][] mat1= {{1,2,5},{2,3,4}};
        int [][] mat2= {{2,3,10},{10,11,12}};
        int [][] mat3= new int[2][3];
        for(int i=0;i<mat1.length;i++){  //row no of times
            for(int j=0;j<mat1[i].length;j++){  //column no of times
                //System.out.format("Setting value in matrix 3 for i=%d and j=%d\n",i,j);
                mat3[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(mat3[i][j]+" ");
                
            }
            System.out.println(" ");
        }




        
        //Ques 5
        /*int [] revarr = {1,2,3,4,5};
        for (int i=revarr.length-1;i>=0;i--){
            System.out.print(revarr[i]+" ");
        }*/

        //Ques6
        /*int [] arr = {1,2,-9807,1000,67,100,3,4,5};
        int max=0;
        //max= Integer.MAX_VALUE;
        
        /*for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }*/

        /*for(int e:arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println("Max value is:-"+max);

        //Ques 7
        int min=Integer.MAX_VALUE;
        for(int e:arr){
            if(e<min){
                min=e;
            }
        }
        System.out.println("Minimum value is:- "+min);*/


        //Ques 8
        Scanner sc = new Scanner(System.in);
        /*int [] arr=new int[5];
         System.out.println("Enter elements of array:- ");
         for(int i=0;i<arr.length-1;i++){
            arr[i]=sc.nextInt();
         }
         boolean issorted=true;
         for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                issorted=false;
                break;
            }
         }
         if(issorted){
            System.out.println("The array is sorted.");
            for(int i=0;i<arr.length-1;i++){
                System.out.print(arr[i]+" ");
            }
         }
         else{
            System.out.println("The array is not sorted.");
         } */
    
    
    
    
    
    
    
    
    
    
    
    }
      


















    
    
}
