// check whether after rotating numbers by 180degree we are getting the any same or not 
// (except 6 and 9 as lookinng upside down it still looks same so they are also strobogrammatic)

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class StrobogrammaticNumber {
    // public static boolean isStrobogrammatic(String num){
    //     HashMap<Character,Character> CheckMap=new HashMap<>();
    //     CheckMap.put('0','0');
    //     CheckMap.put('1','1');
    //     CheckMap.put('9','6');
    //     CheckMap.put('8','8');
    //     CheckMap.put('6','9');
        
    //     int i=0;
    //     int r=num.length()-1;

    //     while(i<=r){
    //         char left=num.charAt(i);
    //         char right=num.charAt(r);

    //         if(!CheckMap.containsKey(left)){
    //             return false;
                
    //         }
    //         if(CheckMap.get(left)!=right){
    //             return false;
    //         }
    //         i++;
    //         r--;
    //     }
    //     return true;

    // }

    public static boolean isStrobogrammatic(String num){
        ArrayList<Character> validDig=new ArrayList<>(Arrays.asList('0','1','6','8','9'));
        ArrayList<Character> reverseMap=new ArrayList<>(Arrays.asList('0','1','9','8','9'));

        int i=0;
        int r=num.length()-1;
        while(i<=r){
            char left=num.charAt(i);
            char right=num.charAt(r);

            if(!validDig.contains(left)){
                return false;
            }
            int index=validDig.indexOf(left);
            if(right!=reverseMap.get(index)){
                return false;
            }
            i++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to check: ");
        String num=sc.next();
        System.out.println("Given number is Strobogrammatic? "+isStrobogrammatic(num));

       
        sc.close();

    }
}
