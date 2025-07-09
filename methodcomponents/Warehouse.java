
class Warehouse {
    public static void pack(String item, int quantity) {
        System.out.println("Packing " + quantity + " unit of " + item);
        Courier.deliver(item, quantity);
    }
}
