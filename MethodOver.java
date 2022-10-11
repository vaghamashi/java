public class MethodOver {
    
    int display(int a , int b){

        return a+b;
    }

    int display(int a , int b , int c){

        return a*b*c;
    }

    int display(int a , int b , int c , int d){

        return a-b-c-d;
    }

    public static void main(String[] args) {
        
        MethodOver obj = new MethodOver();

        System.out.println(obj.display(45, 55));
        System.out.println(obj.display(50, 100, 10));
        System.out.println(obj.display(1000, 500, 250, 199));

    }
}





