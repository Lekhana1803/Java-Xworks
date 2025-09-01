public class ReverseWithoutLoop {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as command line argument.");
            return;
        }

        String str = args[0]; // take first argument
        String reversed = reverse(str);

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }

    // Recursive function to reverse string
    static String reverse(String s) {
        if (s.isEmpty()) {
            return s;  // base case
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
