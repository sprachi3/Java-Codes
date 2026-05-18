import java.util.*;

public class Weighted_Substring{
    public static void Substring(String P,String Q,int k){
    //     int n=P.length();
    //     int count=0;
    //     for(int i=0;i<n;++i){
    //         String s="";
    //         int sum=0;
    //         for(int j=i;j<n;++j){
    //             int pos=P.charAt(j)-'a';
    //             sum+=Q.charAt(pos)-'0';
    //             s+=P.charAt(j);

    //             if(sum<k){
    //                 count++;
    //             }
    //             else{
    //                 break;
    //             }
    //         }
    //     }
    //     System.out.println("Number of substring= "+count);


    // Create an array to store all valid substrings
        String[] allSubstrings = new String[P.length() * P.length()]; // Maximum possible size
        int count = 0;// Generate all substrings with weight <= K
        Weight(Q);
        for (int i = 0; i < P.length(); i++) {
            int currentWeight = 0;
            String currentSubstring = "";
            for (int j = i; j < P.length(); j++) {
                char c = P.charAt(j);
                int weight = weights[c - 'a'];        // Check if adding this character would exceed K
                if (currentWeight + weight > K) {
                    break;
                }
                currentWeight += weight;
                currentSubstring += c;// Store the valid substring
                allSubstrings[count] = currentSubstring;
                count++;
            }
        }
       
        // Resize the array to actual number of elements
        String[] validSubstrings = Arrays.copyOf(allSubstrings, count);
       
        // Remove duplicates by sorting and comparing
        Arrays.sort(validSubstrings);
       
        int uniqueCount = 0;
        String previous = "";
       
        for (int i = 0; i < validSubstrings.length; i++) {
            if (!validSubstrings[i].equals(previous)) {
                uniqueCount++;
                previous = validSubstrings[i];
            }
        }
       
        System.out.println("Total unique substrings: " + uniqueCount);

    }
    public static void Weight(String Q){
        int[] weights = new int[26];
        for (int i = 0; i < 26; i++) {
            weights[i] = Q.charAt(i) - '0';
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.print("P: ");
        // String P=sc.next();
        // System.out.print("Q: ");
        // String Q=sc.next();
        // System.out.print("k: ");
        // int k=sc.nextInt();

        // Substring(P, Q, k);

        String P = "ababab";
        String Q = "12345678912345678912345678";
        int K = 5;// Create weight mapping for each character
        // int[] weights = new int[26];
        // for (int i = 0; i < 26; i++) {
        //     weights[i] = Q.charAt(i) - '0';
        // }
        Weight(Q);
       
        // // Create an array to store all valid substrings
        // String[] allSubstrings = new String[P.length() * P.length()]; // Maximum possible size
        // int count = 0;// Generate all substrings with weight <= K
        // for (int i = 0; i < P.length(); i++) {
        //     int currentWeight = 0;
        //     String currentSubstring = "";
        //     for (int j = i; j < P.length(); j++) {
        //         char c = P.charAt(j);
        //         int weight = weights[c - 'a'];        // Check if adding this character would exceed K
        //         if (currentWeight + weight > K) {
        //             break;
        //         }
        //         currentWeight += weight;
        //         currentSubstring += c;// Store the valid substring
        //         allSubstrings[count] = currentSubstring;
        //         count++;
        //     }
        // }
       
        // // Resize the array to actual number of elements
        // String[] validSubstrings = Arrays.copyOf(allSubstrings, count);
       
        // // Remove duplicates by sorting and comparing
        // Arrays.sort(validSubstrings);
       
        // int uniqueCount = 0;
        // String previous = "";
       
        // for (int i = 0; i < validSubstrings.length; i++) {
        //     if (!validSubstrings[i].equals(previous)) {
        //         uniqueCount++;
        //         previous = validSubstrings[i];
        //     }
        // }
       
        // System.out.println("Total unique substrings: " + uniqueCount);
    }

}