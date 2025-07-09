class RestaurantLayer {
    public static void receiveOrder(String food, int quantity, String address) {
        System.out.println("Restaurant preparing order");
        KitchenLayer.prepare(food, quantity, address);
    }
}