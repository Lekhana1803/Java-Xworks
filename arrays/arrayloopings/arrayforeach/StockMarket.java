class StockMarket {
static String techStocks[] = {"AAPL", "MSFT", "GOOGL"};
static String aiChipsStocks[] = {"NVDA", "AMD", "MU"};
static String eCommerceStocks[] = {"AMZN", "BABA", "SHOP"};
static String bankStocks[] = {"JPM", "GS", "BAC"};
static String autoStocks[] = {"TSLA", "GM", "F"};
public static void main(String[] stockmarket) {
System.out.println("Tech Stocks:");
for (String stock : techStocks) {
System.out.println(stock);
}
System.out.println("AI Chips Stocks:");
for (String stock : aiChipsStocks) {
System.out.println(stock);
}
System.out.println("E-commerce Stocks:");
for (String stock : eCommerceStocks) {
System.out.println(stock);
}
System.out.println("Bank Stocks:");
for (String stock : bankStocks) {
System.out.println(stock);
}
System.out.println("Automobile Stocks:");
for (String stock : autoStocks) {
System.out.println(stock);
}
}
}
