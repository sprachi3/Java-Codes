import java.io.*;

public class BytStream {
    public static void main(String[] args) throws IOException{
        
        //reading and writing to file
        FileInputStream sourceStream=null;
        FileOutputStream targetStream=null;

        try{
        sourceStream = new FileInputStream("C:/PS/COLLEGE/SEM-4/java/dome1.txt");
        targetStream=new FileOutputStream("C:/PS/COLLEGE/SEM-4/java/dome2.txt");

        int temp;
        while((temp=sourceStream.read())!=-1){
            targetStream.write((byte)temp);
        }

        System.out.println("Done");
        }

        finally{
            if(sourceStream!=null){
                sourceStream.close();
            }
            if(targetStream!=null){
                targetStream.close();
            }
        }
    }
    
}
