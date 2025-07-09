class Agent {
    public static void purchase(String vegetable, int quantity) {
        System.out.println("Agent purchasing " + quantity + " kg of " + vegetable);
        Broker.brokerage(vegetable, quantity);
    }
}