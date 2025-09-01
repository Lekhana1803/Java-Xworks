public class CountChars {
    public static void main(String[] args) {
        String s = System.console().readLine("Enter a string: ");

        int vowels = 0, consonants = 0, digits = 0, whitespaces = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ' || c == '\t') {
                whitespaces++;
            } else if (c >= '0' && c <= '9') {
                digits++;
            } else {
                char lower = (c >= 'A' && c <= 'Z') ? (char)(c + 32) : c;

                if (lower >= 'a' && lower <= 'z') {
                    if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }
        }

        System.out.println("\nString: \"" + s + "\"");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Whitespaces: " + whitespaces);
    }
}
