class Animal{
    public void intro(){
        System.out.println("I am an animal.");
    }
    public void loc(){
        System.out.println("Mostly I prefer jungle");
    }
}
class Dog extends Animal{
    public void intro(){
        System.out.println("I am a dog.");
    }
    public void type(){
        System.out.println("I am a pet animal.");
    }
}
public class Dynamicmeth {
    public static void main(String[] args) {
        //It is helpul in case of run time method dispatching.
        //Objects are alloted memory during runtime
        Animal a2= new Dog(); //superclass object  //reference of superclass and object of subclass
        // Dog d2=new Animal();     not allowed
        a2.intro();
        a2.loc(); 
        //a2.type();         //not allowed

       
       
       
       
        /*Dog d1=new Dog();
        d1.type();
        d1.intro();
        d1.loc();
        Animal a1=new Animal();
        a1.intro();
        a1.loc();*/
    }
    
}
