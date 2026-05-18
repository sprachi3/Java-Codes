import java.util.*;
import java.math.*;

public class SwapNibble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter integer: ");
        int n=sc.nextInt();
        StringBuilder num=new StringBuilder(n.toBina);
        StringBuilder nibble=new StringBuilder();
        nibble=num.reverse();
        System.out.println(nibble.toString());

    }
}
