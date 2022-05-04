import java.util.Scanner;


public class EuclidsAlgorithm {
    
    public static int euclid(int num1, int num2) {
        
        while(num2 != 0) {
            int r = num1 % num2;
            num1 = num2;
            num2 = r;
        }
        return num1;
    }
    

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String input1;
        String input2;
        int num1 = 0;
        int num2 = 0;

        boolean validInput = false;

        do {
            System.out.println("Please enter the first number");
            input1 = scanner.nextLine();
            System.out.println("Please enter the second number");
            input2 = scanner.nextLine();
            try {
                num1 = Integer.parseInt(input1);
                num2 = Integer.parseInt(input2); 
                validInput = true;
            } catch(NumberFormatException e) {
                  System.out.println("Please enter integers");
            }
        } while(!validInput);

        int result = euclid(num1, num2);
        System.out.println("Greatest Common Divisor of " + 
            num1 + " and " + num2 + " is " + result);
    }
}
