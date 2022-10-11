public class arthimatic  
{  
    void divide(int a, int b)  { 
        
        try{

            int res = a / b;  
      
            System.out.println("Result came after division is: " + res); 

        }
        catch(Exception obj){

            System.out.println(""+obj.getMessage());
        }
 
         
    }  
  
 
    public static void main(String argvs[])  {  

        arthimatic obj = new arthimatic();  
        obj.divide(10, 0);  
    }  
}  