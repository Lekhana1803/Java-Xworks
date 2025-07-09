class JuiceShopmeth {
    static String orangeJuice[] = {"Orange Juice", "Sunny Orange", "Tangerine Twist"};
    static String appleJuice[] = {"Apple Juice", "Fresh Apple", "Honeycrisp Juice"};
    static String grapeJuice[] = {"Grape Juice", "Concord Grape", "White Grape"};

    // Method to display orange juices
    static void displayOrangeJuices() {
        System.out.println("Orange Juices:");
        for (String juice : orangeJuice) {
            System.out.println(juice);
        }
    }

    // Method to display apple juices
    static void displayAppleJuices() {
        System.out.println("Apple Juices:");
        for (String juice : appleJuice) {
            System.out.println(juice);
        }
    }

    // Method to display grape juices
    static void displayGrapeJuices() {
        System.out.println("Grape Juices:");
        for (String juice : grapeJuice) {
            System.out.println(juice);
        }
    }

    public static void main(String[] juice33) {
        displayOrangeJuices();
        displayAppleJuices();
        displayGrapeJuices();
    }
}
