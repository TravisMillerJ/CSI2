import java.util.Scanner;

class Fib {
    public static void main(String[] args) {
        int firstTerm = 0; 
        int secondTerm = 1;
        int firstArg;

        if (args.length > 0) {
            try {
                firstArg = Integer.parseInt(args[0]);
                int n = firstArg;
                for (int i = 1; i <= n; ++i) {
                    System.out.print(firstTerm + " ");
          
                
                    int nextTerm = firstTerm + secondTerm;
                    firstTerm = secondTerm;
                    secondTerm = nextTerm;
              }
            } 
            catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
    }
  }
