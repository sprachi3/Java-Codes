/*Constructor and inheritance
1) when you create object of subclass constructor of super class will be called first 
then constructor of derived class will be called.
2) constructor will be called from top to bottom in case of inheritance.
*/


class Super{
    int i;
    Super(int j){
        j=i;
        System.out.println("Super class constructor"+i);
    }
}

class Sub extends Super{
    int k;
    Sub(int p,int q){
        super(q);
        k=p;
        System.out.println("Sub class constructor"+p);
    }
}

public class inherconst {
    public static void main(String[] args) {
        Super a= new Super();
        a.Super();
        
    }
    
}
