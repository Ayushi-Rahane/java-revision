
public class single {
    public static void main(String[] args){
      /*Single inheritance
       *  Base Class
       *      |
       *   Derived class
       * 
       *multiple 
          base class
   d1 d2 d3
       */

       DerivedClass d = new DerivedClass();
       d.display1();
       d.display2();

    }

}
class BaseClass{
    void display1(){
      System.out.println("It is Base Class");
    }
}

class DerivedClass extends BaseClass{
    void display2(){
        System.out.println("It is Derived class");
    }
}
