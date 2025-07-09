class PeriodicTablemeth {
    static String elements[] = {
        "Hydrogen (H)", "Helium (He)", "Lithium (Li)", "Beryllium (Be)",
        "Boron (B)", "Carbon (C)", "Nitrogen (N)", "Oxygen (O)",
        "Fluorine (F)", "Neon (Ne)", "Sodium (Na)", "Magnesium (Mg)"
    };

    // Method to display periodic table elements
    static void displayElements() {
        System.out.println("Elements of the Periodic Table:");
        for (String element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String[] periodic) {
        displayElements(); // Calling the method
    }
}
