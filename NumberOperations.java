import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        if(operator.equals("+")){
            int sum = n1 + n2;
            System.out.printf("%d + %d = %d - %s", n1, n2, sum, (sum % 2 == 0 ? "even" : "odd"));
        }
        else if(operator.equals("-")){
            int lilSum = n1 - n2;
            System.out.printf("%d - %d = %d - %s", n1, n2, lilSum, lilSum % 2 == 0 ? "even" : "odd");
        }
        else if(operator.equals("*")){
            int mult = n1 * n2;
            System.out.printf("%d * %d = %d - %s", n1, n2, mult, mult % 2 == 0 ? "even" : "odd");
        }
        else if(operator.equals("%")){
            if(n2 <= 0){
                System.out.printf("Cannot divide %d by zero", n1);
            }
            else {
                int result = n1 % n2;
                System.out.printf("%d % %d = %d", n1, n2, result);
            }
        }
        else{
            if(n2 == 0){
                System.out.printf("Cannot divide %d by zero", n1);
            }
            else{
                double result = (1.0 * n1) / n2;
                System.out.printf("%d / %d = %.2f", n1, n2, result);
            }
        }
    }
}
