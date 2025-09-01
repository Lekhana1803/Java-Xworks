public class PerfectNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(System.console().readLine());
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is NOT a Perfect Number.");
        }
    }
}
