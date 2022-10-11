class grand_parent{

    void fun(){

        System.out.println("Grand Parent Class");

    }

}

class parent extends grand_parent{
    

    void fun(){

        System.out.println("Parent Class");

    }

    void data(){

        fun();
        super.fun();
       
    }

}

public class keyword_super {
    
    public static void main(String[] args) {
        
       parent obj = new parent();

       obj.data();

    }
}







