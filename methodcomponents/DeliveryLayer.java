class DeliveryLayer {
    public static void pickUp(String food, int quantity, String address) {
        System.out.println("Delivery picked up from restaurant");
        GPSTracker.track(food, quantity, address);
    }
}