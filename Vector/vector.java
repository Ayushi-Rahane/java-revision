import java.util.*;

public class vector{
    public static void main(String[] args)
 {
    Vector <Object> v = new Vector<> ();
    v.add("Hello");
    v.add(1);
    v.add('a');
    v.add(0,"World");
    for(Object ele : v){
         System.out.println(ele);
    }

    System.out.println("Accessing: "+v.get(0));
      
    System.out.println("Removing: "+ v.remove(3));
    for(Object ele : v){
        System.out.println(ele);
   }

   System.out.println("remove: "+ v.remove("Hello"));
 }
}
