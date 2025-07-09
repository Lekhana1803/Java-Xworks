class AppLayer {
    public static void placeOrder(String food, int quantity, String address) {
        System.out.println("Order placed on app");
        RestaurantLayer.receiveOrder(food, quantity, address);
    }
}