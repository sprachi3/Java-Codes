class cir{
    private double r,a,c;
    private String name;
    public void setname(String n){this.name=n;}
    public void setr(int radius){
        r=radius;
    
    }
    public double getr(){
        return r;
    }
    public void setc(double circum){
        if(c==2*3.14*r){
            circum=c;
        }
        else{
            System.out.println("Wrong circumference");
        }
    }
    public double getc(){
        return c;
    }
    public void seta(double area){
        if(a==3.14*r*r){
            a=area;
        }
        else{
            System.out.println("Wrong area.");
        }
    }
    public double geta(){
        return a;
    }
}
 public class access {
    public static void main(String[] args) {
        cir circle=new cir();
        circle.setr(12);
        System.out.println(circle.getr());
        circle.seta(123.89);
        circle.setc(4345);
        System.out.println(circle.geta());
        System.out.println(circle.getc());
    }
    
}
