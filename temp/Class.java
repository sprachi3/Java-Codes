class firstClass{
    int id;
    String name;

    public void display(){
        System.out.println("My id is: "+id);
        System.out.println("My name is: "+name);
    }
}


public class Class {
    public static void main(String[] args) {
        System.out.println("First custom class");
        firstClass fs=new firstClass();
        firstClass rs=new firstClass();

        //setting attributes
        fs.id=11313;
        fs.name="Prachi";
        rs.id=12314;
        rs.name="Rishu";

        //printing attributes
        System.out.println(fs.id); 
        System.out.println(fs.name);
        rs.display();
    }
}
