import java.util.Scanner;



public class Reverse {
    public static void main(String[] args) throws Exception {
        String word;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose something to Reverse.");
        word = scanner.nextLine();
        System.out.println("Your reversed word is "+new StringBuilder(word).reverse().toString());
        
    }
    
}
