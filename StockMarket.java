class StockMarket {
    static String nifty50Stocks[] = {"Reliance Industries", "TCS", "Infosys", "HDFC Bank", "ICICI Bank", "Hindustan Unilever", "ITC", "Larsen & Toubro"};
    static String bankStocks[] = {"SBI", "HDFC Bank", "ICICI Bank", "Kotak Mahindra Bank", "Axis Bank", "IDFC First Bank", "Federal Bank", "PNB"};
    static String itStocks[] = {"Infosys", "TCS", "Wipro", "HCL Technologies", "Tech Mahindra", "L&T Technology", "Mindtree", "Persistent Systems"};
    static String pharmaStocks[] = {"Sun Pharma", "Dr. Reddy's", "Cipla", "Divi's Labs", "Aurobindo Pharma", "Lupin", "Biocon", "Torrent Pharma"};
    static String autoStocks[] = {"Maruti Suzuki", "Tata Motors", "Mahindra & Mahindra", "Eicher Motors", "Hero MotoCorp", "TVS Motor", "Bajaj Auto", "Ashok Leyland"};
    static String fmcgStocks[] = {"Hindustan Unilever", "ITC", "Nestle India", "Britannia", "Dabur", "Marico", "Godrej Consumer", "Tata Consumer"};
    static String energyStocks[] = {"Reliance Industries", "ONGC", "Power Grid", "NTPC", "Adani Green", "Tata Power", "GAIL", "Coal India"};
    static String startupStocks[] = {"Zomato", "Nykaa", "Paytm", "Policybazaar", "Delhivery", "CarTrade", "Nazara Technologies", "MapmyIndia"};

    public static void main(String[] args) {
        System.out.println("Nifty 50 Stocks: " + nifty50Stocks[0] + ", " + nifty50Stocks[1] + ", " + nifty50Stocks[2]);
        System.out.println("Length: " + nifty50Stocks.length);

        System.out.println("Bank Stocks: " + bankStocks[0] + ", " + bankStocks[1] + ", " + bankStocks[2]);
        System.out.println("Length: " + bankStocks.length);

        System.out.println("IT Stocks: " + itStocks[0] + ", " + itStocks[1] + ", " + itStocks[2]);
        System.out.println("Length: " + itStocks.length);

        System.out.println("Pharma Stocks: " + pharmaStocks[0] + ", " + pharmaStocks[1] + ", " + pharmaStocks[2]);
        System.out.println("Length: " + pharmaStocks.length);

        System.out.println("Auto Stocks: " + autoStocks[0] + ", " + autoStocks[1] + ", " + autoStocks[2]);
        System.out.println("Length: " + autoStocks.length);

        System.out.println("FMCG Stocks: " + fmcgStocks[0] + ", " + fmcgStocks[1] + ", " + fmcgStocks[2]);
        System.out.println("Length: " + fmcgStocks.length);

        System.out.println("Energy Stocks: " + energyStocks[0] + ", " + energyStocks[1] + ", " + energyStocks[2]);
        System.out.println("Length: " + energyStocks.length);

        System.out.println("Startup Stocks: " + startupStocks[0] + ", " + startupStocks[1] + ", " + startupStocks[2]);
        System.out.println("Length: " + startupStocks.length);
    }
}
