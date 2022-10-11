public class Set_Get {

    private static String name;

    static void setter(String o){

        name = o;
    }

    static String getter(){

        return name;
    }

    
    public static void main(String[] args) {
        
          Set_Get.setter("Welcome");
          System.out.println(Set_Get.getter());
        
    }


}
