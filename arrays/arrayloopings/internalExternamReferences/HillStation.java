class HillStation {

    // Resorts
    static String resort1 = "The Himalayan";
    static String resort2 = "Sterling Ooty";
    static String resort3 = "Club Mahindra Coorg";
    static String resort4 = "Leh Palace Resort";
    static String resort5 = "Manali Heights";
    static String[] resorts = {
        resort1, resort2, resort3, resort4, resort5
    };

    // Famous Places
    static String place1 = "Rohtang Pass";
    static String place2 = "Doddabetta";
    static String place3 = "Munnar Tea Gardens";
    static String place4 = "Gulmarg";
    static String place5 = "Pine Forest";
    static String place6 = "Tawang Monastery";
    static String place7 = "Auli Slopes";
    static String[] famousPlaces = {
        place1, place2, place3, place4,
        place5, place6, place7
    };

    // Local Foods
    static String food1 = "Momos";
    static String food2 = "Thukpa";
    static String food3 = "Rajma Chawal";
    static String food4 = "Churpi Soup";
    static String food5 = "Madua Roti";
    static String food6 = "Kullu Trout";
    static String food7 = "Bamboo Shoot Curry";
    static String food8 = "Siddu";
    static String[] localFoods = {
        food1, food2, food3, food4,
        food5, food6, food7, food8
    };

    // Scenic Views
    static String view1 = "Snow Peaks";
    static String view2 = "Tea Estates";
    static String view3 = "Waterfalls";
    static String view4 = "Valleys";
    static String view5 = "Sunrise Points";
    static String view6 = "Cloud Beds";
    static String view7 = "Pine Forests";
    static String view8 = "Lake Views";
    static String[] scenicViews = {
        view1, view2, view3, view4,
        view5, view6, view7, view8
    };

    // Adventure Activities
    static String activity1 = "Trekking";
    static String activity2 = "Paragliding";
    static String activity3 = "River Rafting";
    static String activity4 = "Skiing";
    static String activity5 = "Zip Lining";
    static String activity6 = "Rock Climbing";
    static String activity7 = "Camping";
    static String activity8 = "ATV Rides";
    static String[] adventureActivities = {
        activity1, activity2, activity3, activity4,
        activity5, activity6, activity7, activity8
    };

    // Local Markets
    static String market1 = "Mall Road Manali";
    static String market2 = "Tibetan Market";
    static String market3 = "Ooty Market";
    static String market4 = "MG Road Gangtok";
    static String market5 = "Darjeeling Bazaar";
    static String market6 = "Leh Market";
    static String[] localMarkets = {
        market1, market2, market3, market4,
        market5, market6
    };

    // Hill Flowers
    static String flower1 = "Rhododendron";
    static String flower2 = "Primrose";
    static String flower3 = "Edelweiss";
    static String flower4 = "Himalayan Blue Poppy";
    static String flower5 = "Daisy";
    static String flower6 = "Sunflower";
    static String flower7 = "Lavender";
    static String flower8 = "Marigold";
    static String[] hillFlowers = {
        flower1, flower2, flower3, flower4,
        flower5, flower6, flower7, flower8
    };

    // Treks
    static String trek1 = "Triund Trek";
    static String trek2 = "Valley of Flowers";
    static String trek3 = "Kedarkantha";
    static String trek4 = "Hampta Pass";
    static String trek5 = "Sandakphu";
    static String trek6 = "Dzongri Trek";
    static String trek7 = "Roopkund";
    static String trek8 = "Tarsar Marsar";
    static String[] treks = {
        trek1, trek2, trek3, trek4,
        trek5, trek6, trek7, trek8
    };

    public static void main(String[] args) {
        System.out.println("Resorts:");
        for (String item : resorts) {
            System.out.println(item);
        }

        System.out.println("\nFamous Places:");
        for (String item : famousPlaces) {
            System.out.println(item);
        }

        System.out.println("\nLocal Foods:");
        for (String item : localFoods) {
            System.out.println(item);
        }

        System.out.println("\nScenic Views:");
        for (String item : scenicViews) {
            System.out.println(item);
        }

        System.out.println("\nAdventure Activities:");
        for (String item : adventureActivities) {
            System.out.println(item);
        }

        System.out.println("\nLocal Markets:");
        for (String item : localMarkets) {
            System.out.println(item);
        }

        System.out.println("\nHill Flowers:");
        for (String item : hillFlowers) {
            System.out.println(item);
        }

        System.out.println("\nTreks:");
        for (String item : treks) {
            System.out.println(item);
        }
    }
}
