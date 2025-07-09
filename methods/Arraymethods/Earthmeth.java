class Earthmeth {
    static String asia[] = {"China", "India", "Japan"};
    static String africa[] = {"Nigeria", "Egypt", "South Africa"};
    static String northAmerica[] = {"United States", "Canada", "Mexico"};

    // Method to display Asian countries
    static void displayAsia() {
        System.out.println("Asia:");
        for (String country : asia) {
            System.out.println(country);
        }
    }

    // Method to display African countries
    static void displayAfrica() {
        System.out.println("Africa:");
        for (String country : africa) {
            System.out.println(country);
        }
    }

    // Method to display North American countries
    static void displayNorthAmerica() {
        System.out.println("North America:");
        for (String country : northAmerica) {
            System.out.println(country);
        }
    }

    public static void main(String[] earth) {
        displayAsia();
        displayAfrica();
        displayNorthAmerica();
    }
}
