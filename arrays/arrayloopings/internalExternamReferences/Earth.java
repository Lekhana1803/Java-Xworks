class Earth {

    // Continents
    static String cont1 = "Asia";
    static String cont2 = "Africa";
    static String cont3 = "North America";
    static String cont4 = "South America";
    static String cont5 = "Antarctica";
    static String cont6 = "Europe";
    static String cont7 = "Australia";
    static String[] continents = {
        cont1, cont2, cont3, cont4,
        cont5, cont6, cont7
    };

    // Asia
    static String asia1 = "India";
    static String asia2 = "China";
    static String asia3 = "Japan";
    static String asia4 = "Indonesia";
    static String asia5 = "Thailand";
    static String asia6 = "Vietnam";
    static String asia7 = "Malaysia";
    static String asia8 = "Philippines";
    static String[] asia = {
        asia1, asia2, asia3, asia4,
        asia5, asia6, asia7, asia8
    };

    // Africa
    static String africa1 = "Nigeria";
    static String africa2 = "Egypt";
    static String africa3 = "South Africa";
    static String africa4 = "Kenya";
    static String africa5 = "Ethiopia";
    static String africa6 = "Ghana";
    static String africa7 = "Morocco";
    static String africa8 = "Tanzania";
    static String[] africa = {
        africa1, africa2, africa3, africa4,
        africa5, africa6, africa7, africa8
    };

    // Europe
    static String europe1 = "Germany";
    static String europe2 = "France";
    static String europe3 = "Italy";
    static String europe4 = "Spain";
    static String europe5 = "UK";
    static String europe6 = "Netherlands";
    static String europe7 = "Sweden";
    static String europe8 = "Norway";
    static String[] europe = {
        europe1, europe2, europe3, europe4,
        europe5, europe6, europe7, europe8
    };

    // North America
    static String na1 = "USA";
    static String na2 = "Canada";
    static String na3 = "Mexico";
    static String na4 = "Cuba";
    static String na5 = "Jamaica";
    static String na6 = "Honduras";
    static String na7 = "Guatemala";
    static String na8 = "Panama";
    static String[] northAmerica = {
        na1, na2, na3, na4,
        na5, na6, na7, na8
    };

    // South America
    static String sa1 = "Brazil";
    static String sa2 = "Argentina";
    static String sa3 = "Colombia";
    static String sa4 = "Chile";
    static String sa5 = "Peru";
    static String sa6 = "Venezuela";
    static String sa7 = "Ecuador";
    static String sa8 = "Uruguay";
    static String[] southAmerica = {
        sa1, sa2, sa3, sa4,
        sa5, sa6, sa7, sa8
    };

    // Australia Region
    static String aus1 = "Australia";
    static String aus2 = "New Zealand";
    static String aus3 = "Fiji";
    static String aus4 = "Papua New Guinea";
    static String aus5 = "Samoa";
    static String aus6 = "Tonga";
    static String aus7 = "Vanuatu";
    static String aus8 = "Solomon Islands";
    static String[] australiaContinent = {
        aus1, aus2, aus3, aus4,
        aus5, aus6, aus7, aus8
    };

    // Antarctica (Research Stations)
    static String ant1 = "Amundsen-Scott";
    static String ant2 = "McMurdo";
    static String ant3 = "Palmer";
    static String ant4 = "Rothera";
    static String ant5 = "Neumayer";
    static String ant6 = "Concordia";
    static String ant7 = "Vostok";
    static String ant8 = "Davis";
    static String[] antarctica = {
        ant1, ant2, ant3, ant4,
        ant5, ant6, ant7, ant8
    };

    public static void main(String[] args) {
        System.out.println("Continents:");
        for (String item : continents) {
            System.out.println(item);
        }

        System.out.println("\nAsia:");
        for (String item : asia) {
            System.out.println(item);
        }

        System.out.println("\nAfrica:");
        for (String item : africa) {
            System.out.println(item);
        }

        System.out.println("\nEurope:");
        for (String item : europe) {
            System.out.println(item);
        }

        System.out.println("\nNorth America:");
        for (String item : northAmerica) {
            System.out.println(item);
        }

        System.out.println("\nSouth America:");
        for (String item : southAmerica) {
            System.out.println(item);
        }

        System.out.println("\nAustralia Region:");
        for (String item : australiaContinent) {
            System.out.println(item);
        }

        System.out.println("\nAntarctica Research Stations:");
        for (String item : antarctica) {
            System.out.println(item);
        }
    }
}
