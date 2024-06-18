

public class interface_ {
   public static void main(String[] args){
    derivedClass d = new derivedClass();
    d.cat();
    d.dog();
    d.coconut();
   }    
}

interface Animal{  //base 1
   void dog();
   void cat();
}

interface Plants{ // base 2
   void coconut();
}

class derivedClass implements Animal, Plants{ // derived 1 
   public void dog(){
      System.out.println("I'm dog");
   }

   public void cat(){
      System.out.println("I'm cat");
   }

   public void coconut(){
      System.out.println("Coconut tree");
   }

}