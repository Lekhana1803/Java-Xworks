public class LargestSmallestDigit {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine("Enter a number: "));
        int largest = 0, smallest = 9;

        while (n > 0) {
            int digit = n % 10;
            if (digit > largest) largest = digit;
            if (digit < smallest) smallest = digit;
            n /= 10;
        }

        System.out.println("Largest digit = " + largest);
        System.out.println("Smallest digit = " + smallest);
    }
}
