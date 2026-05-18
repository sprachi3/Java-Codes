import java.util.*;

public class arryList1 {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<String>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Grapes");
        fruits.add("Litchi");

        for(String i:fruits){
            System.out.println(i);
        }

        fruits.remove("Grapes");
        System.out.println(fruits.size());

       /*Iterator it=fruits.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
    }


}