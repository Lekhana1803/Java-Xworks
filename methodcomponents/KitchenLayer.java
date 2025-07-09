class KitchenLayer {
    public static void prepare(String food, int quantity, String address) {
        System.out.println("Kitchen cooked " + quantity + " " + food);
        DeliveryLayer.pickUp(food, quantity, address);
    }
}