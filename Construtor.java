public class Construtor {

 
    Construtor(){

        System.out.println("Default Construtor");
    }

    Construtor(int book_id , String author , String title){

        System.out.println("String :- "+book_id);
        System.out.println("int :- "+author);

    }

    

    public static void main(String[] args) {
        
        Construtor obj1 = new Construtor();
        // Construtor obj2 = new Construtor("sahil",404);
        
    }
}