public class overrinding {
    public static void main(String[] args){
        DerivedClass d = new DerivedClass();
        BaseClass b = new BaseClass();

        b.A();
        d.A();
        d.B();

    }
}

class BaseClass{
    public void A(){
        System.out.println("I'm Apple");
    }
    public void B(){
        System.out.println("I'm Fruit");
    }
}

class DerivedClass extends BaseClass{
    public void A(){
        System.out.println("I'm Dog");
    }
}

/*
 * I'm Dog
 * I'm Dog
 * I'm Fruit
 */
