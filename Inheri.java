class grand_parent{

    void fun1(){

        System.out.println("Grand Parent Class");

    }

}

class parent{

    void fun2(){

        System.out.println("Parent Class");

    }

}
class child extends grand_parent {

    void fun3(){

        System.out.println("Child Class");
    }
}


public class Inheri {
    
    public static void main(String[] args) {
        
        child obj = new child();
        parent obj2 = new parent();

        obj.fun1(); //grand parent class
        obj2.fun2(); //parent class
        obj.fun3(); //child class

    }
}







