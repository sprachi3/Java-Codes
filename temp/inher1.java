public class inher1 {
    public static void main(String[] args) {
       B b=new B();
       b.demo1();
       b.demo2(); 
    }
    
}

class A{
    int i=10;
    void demo1(){
        System.out.println("Super class "+i);
    }
}

class B extends A{
    int j=20;
    void demo2(){
        System.out.print("Sub Class "+j+" "+i);
    }
}


