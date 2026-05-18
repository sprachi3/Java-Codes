// input: malayalam
// dictionary: aaaallmmy
// output: aalmy
// each character should be even and if odd only one time
// elements of output: left string, middle character, right string(mirror of left)
// inp: amma
// out: am

import java.util.*;

public class Lex_first_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str1=sc.next();

        int[] freq=new int[26];
        for(char c:str1.toCharArray()){
            freq[c-'a']++;
        }

        char mid=' ';
        int odd=0;
        for(int i=0;i<26;i++){
            if(freq[i]%2!=0){
                odd++;
                mid=(char)('a'+i);
            }
        }
        if(odd>1){
            System.out.println("No palindrome.");
        }

        StringBuilder left=new StringBuilder();
        for(int i=0;i<26;i++){
            int count=freq[i]/2;
            for(int j=0;j<count;j++){
                left.append((char)('a'+i));
            }
        }
        String right=left.toString();
        
        System.out.println("Left"+left);
        StringBuilder result=new StringBuilder(left);
       
        if(mid!=' '){
            result.append(mid);
        }
        result.append(new StringBuilder(right).reverse());

        System.out.println(result);

    }
}
