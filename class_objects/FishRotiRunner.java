class FishRotiRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        FishRoti food = new FishRoti();

        System.out.println("id = " + food.itemId);
        System.out.println("name = " + food.itemName);
        System.out.println("price = " + food.price);
        System.out.println("cuisine = " + food.cuisine);
        System.out.println("taste = " + food.taste);
        System.out.println("spicy = " + food.spicy);
        System.out.println("restaurant = " + food.restaurant);

        food.itemId = 21;
        food.itemName = "Fish Curry with Roti";
        food.price = 350.0;
        food.cuisine = "Coastal";
        food.taste = "Tangy";
        food.spicy = true;
        food.restaurant = "Sea View";

        System.out.println("id = " + food.itemId);
        System.out.println("name = " + food.itemName);
        System.out.println("price = " + food.price);
        System.out.println("cuisine = " + food.cuisine);
        System.out.println("taste = " + food.taste);
        System.out.println("spicy = " + food.spicy);
        System.out.println("restaurant = " + food.restaurant);

        System.out.println("main ended");
    }
}
