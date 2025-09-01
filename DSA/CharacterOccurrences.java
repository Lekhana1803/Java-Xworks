public class CharacterOccurrences {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as input.");
            return;
        }

        String str = args[0].replace(" ", "").toLowerCase();
        int[] freq = new int[256]; // ASCII

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        System.out.println("Occurrences of each character:");

        // Print non-zero frequencies
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " - " + freq[i]);
            }
        }
    }
}
