class Shop {
    public static void sell(String vegetable, int quantity) {
        System.out.println("Shop selling " + quantity + " kg of " + vegetable);
        Agent.purchase(vegetable, quantity);
    }
}