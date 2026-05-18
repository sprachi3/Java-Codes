import java.util.Scanner;

class rectangle{
    double l,b;
    rectangle(double len,double br){
        this.l=len;
        this.b=br;
    }
    public void area(){
        System.out.println("Area of rectangle= "+this.l*this.b);
    }

}
class cuboid extends rectangle{
    double h;
    cuboid(double len,double br,double he){
        super(len,br);
        this.h=he;;
    }
    public void volume(){
        System.out.println("Volume of cuboid= "+(this.l*this.b*this.h));
    }

}
public class ArVo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double l,b,h;
        System.out.print("Enter length= ");
        l=sc.nextDouble();
        System.out.print("Enter beadth= ");
        b=sc.nextDouble();
        System.out.print("Enter height= ");
        h=sc.nextDouble();
        cuboid cu1=new cuboid(12.9,8,6);
        cu1.area();
        cu1.volume();

    }
    
}
