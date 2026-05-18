import java.util.Scanner;

public class BinaryPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int n=sc.nextInt();
        String binary=Integer.toBinaryString(n);

        StringBuilder original=new StringBuilder(binary);
        StringBuilder reverseSB=new StringBuilder(binary);

        reverseSB.reverse();

        if(original.toString().equals(reverseSB.toString())){
            System.out.println("Given integer is a binary palindrome.");
        }
        else{
            System.out.println("Not a binary palindrome.");
        }
        

        sc.close();
    }
    
}
