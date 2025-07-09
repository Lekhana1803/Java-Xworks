class StockMarketmeth {
    static String techStocks[] = {"AAPL", "MSFT", "GOOGL"};
    static String aiChipsStocks[] = {"NVDA", "AMD", "MU"};
    static String eCommerceStocks[] = {"AMZN", "BABA", "SHOP"};
    static String bankStocks[] = {"JPM", "GS", "BAC"};
    static String autoStocks[] = {"TSLA", "GM", "F"};

    // Method to display Tech Stocks
    static void displayTechStocks() {
        System.out.println("Tech Stocks:");
        for (String stock : techStocks) {
            System.out.println(stock);
        }
    }

    // Method to display AI Chips Stocks
    static void displayAIChipsStocks() {
        System.out.println("AI Chips Stocks:");
        for (String stock : aiChipsStocks) {
            System.out.println(stock);
        }
    }

    // Method to display E-commerce Stocks
    static void displayECommerceStocks() {
        System.out.println("E-commerce Stocks:");
        for (String stock : eCommerceStocks) {
            System.out.println(stock);
        }
    }

    // Method to display Bank Stocks
    static void displayBankStocks() {
        System.out.println("Bank Stocks:");
        for (String stock : bankStocks) {
            System.out.println(stock);
        }
    }

    // Method to display Automobile Stocks
    static void displayAutoStocks() {
        System.out.println("Automobile Stocks:");
        for (String stock : autoStocks) {
            System.out.println(stock);
        }
    }

    public static void main(String[] stockmarket) {
        displayTechStocks();
        displayAIChipsStocks();
        displayECommerceStocks();
        displayBankStocks();
        displayAutoStocks();
    }
}
