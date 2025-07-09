class SpiceShopmeth {
    static String spicyPowder[] = {"Red Chili Powder", "Cayenne Pepper", "Paprika"};
    static String aromaticSpices[] = {"Cumin", "Coriander", "Cardamom"};
    static String exoticSpices[] = {"Saffron", "Turmeric", "Star Anise"};

    // Method to display spicy powders
    static void displaySpicyPowder() {
        System.out.println("Spicy Powder:");
        for (String item : spicyPowder) {
            System.out.println(item);
        }
    }

    // Method to display aromatic spices
    static void displayAromaticSpices() {
        System.out.println("Aromatic Spices:");
        for (String item : aromaticSpices) {
            System.out.println(item);
        }
    }

    // Method to display exotic spices
    static void displayExoticSpices() {
        System.out.println("Exotic Spices:");
        for (String item : exoticSpices) {
            System.out.println(item);
        }
    }

    public static void main(String[] spice) {
        displaySpicyPowder();
        displayAromaticSpices();
        displayExoticSpices();
    }
}
