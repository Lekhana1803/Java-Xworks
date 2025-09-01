public class DuplicateCharacters {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as input.");
            return;
        }

        String str = args[0].toLowerCase();
        int[] freq = new int[256]; // ASCII characters

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        System.out.println("Duplicate characters in the string:");

        // Print characters with frequency > 1
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                System.out.println((char) i + " - " + freq[i] + " times");
            }
        }
    }
}
