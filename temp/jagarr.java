public class jagarr {
    public static void main(String[] args) {
        /*int arr[][]=new int[3][];
        arr[0]=new int[3];
        arr[1]=new int[4];
        arr[2]=new int[2];*/

        int arr[][]={{1,2},{3,4,5,6},{7,8,9},{10,11,12,13,14,15,16}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
    
}
