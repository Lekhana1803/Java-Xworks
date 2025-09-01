public class FactorialLoop {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(System.console().readLine());
        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " = " + fact);
    }
} 