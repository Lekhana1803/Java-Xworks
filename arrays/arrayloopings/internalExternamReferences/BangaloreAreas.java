class BangaloreAreas {

    // Central Bangalore
    static String central1 = "MG Road";
    static String central2 = "Brigade Road";
    static String central3 = "Shivaji Nagar";
    static String central4 = "Vasanth Nagar";
    static String central5 = "Cubbon Park";
    static String central6 = "Richmond Town";
    static String central7 = "Ulsoor";
    static String central8 = "Shanti Nagar";
    static String[] centralBangalore = {
        central1, central2, central3, central4,
        central5, central6, central7, central8
    };

    // North Bangalore
    static String north1 = "Hebbal";
    static String north2 = "Yelahanka";
    static String north3 = "Jakkur";
    static String north4 = "Sahakar Nagar";
    static String north5 = "RT Nagar";
    static String north6 = "Kodigehalli";
    static String north7 = "Amruthahalli";
    static String north8 = "Thanisandra";
    static String[] northBangalore = {
        north1, north2, north3, north4,
        north5, north6, north7, north8
    };

    // South Bangalore
    static String south1 = "JP Nagar";
    static String south2 = "Banashankari";
    static String south3 = "Basavanagudi";
    static String south4 = "Jayanagar";
    static String south5 = "BTM Layout";
    static String south6 = "Kumaraswamy Layout";
    static String south7 = "Padmanabhanagar";
    static String south8 = "Konanakunte";
    static String[] southBangalore = {
        south1, south2, south3, south4,
        south5, south6, south7, south8
    };

    // East Bangalore
    static String east1 = "Indiranagar";
    static String east2 = "Marathahalli";
    static String east3 = "KR Puram";
    static String east4 = "Whitefield";
    static String east5 = "CV Raman Nagar";
    static String east6 = "Ramamurthy Nagar";
    static String east7 = "Bellandur";
    static String east8 = "Mahadevapura";
    static String[] eastBangalore = {
        east1, east2, east3, east4,
        east5, east6, east7, east8
    };

    // West Bangalore
    static String west1 = "Rajajinagar";
    static String west2 = "Vijayanagar";
    static String west3 = "Nagarbhavi";
    static String west4 = "Magadi Road";
    static String west5 = "Kengeri";
    static String west6 = "Kamakhya";
    static String west7 = "Chandra Layout";
    static String west8 = "Attiguppe";
    static String[] westBangalore = {
        west1, west2, west3, west4,
        west5, west6, west7, west8
    };

    // Tech Hubs
    static String tech1 = "Electronic City";
    static String tech2 = "Whitefield";
    static String tech3 = "Manyata Tech Park";
    static String tech4 = "Bagmane Tech Park";
    static String tech5 = "EGL";
    static String tech6 = "Peenya Industrial Area";
    static String tech7 = "Rajajinagar IT Park";
    static String tech8 = "Global Village Tech Park";
    static String[] techHubs = {
        tech1, tech2, tech3, tech4,
        tech5, tech6, tech7, tech8
    };

    // Commercial Areas
    static String comm1 = "Koramangala";
    static String comm2 = "MG Road";
    static String comm3 = "Church Street";
    static String comm4 = "Commercial Street";
    static String comm5 = "Indiranagar 100ft Road";
    static String comm6 = "Brigade Road";
    static String comm7 = "Jayanagar 4th Block";
    static String comm8 = "Malleshwaram";
    static String[] commercialAreas = {
        comm1, comm2, comm3, comm4,
        comm5, comm6, comm7, comm8
    };

    // Residential Areas
    static String res1 = "HSR Layout";
    static String res2 = "Sarjapur Road";
    static String res3 = "Hennur";
    static String res4 = "Yelahanka New Town";
    static String res5 = "Bannerghatta Road";
    static String res6 = "Horamavu";
    static String res7 = "TC Palya";
    static String res8 = "Varthur";
    static String[] residentialAreas = {
        res1, res2, res3, res4,
        res5, res6, res7, res8
    };

    public static void main(String[] args) {
        System.out.println("Central Bangalore:");
        for (String area : centralBangalore) {
            System.out.println(area);
        }

        System.out.println("\nNorth Bangalore:");
        for (String area : northBangalore) {
            System.out.println(area);
        }

        System.out.println("\nSouth Bangalore:");
        for (String area : southBangalore) {
            System.out.println(area);
        }

        System.out.println("\nEast Bangalore:");
        for (String area : eastBangalore) {
            System.out.println(area);
        }

        System.out.println("\nWest Bangalore:");
        for (String area : westBangalore) {
            System.out.println(area);
        }

        System.out.println("\nTech Hubs:");
        for (String area : techHubs) {
            System.out.println(area);
        }

        System.out.println("\nCommercial Areas:");
        for (String area : commercialAreas) {
            System.out.println(area);
        }

        System.out.println("\nResidential Areas:");
        for (String area : residentialAreas) {
            System.out.println(area);
        }
    }
}
