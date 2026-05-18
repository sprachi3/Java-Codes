class Myemp{
    private int id;
    private String name;
    private int salary;
    /*public void setname(String n){ this.name=n;}
    public void setid(int i){this.id=i;}*/
    public String getname(){return name;}
    public int getid(){return id;} 
    public int getsal(){return salary;}

    //Constructor
    public Myemp(){
        id=10311;
        name="AS";
    }

    //Parametarized
    /*public Myemp(String n,int i){
        name=n;
        id=i;
    }*/

    public Myemp(String n,int i){
        name=n;
        id=i;
        salary=10000;
    }

}
public class constructor {
    public static void main(String[] args) {
    Myemp emp1=new Myemp("Prachi singh",11313);
    Myemp emp2=new Myemp();
    //emp1.setname("prachi");
    //emp1.setid(11313);
    System.out.println(emp1.getname());
    System.out.println(emp1.getid());
    System.out.println(emp1.getsal());
    System.out.println(emp2.getname());
    System.out.println(emp2.getid());
    System.out.println(emp2.getsal());
    
    } 
}
