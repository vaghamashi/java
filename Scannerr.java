import java.util.Scanner;

public class Scannerr{

    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Value : ");
        String c = sc.nextLine();
       
        System.out.print("Enter Value : ");
        int a = sc.nextInt();

        System.out.print("Enter Value : ");
        char b = sc.next().charAt(0);

        System.out.print("Enter Value : ");
        long d = sc.nextLong();

        System.out.print("Enter Value : ");
        float e = sc.nextFloat();

        System.out.print("Enter Value : ");
        double f = sc.nextDouble();


        System.out.println("Int :- "+a);
        System.out.println("Char :- "+b);
        System.out.println("String :-"+c);
        System.out.println("Long :- "+d);
        System.out.println("Float :- "+e);
        System.out.println("Double :- "+f);

    }


}