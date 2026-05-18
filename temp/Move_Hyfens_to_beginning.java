import java.util.*;

public class Move_Hyfens_to_beginning {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String inp=sc.next();
        StringBuilder inew=new StringBuilder();
        int hycount=0;
        for(char c:inp.toCharArray()){
            if(c=='-'){
                hycount++;
            }
            else{
                inew.append(c);
            }
        }
        StringBuilder out=new StringBuilder();
        for(int i=0;i<hycount;i++){
            out.append('-');
        }
        out.append(inew);
        // int n=inew.length();
        // System.out.println(n);
        // for(int i=0;i<n;i++){
        //     if(inew.charAt(i)=='-'){
        //         out.append('-');
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     if(inew.charAt(i)!='-'){
        //         out.append(inew.charAt(i));
        //     }
        // }
        System.out.println(out);
        }
    
}
