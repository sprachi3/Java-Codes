import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        /*int [] marks=new int[5];
         System.out.println("Enter marks:-");
         for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();
         }*/


         //Traversal
         //System.out.println("The given array is:-");
        /*  for(int i=4;i>=0;i--){
            System.out.print(marks[i]+" ");
         }*/

         /*for (int element:marks){
            System.out.println(element);
         }
         System.out.println(marks.length);*/


    //Multidimensional Array
        System.out.print("no of floors:-");
        int n=sc.nextInt();
        System.out.print("no of flats:-");
        int m=sc.nextInt();
        int [][] flats=new int[n][m];
        
        System.out.println("Enter flat numbers");
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                flats[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Flat numbers are:-");
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(flats[i][j]);
            }
            System.out.println();
        }

        System.out.println(flats.length);
    
          

        















    }
    
}
