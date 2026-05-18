class base{
    int x;
    base(){
        System.out.println("Base class");
    }
    base(int x){
        System.out.println("Base value x= "+x);
    }
    public void setx(int x){
        this.x=x;
        System.out.println("Setting x");
    }
    public int getx(){
        return x;
    }
}
class derived extends base{
    int y;
    derived(){
        //super(9);
        System.out.println("Derived class");
    }  
    derived(int x,int y){
        super(x);
        System.out.println("Derived valur of y= "+y);
    }
    public void sety(int x){
        this.y=y;
        System.out.println("Setting y");
    }
    public int gety(){
        return y;
    }
}

public class inheritance {
    public static void main(String[] args) {
        /*base b=new base();
        b.setx(12);
        System.out.println("value of x using object of base class= "+b.getx());*/

        derived d1=new derived();
        //d.setx(19);
        //System.out.println("x= "+d.getx());
        //d.sety(30);
        //System.out.println("y= "+d.gety());
        //derived d2=new derived(12,34);

    }
    
}
