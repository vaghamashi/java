class Outer{

    int num = 456;

    public class Inner{

        void get(){

            System.out.println("Inner Class");

        }

    }
}

public class Example {
    
    public static void main(String[] args) {

        Outer obj = new Outer();

        System.out.println(""+obj.num);
    
   // method 1    Outer.Inner obj2 = new Outer().new Inner();
  // method 2      Outer.Inner obj2 = obj.new Inner();
    
   //     obj2.get();

    }
}
