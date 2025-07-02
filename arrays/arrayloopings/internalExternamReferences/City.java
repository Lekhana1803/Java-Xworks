class City {

    // Pin Codes
    static String pin1 = "560001";
    static String pin2 = "110001";
    static String pin3 = "400001";
    static String pin4 = "700001";
    static String pin5 = "600001";
    static String pin6 = "500001";
    static String pin7 = "380001";
    static String pin8 = "302001";
    static String[] pinCodes = {
        pin1, pin2, pin3, pin4,
        pin5, pin6, pin7, pin8
    };

    // Area Names
    static String area1 = "Indiranagar";
    static String area2 = "Connaught Place";
    static String area3 = "Bandra";
    static String area4 = "Salt Lake";
    static String area5 = "T. Nagar";
    static String area6 = "Banjara Hills";
    static String area7 = "Navrangpura";
    static String area8 = "Vaishali Nagar";
    static String[] areaNames = {
        area1, area2, area3, area4,
        area5, area6, area7, area8
    };

    // Landmarks
    static String landmark1 = "Lalbagh";
    static String landmark2 = "India Gate";
    static String landmark3 = "Marine Drive";
    static String landmark4 = "Victoria Memorial";
    static String landmark5 = "Marina Beach";
    static String landmark6 = "Charminar";
    static String landmark7 = "Sabarmati Ashram";
    static String landmark8 = "Hawa Mahal";
    static String[] landmarks = {
        landmark1, landmark2, landmark3, landmark4,
        landmark5, landmark6, landmark7, landmark8
    };

    // Metro Stations
    static String metro1 = "MG Road";
    static String metro2 = "Rajiv Chowk";
    static String metro3 = "Churchgate";
    static String metro4 = "Esplanade";
    static String metro5 = "Washermanpet";
    static String metro6 = "Ameerpet";
    static String metro7 = "Kalupur";
    static String metro8 = "Chandpole";
    static String[] metroStations = {
        metro1, metro2, metro3, metro4,
        metro5, metro6, metro7, metro8
    };

    // Malls
    static String mall1 = "Orion Mall";
    static String mall2 = "Select Citywalk";
    static String mall3 = "Phoenix Mall";
    static String mall4 = "South City Mall";
    static String mall5 = "Express Avenue";
    static String mall6 = "GVK Mall";
    static String mall7 = "Ahmedabad One";
    static String mall8 = "Triton Mall";
    static String[] malls = {
        mall1, mall2, mall3, mall4,
        mall5, mall6, mall7, mall8
    };

    // Rivers
    static String river1 = "Arkavathi";
    static String river2 = "Yamuna";
    static String river3 = "Mithi";
    static String river4 = "Hooghly";
    static String river5 = "Cooum";
    static String river6 = "Musi";
    static String river7 = "Sabarmati";
    static String river8 = "Banas";
    static String[] rivers = {
        river1, river2, river3, river4,
        river5, river6, river7, river8
    };

    // Lakes
    static String lake1 = "Ulsoor Lake";
    static String lake2 = "Sanjay Lake";
    static String lake3 = "Powai Lake";
    static String lake4 = "Rabindra Sarobar";
    static String lake5 = "Chetpet Lake";
    static String lake6 = "Hussain Sagar";
    static String lake7 = "Kankaria Lake";
    static String lake8 = "Man Sagar Lake";
    static String[] lakes = {
        lake1, lake2, lake3, lake4,
        lake5, lake6, lake7, lake8
    };

    // Airports
    static String airport1 = "Kempegowda Airport";
    static String airport2 = "Indira Gandhi Airport";
    static String airport3 = "Chhatrapati Shivaji Airport";
    static String[] airports = {
        airport1, airport2, airport3
    };

    public static void main(String[] args) {
        System.out.println("Pin Codes:");
        for (String item : pinCodes) {
            System.out.println(item);
        }

        System.out.println("\nArea Names:");
        for (String item : areaNames) {
            System.out.println(item);
        }

        System.out.println("\nLandmarks:");
        for (String item : landmarks) {
            System.out.println(item);
        }

        System.out.println("\nMetro Stations:");
        for (String item : metroStations) {
            System.out.println(item);
        }

        System.out.println("\nMalls:");
        for (String item : malls) {
            System.out.println(item);
        }

        System.out.println("\nRivers:");
        for (String item : rivers) {
            System.out.println(item);
        }

        System.out.println("\nLakes:");
        for (String item : lakes) {
            System.out.println(item);
        }

        System.out.println("\nAirports:");
        for (String item : airports) {
            System.out.println(item);
        }
    }
}
