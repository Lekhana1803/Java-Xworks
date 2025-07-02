class StockMarket {

    // Nifty 50 Stocks
    static String nifty1 = "Reliance Industries";
    static String nifty2 = "TCS";
    static String nifty3 = "Infosys";
    static String nifty4 = "HDFC Bank";
    static String nifty5 = "ICICI Bank";
    static String nifty6 = "Hindustan Unilever";
    static String nifty7 = "ITC";
    static String nifty8 = "Larsen & Toubro";
    static String[] nifty50Stocks = {
        nifty1, nifty2, nifty3, nifty4,
        nifty5, nifty6, nifty7, nifty8
    };

    // Bank Stocks
    static String bank1 = "SBI";
    static String bank2 = "HDFC Bank";
    static String bank3 = "ICICI Bank";
    static String bank4 = "Kotak Mahindra Bank";
    static String bank5 = "Axis Bank";
    static String bank6 = "IDFC First Bank";
    static String bank7 = "Federal Bank";
    static String bank8 = "PNB";
    static String[] bankStocks = {
        bank1, bank2, bank3, bank4,
        bank5, bank6, bank7, bank8
    };

    // IT Stocks
    static String it1 = "Infosys";
    static String it2 = "TCS";
    static String it3 = "Wipro";
    static String it4 = "HCL Technologies";
    static String it5 = "Tech Mahindra";
    static String it6 = "L&T Technology";
    static String it7 = "Mindtree";
    static String it8 = "Persistent Systems";
    static String[] itStocks = {
        it1, it2, it3, it4,
        it5, it6, it7, it8
    };

    // Pharma Stocks
    static String pharma1 = "Sun Pharma";
    static String pharma2 = "Dr. Reddy's";
    static String pharma3 = "Cipla";
    static String pharma4 = "Divi's Labs";
    static String pharma5 = "Aurobindo Pharma";
    static String pharma6 = "Lupin";
    static String pharma7 = "Biocon";
    static String pharma8 = "Torrent Pharma";
    static String[] pharmaStocks = {
        pharma1, pharma2, pharma3, pharma4,
        pharma5, pharma6, pharma7, pharma8
    };

    // Auto Stocks
    static String auto1 = "Maruti Suzuki";
    static String auto2 = "Tata Motors";
    static String auto3 = "Mahindra & Mahindra";
    static String auto4 = "Eicher Motors";
    static String auto5 = "Hero MotoCorp";
    static String auto6 = "TVS Motor";
    static String auto7 = "Bajaj Auto";
    static String auto8 = "Ashok Leyland";
    static String[] autoStocks = {
        auto1, auto2, auto3, auto4,
        auto5, auto6, auto7, auto8
    };

    // FMCG Stocks
    static String fmcg1 = "Hindustan Unilever";
    static String fmcg2 = "ITC";
    static String fmcg3 = "Nestle India";
    static String fmcg4 = "Britannia";
    static String fmcg5 = "Dabur";
    static String fmcg6 = "Marico";
    static String fmcg7 = "Godrej Consumer";
    static String fmcg8 = "Tata Consumer";
    static String[] fmcgStocks = {
        fmcg1, fmcg2, fmcg3, fmcg4,
        fmcg5, fmcg6, fmcg7, fmcg8
    };

    // Energy Stocks
    static String energy1 = "Reliance Industries";
    static String energy2 = "ONGC";
    static String energy3 = "Power Grid";
    static String energy4 = "NTPC";
    static String energy5 = "Adani Green";
    static String energy6 = "Tata Power";
    static String energy7 = "GAIL";
    static String energy8 = "Coal India";
    static String[] energyStocks = {
        energy1, energy2, energy3, energy4,
        energy5, energy6, energy7, energy8
    };

    // Startup Stocks
    static String startup1 = "Zomato";
    static String startup2 = "Nykaa";
    static String startup3 = "Paytm";
    static String startup4 = "Policybazaar";
    static String startup5 = "Delhivery";
    static String startup6 = "CarTrade";
    static String startup7 = "Nazara Technologies";
    static String startup8 = "MapmyIndia";
    static String[] startupStocks = {
        startup1, startup2, startup3, startup4,
        startup5, startup6, startup7, startup8
    };

    public static void main(String[] args) {
        System.out.println("Nifty 50 Stocks:");
        for (String s : nifty50Stocks) System.out.println(s);

        System.out.println("\nBank Stocks:");
        for (String s : bankStocks) System.out.println(s);

        System.out.println("\nIT Stocks:");
        for (String s : itStocks) System.out.println(s);

        System.out.println("\nPharma Stocks:");
        for (String s : pharmaStocks) System.out.println(s);

        System.out.println("\nAuto Stocks:");
        for (String s : autoStocks) System.out.println(s);

        System.out.println("\nFMCG Stocks:");
        for (String s : fmcgStocks) System.out.println(s);

        System.out.println("\nEnergy Stocks:");
        for (String s : energyStocks) System.out.println(s);

        System.out.println("\nStartup Stocks:");
        for (String s : startupStocks) System.out.println(s);
    }
}
