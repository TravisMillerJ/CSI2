import java.util.Scanner;
import java.lang.Math;


public class NumberConverter {
    public static void main(String[] args) throws Exception {
        double number;
        String conversion;
        
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to Convert some metric to imperial systems or vice-versa. If so type yes, if no type exit");
        conversion = scanner.nextLine();
        while (!"exit".equals(conversion) ) {
            double total;
            total = 0.0;
            System.out.println("Please choose what to convert from and too. (Kg to Lbs, Lbs to Kg, C to F, or F to C. If you wish to close the program type exit)");
            conversion = scanner.nextLine();
            if("exit".equals(conversion)){
                break;
            }
            
            System.out.println("Please input a number to convert");
            number = scanner.nextFloat();

            if("Kg to Lbs".equals(conversion)){
                total = (number * 2.2046);
                System.out.println("Your total Kg to Lbs is " + (double) Math.round(total * 100) / 100);
                System.out.println("Please choose what to convert from and too. (Kg to Lbs, Lbs to Kg, C to F, or F to C. If you wish to close the program type exit)");
                conversion = scanner.nextLine();
            }
            else if("Lbs to Kg".equals(conversion)){
                total = (number/2.2046);
                System.out.println("Your total Lbs to Kg is " + (double) Math.round(total * 100) / 100);
                System.out.println("Please choose what to convert from and too. (Kg to Lbs, Lbs to Kg, C to F, or F to C. If you wish to close the program type exit)");
                conversion = scanner.nextLine();
            }
            else if("C to F".equals(conversion)){
                total = ((number*1.8000)+32.000);
                System.out.println("Your total C to F is " + (double) Math.round(total * 100) / 100);
                System.out.println("Please choose what to convert from and too. (Kg to Lbs, Lbs to Kg, C to F, or F to C. If you wish to close the program type exit)");
                conversion = scanner.nextLine();
            }
            else if("F to C".equals(conversion)){
                total = ((number/1.8000)-32.000);
                System.out.println("Your total F to c is " + (double) Math.round(total * 100) / 100);
                System.out.println("Please choose what to convert from and too. (Kg to Lbs, Lbs to Kg, C to F, or F to C. If you wish to close the program type exit)");
                conversion = scanner.nextLine();
            }
            else if("exit".equals(conversion)){
                break;
            }



        }
        scanner.close();
        


        
    }
}
