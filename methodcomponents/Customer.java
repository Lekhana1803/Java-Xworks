class Customer {
    public static void buy(String vegetable, int quantity) {
        System.out.println("Customer buying " + quantity + " kg of " + vegetable);
        Shop.sell(vegetable, quantity);
    }
}