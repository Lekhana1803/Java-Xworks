class ChatShopmeth {
    static String paniPuri[] = {"Pani Puri", "Golgappa", "Phuchka"};
    static String bhelPuri[] = {"Classic Bhel Puri", "Corn Bhel", "Sev Batata Bhel"};
    static String sevPuri[] = {"Sev Puri", "Dahi Sev Puri", "Masala Sev Puri"};

    // Method to display pani puri items
    static void displayPaniPuriItems() {
        System.out.println("Pani Puri Items:");
        for (String item : paniPuri) {
            System.out.println(item);
        }
    }

    // Method to display bhel puri items
    static void displayBhelPuriItems() {
        System.out.println("Bhel Puri Items:");
        for (String item : bhelPuri) {
            System.out.println(item);
        }
    }

    // Method to display sev puri items
    static void displaySevPuriItems() {
        System.out.println("Sev Puri Items:");
        for (String item : sevPuri) {
            System.out.println(item);
        }
    }

    public static void main(String[] chats) {
        displayPaniPuriItems();   // Call to print pani puri items
        displayBhelPuriItems();   // Call to print bhel puri items
        displaySevPuriItems();    // Call to print sev puri items
    }
}
