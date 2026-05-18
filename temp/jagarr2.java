public class jagarr2 {
    public static void main(String[] args){
        int x=10;
        int arr[][]=new int[5][];
        for(int i=0;i<arr.length;i++){
            arr[i]=new int[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=x;
                x+=10;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    
}
