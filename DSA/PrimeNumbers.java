public class PrimeNumbers {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine("Enter the limit: "));

        System.out.print("Prime numbers between 1 and " + n + ": ");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
