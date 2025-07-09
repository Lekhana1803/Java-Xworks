
class Buyer {
    public static void purchase(String item, int quantity) {
        System.out.println("Buyer purchasing: " + item);
        Website.process(item, quantity);
    }
}
