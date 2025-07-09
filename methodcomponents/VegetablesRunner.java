class VegetablesRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        String vegetable = "Tomatoes";
        int quantity = 5;

        Customer.buy(vegetable, quantity);

        System.out.println("Main ended");
    }
}
