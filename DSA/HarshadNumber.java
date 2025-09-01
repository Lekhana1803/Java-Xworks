public class HarshadNumber {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine("Enter a number: "));
        int temp = n, sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (n % sum == 0) {
            System.out.println(n + " is a Harshad number.");
        } else {
            System.out.println(n + " is not a Harshad number.");
        }
    }
}
