class A{

    void display(){

        System.out.println("Class A");
    }


}

class B extends A{

    void display(){

        System.out.println("Class B");
    }

}


public class MethodOveride {

    public static void main(String[] args) {
        
        A obj1 = new A();
        B obj2 = new B();
      

        obj1.display();
        obj2.display();

    }
    
}
