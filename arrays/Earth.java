class Earth {
    static String continents[] = {"Asia", "Africa", "North America", "South America", "Antarctica", "Europe", "Australia"};
    static String asia[] = {"India", "China", "Japan", "Indonesia", "Thailand", "Vietnam", "Malaysia", "Philippines"};
    static String africa[] = {"Nigeria", "Egypt", "South Africa", "Kenya", "Ethiopia", "Ghana", "Morocco", "Tanzania"};
    static String europe[] = {"Germany", "France", "Italy", "Spain", "UK", "Netherlands", "Sweden", "Norway"};
    static String northAmerica[] = {"USA", "Canada", "Mexico", "Cuba", "Jamaica", "Honduras", "Guatemala", "Panama"};
    static String southAmerica[] = {"Brazil", "Argentina", "Colombia", "Chile", "Peru", "Venezuela", "Ecuador", "Uruguay"};
    static String australiaContinent[] = {"Australia", "New Zealand", "Fiji", "Papua New Guinea", "Samoa", "Tonga", "Vanuatu", "Solomon Islands"};
    static String antarctica[] = {"Amundsen-Scott", "McMurdo", "Palmer", "Rothera", "Neumayer", "Concordia", "Vostok", "Davis"};

    public static void main(String[] args) {
        System.out.println("Continents: " + continents[0] + ", " + continents[1] + ", " + continents[2]);
        System.out.println("Length: " + continents.length);
        System.out.println("Asia Countries: " + asia[0] + ", " + asia[1] + ", " + asia[2]);
        System.out.println("Length: " + asia.length);
        System.out.println("Africa Countries: " + africa[0] + ", " + africa[1] + ", " + africa[2]);
        System.out.println("Length: " + africa.length);
        System.out.println("Europe Countries: " + europe[0] + ", " + europe[1] + ", " + europe[2]);
        System.out.println("Length: " + europe.length);
        System.out.println("North America Countries: " + northAmerica[0] + ", " + northAmerica[1] + ", " + northAmerica[2]);
        System.out.println("Length: " + northAmerica.length);
        System.out.println("South America Countries: " + southAmerica[0] + ", " + southAmerica[1] + ", " + southAmerica[2]);
        System.out.println("Length: " + southAmerica.length);
        System.out.println("Australia Region: " + australiaContinent[0] + ", " + australiaContinent[1] + ", " + australiaContinent[2]);
        System.out.println("Length: " + australiaContinent.length);
        System.out.println("Antarctica Research Stations: " + antarctica[0] + ", " + antarctica[1] + ", " + antarctica[2]);
        System.out.println("Length: " + antarctica.length);
    }
}