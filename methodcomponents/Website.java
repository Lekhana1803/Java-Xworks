
class Website {
    public static void process(String item, int quantity) {
        System.out.println("Website processing: " + item);
        Warehouse.pack(item, quantity);
    }
}
