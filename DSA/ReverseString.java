public class ReverseStringFor {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string to reverse.");
            return;
        }

        String str = args[0];
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("Reversed String: " + rev);
    }
}
