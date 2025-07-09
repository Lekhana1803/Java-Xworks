class ProductRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        String item = "Smartphone";
        int quantity = 1;

        Buyer.purchase(item, quantity);

        System.out.println("Main ended");
    }
}
