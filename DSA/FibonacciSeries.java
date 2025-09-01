class FibonacciSeries {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter the number of terms while running the program.");
            System.out.println("Example: java FibonacciSeries 10");
            return;
        }

        // Taking input from user at runtime
        int n = Integer.parseInt(args[0]);  
        int a = 0, b = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
