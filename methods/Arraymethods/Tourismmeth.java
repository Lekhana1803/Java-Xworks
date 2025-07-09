class Tourismmeth {
    static String heritageCities[] = {"Agra", "Jaipur", "Delhi"};
    static String mountainDestinations[] = {"Shimla", "Manali", "Darjeeling"};
    static String hillStations[] = {"Kodaikanal", "Coorg", "Munnar"};
    static String beachGetaways[] = {"Goa", "Alleppey", "Andaman & Nicobar"};
    static String spiritualSites[] = {"Varanasi", "Rishikesh", "Golden Temple"};

    // Method to display Heritage Cities
    static void displayHeritageCities() {
        System.out.println("Heritage Cities:");
        for (String city : heritageCities) {
            System.out.println(city);
        }
    }

    // Method to display Mountain Destinations
    static void displayMountainDestinations() {
        System.out.println("\nMountain Destinations:");
        for (String place : mountainDestinations) {
            System.out.println(place);
        }
    }

    // Method to display Hill Stations
    static void displayHillStations() {
        System.out.println("\nHill Stations:");
        for (String hill : hillStations) {
            System.out.println(hill);
        }
    }

    // Method to display Beach Getaways
    static void displayBeachGetaways() {
        System.out.println("\nBeach Getaways:");
        for (String beach : beachGetaways) {
            System.out.println(beach);
        }
    }

    // Method to display Spiritual Sites
    static void displaySpiritualSites() {
        System.out.println("\nSpiritual Sites:");
        for (String site : spiritualSites) {
            System.out.println(site);
        }
    }

    public static void main(String[] tourism) {
        displayHeritageCities();
        displayMountainDestinations();
        displayHillStations();
        displayBeachGetaways();
        displaySpiritualSites();
    }
}
