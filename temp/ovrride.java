class A{
    public int a;
    public void display(){
        System.out.println("Parent class");
    }
}
class B extends A {
    public void display(){
        System.out.println("Child class");
    }
}

public class ovrride {
    public static void main(String[] args) {
        A a=new A();
        a.display();
        B b=new B();
        b.display();
    }
}
