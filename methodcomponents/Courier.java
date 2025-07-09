
class Courier {
    public static void deliver(String item, int quantity) {
        System.out.println("Courier picked up " + item);
        Tracking.track(item, quantity);
    }
}
