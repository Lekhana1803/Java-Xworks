
class Broker {
    public static void brokerage(String vegetable, int quantity) {
        System.out.println("Broker arranging deal for " + vegetable);
        Farmer.farm(vegetable, quantity);
    }
}