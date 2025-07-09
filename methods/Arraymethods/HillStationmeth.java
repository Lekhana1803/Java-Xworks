class HillStationmeth {
    static String resortNames[] = {
        "JW Marriott Walnut Grove", "Ananda in the Himalayas", "Club Mahindra Munnar",
        "Taj Madikeri Resort & Spa", "Mountain View Hideaway", "Blue Mountain Resort",
        "Serenity Valley Wayanad"
    };

    static String rooms[] = {
        "Deluxe Room", "Spa Suite", "Heritage Cottage",
        "Treehouse", "Valley View Cottage", "Luxury Villa", "Premium Suite"
    };

    // Method to display resort names
    static void displayResorts() {
        System.out.println("Resorts:");
        for (String resort : resortNames) {
            System.out.println(resort);
        }
    }

    // Method to display room types
    static void displayRooms() {
        System.out.println("\nRooms:");
        for (String room : rooms) {
            System.out.println(room);
        }
    }

    public static void main(String[] hillstation) {
        displayResorts();  // Call to display resort names
        displayRooms();    // Call to display room types
    }
}
