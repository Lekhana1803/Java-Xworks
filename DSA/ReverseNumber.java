class ReverseNumber {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a number while running the program.");
            System.out.println("Example: java ReverseNumber 1234");
            return;
        }

        // Taking number from user at runtime
        int num = Integer.parseInt(args[0]);  
        int rev = 0, temp = num;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        System.out.println("Reversed number of " + num + " = " + rev);
    }
}
