public class ArmstrongCheck {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(System.console().readLine());
        int originalNum = num;
        int result = 0;
        int n = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, n);
            num /= 10;
        }

        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number.");
        }
    }
}
