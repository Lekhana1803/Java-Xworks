class Citymeth {
    static String cityNames[] = {
        "Agra", "Delhi", "Jaipur", "Bengaluru", "Chennai", "Coimbatore",
        "Kolkata", "Patna", "Bhubaneswar", "Ahmedabad", "Surat", "Hyderabad", "Mumbai"
    };

    static int cityPincodes[] = {
        282001, 110001, 303001, 560001, 600001, 641001,
        700001, 800001, 751001, 380001, 395001, 500001, 400001
    };

    static void displayCityPincodes() {
        System.out.println("City Pincode:");
        for (int i = 0; i < cityNames.length; i++) {
            System.out.println(cityNames[i] + "  " + cityPincodes[i]);
        }
    }

    public static void main(String[] args) {
        displayCityPincodes();  
    }
}
