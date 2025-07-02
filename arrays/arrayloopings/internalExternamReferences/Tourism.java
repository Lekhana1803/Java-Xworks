class Tourism {

    // Tourist Places
    static String place1 = "Goa";
    static String place2 = "Manali";
    static String place3 = "Shimla";
    static String place4 = "Ooty";
    static String place5 = "Mysore";
    static String place6 = "Ladakh";
    static String place7 = "Jaipur";
    static String place8 = "Udaipur";
    static String place9 = "Coorg";
    static String place10 = "Kodaikanal";
    static String place11 = "Rishikesh";
    static String place12 = "Darjeeling";
    static String place13 = "Agra";
    static String place14 = "Hampi";
    static String place15 = "Kerala";
    static String[] touristPlaces = {
        place1, place2, place3, place4, place5,
        place6, place7, place8, place9, place10,
        place11, place12, place13, place14, place15
    };

    // Hill Stations
    static String hill1 = "Manali";
    static String hill2 = "Nainital";
    static String hill3 = "Munnar";
    static String hill4 = "Mussoorie";
    static String hill5 = "Gulmarg";
    static String hill6 = "Coonoor";
    static String hill7 = "Dalhousie";
    static String hill8 = "Shillong";
    static String[] hillStations = {
        hill1, hill2, hill3, hill4,
        hill5, hill6, hill7, hill8
    };

    // Beaches
    static String beach1 = "Goa";
    static String beach2 = "Varkala";
    static String beach3 = "Gokarna";
    static String beach4 = "Pondicherry";
    static String beach5 = "Marina";
    static String beach6 = "Alappuzha";
    static String beach7 = "Kovalam";
    static String beach8 = "Diu";
    static String[] beaches = {
        beach1, beach2, beach3, beach4,
        beach5, beach6, beach7, beach8
    };

    // Temples
    static String temple1 = "Tirupati";
    static String temple2 = "Madurai";
    static String temple3 = "Rameshwaram";
    static String temple4 = "Kashi Vishwanath";
    static String temple5 = "Jagannath";
    static String temple6 = "Somnath";
    static String temple7 = "Vaishno Devi";
    static String temple8 = "Meenakshi";
    static String[] temples = {
        temple1, temple2, temple3, temple4,
        temple5, temple6, temple7, temple8
    };

    // Heritage Sites
    static String heritage1 = "Hampi";
    static String heritage2 = "Khajuraho";
    static String heritage3 = "Fatehpur Sikri";
    static String heritage4 = "Qutub Minar";
    static String heritage5 = "Ajanta Caves";
    static String heritage6 = "Ellora Caves";
    static String heritage7 = "Konark";
    static String heritage8 = "Sanchi Stupa";
    static String[] heritageSites = {
        heritage1, heritage2, heritage3, heritage4,
        heritage5, heritage6, heritage7, heritage8
    };

    // Wildlife Sanctuaries
    static String sanctuary1 = "Jim Corbett";
    static String sanctuary2 = "Bandipur";
    static String sanctuary3 = "Kaziranga";
    static String sanctuary4 = "Sundarbans";
    static String sanctuary5 = "Gir";
    static String sanctuary6 = "Periyar";
    static String sanctuary7 = "Nagarhole";
    static String sanctuary8 = "Ranthambore";
    static String[] wildlifeSanctuaries = {
        sanctuary1, sanctuary2, sanctuary3, sanctuary4,
        sanctuary5, sanctuary6, sanctuary7, sanctuary8
    };

    // National Parks
    static String park1 = "Ranthambore";
    static String park2 = "Kanha";
    static String park3 = "Bandhavgarh";
    static String park4 = "Sundarbans";
    static String park5 = "Kaziranga";
    static String park6 = "Jim Corbett";
    static String park7 = "Gir";
    static String park8 = "Manas";
    static String[] nationalParks = {
        park1, park2, park3, park4,
        park5, park6, park7, park8
    };

    // Rivers
    static String river1 = "Ganga";
    static String river2 = "Yamuna";
    static String river3 = "Brahmaputra";
    static String river4 = "Godavari";
    static String river5 = "Krishna";
    static String river6 = "Kaveri";
    static String river7 = "Narmada";
    static String river8 = "Tapti";
    static String[] rivers = {
        river1, river2, river3, river4,
        river5, river6, river7, river8
    };

    public static void main(String[] args) {
        System.out.println("Tourist Places:");
        for (String place : touristPlaces) {
            System.out.println(place);
        }

        System.out.println("\nHill Stations:");
        for (String place : hillStations) {
            System.out.println(place);
        }

        System.out.println("\nBeaches:");
        for (String place : beaches) {
            System.out.println(place);
        }

        System.out.println("\nTemples:");
        for (String place : temples) {
            System.out.println(place);
        }

        System.out.println("\nHeritage Sites:");
        for (String place : heritageSites) {
            System.out.println(place);
        }

        System.out.println("\nWildlife Sanctuaries:");
        for (String place : wildlifeSanctuaries) {
            System.out.println(place);
        }

        System.out.println("\nNational Parks:");
        for (String place : nationalParks) {
            System.out.println(place);
        }

        System.out.println("\nRivers:");
        for (String place : rivers) {
            System.out.println(place);
        }
    }
}
