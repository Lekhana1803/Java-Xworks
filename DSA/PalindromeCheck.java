/*class PalindromeCheck {
    public static void main(String[] args) {
        int num = 121;  // change value to test
        int temp = num, rev = 0;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (num == rev)
            System.out.println(num + " is a Palindrome.");
        else
            System.out.println(num + " is NOT a Palindrome.");
    }
}  */

class PalindromeCheck {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a number while running the program.");
            System.out.println("Example: java PalindromeCheck 121");
            return;
        }

        // Taking number from user at runtime
        int num = Integer.parseInt(args[0]);  
        int temp = num, rev = 0;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (num == rev)
            System.out.println(num + " is a Palindrome.");
        else
            System.out.println(num + " is NOT a Palindrome.");
    }
}
