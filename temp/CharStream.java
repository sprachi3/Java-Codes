import java.io.*;

public class CharStream {
    public static void main(String[] args) throws IOException{
        FileReader sourceStream=null;
        FileWriter targetStream=null;

        try{
            sourceStream = new FileReader("C:/PS/COLLEGE/SEM-4/java/dome1.txt");
            targetStream=new FileWriter("C:/PS/COLLEGE/SEM-4/java/dome2.txt");

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
