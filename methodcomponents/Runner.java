class VegetablesRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        String vegetable = "Tomatoes";
        int quantity = 5;

        Customer.buy(vegetable, quantity);

        System.out.println("Main ended");
    }
}





class Agent {
    public static void purchase(String vegetable, int quantity) {
        System.out.println("Agent purchasing " + quantity + " kg of " + vegetable);
        Broker.brokerage(vegetable, quantity);
    }
}

class Broker {
    public static void brokerage(String vegetable, int quantity) {
        System.out.println("Broker arranging deal for " + vegetable);
        Farmer.farm(vegetable, quantity);
    }
}

class Farmer {
    public static void farm(String vegetable, int quantity) {
        System.out.println("Farmer harvesting " + quantity + " kg of " + vegetable);
    }
}
