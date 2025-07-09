class FoodDeliveryRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        String food = "Burger";
        int quantity = 2;
        String address = "Indiranagar";

        AppLayer.placeOrder(food, quantity, address);

        System.out.println("Main ended");
    }
}








