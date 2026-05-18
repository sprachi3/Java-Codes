import java.util.Scanner;

public class cbse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter total marks");
        float n = s.nextFloat();
        System.out.print("english=");
        float e=s.nextFloat();
        System.out.print("maths=");
        float m=s.nextFloat();
        System.out.print("science=");
        float S=s.nextFloat();
        System.out.print("sst=");
        float sst=s.nextFloat();
        System.out.print("computer=");
        float c=s.nextFloat();
        float t =e+m+S+sst+c;
        System.out.print("total marks= ");
        System.out.println(t);
        float p= (t/n)*100;
        System.out.print("Percentage= ");
        System.out.println(p);
         
    }
    
}
