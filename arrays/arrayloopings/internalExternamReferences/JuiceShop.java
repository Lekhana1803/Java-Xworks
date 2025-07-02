class JuiceShop {

    // Fruit Juices
    static String fruit1 = "Apple Juice";
    static String fruit2 = "Mango Juice";
    static String fruit3 = "Grape Juice";
    static String fruit4 = "Orange Juice";
    static String fruit5 = "Guava Juice";
    static String fruit6 = "Litchi Juice";
    static String fruit7 = "Pineapple Juice";
    static String fruit8 = "Pomegranate Juice";
    static String[] fruitJuices = {
        fruit1, fruit2, fruit3, fruit4,
        fruit5, fruit6, fruit7, fruit8
    };

    // Mixed Juices
    static String mix1 = "Mixed Fruit Juice";
    static String mix2 = "ABC Juice";
    static String mix3 = "Detox Mix";
    static String mix4 = "Tropical Blast";
    static String mix5 = "Immunity Booster";
    static String mix6 = "Energy Mix";
    static String mix7 = "Berry Mix";
    static String mix8 = "Green Punch";
    static String[] mixedJuices = {
        mix1, mix2, mix3, mix4,
        mix5, mix6, mix7, mix8
    };

    // Seasonal Juices
    static String season1 = "Watermelon Juice";
    static String season2 = "Musk Melon Juice";
    static String season3 = "Jamun Juice";
    static String season4 = "Sweet Lime Juice";
    static String season5 = "Sugarcane Juice";
    static String season6 = "Amla Juice";
    static String season7 = "Jackfruit Juice";
    static String season8 = "Papaya Juice";
    static String[] seasonalJuices = {
        season1, season2, season3, season4,
        season5, season6, season7, season8
    };

    // Citrus Juices
    static String citrus1 = "Lemon Juice";
    static String citrus2 = "Mosambi Juice";
    static String citrus3 = "Orange Juice";
    static String citrus4 = "Ginger Lemon";
    static String citrus5 = "Sweet Lemon";
    static String citrus6 = "Lime Mint";
    static String citrus7 = "Citrus Punch";
    static String citrus8 = "Cranberry Citrus";
    static String[] citrusJuices = {
        citrus1, citrus2, citrus3, citrus4,
        citrus5, citrus6, citrus7, citrus8
    };

    // Veggie Juices
    static String veg1 = "Carrot Juice";
    static String veg2 = "Beetroot Juice";
    static String veg3 = "Tomato Juice";
    static String veg4 = "Spinach Juice";
    static String veg5 = "Celery Juice";
    static String veg6 = "Cucumber Juice";
    static String veg7 = "Bottle Gourd Juice";
    static String veg8 = "Karela Juice";
    static String[] veggieJuices = {
        veg1, veg2, veg3, veg4,
        veg5, veg6, veg7, veg8
    };

    // Cold Pressed Juices
    static String cold1 = "Cold Apple";
    static String cold2 = "Cold Pineapple";
    static String cold3 = "Cold Carrot";
    static String cold4 = "Cold Beetroot";
    static String cold5 = "Cold Celery";
    static String cold6 = "Cold Ginger";
    static String cold7 = "Cold Guava";
    static String cold8 = "Cold Pomegranate";
    static String[] coldPressed = {
        cold1, cold2, cold3, cold4,
        cold5, cold6, cold7, cold8
    };

    // Smoothies
    static String smoothie1 = "Banana Smoothie";
    static String smoothie2 = "Strawberry Smoothie";
    static String smoothie3 = "Avocado Smoothie";
    static String smoothie4 = "Mango Smoothie";
    static String smoothie5 = "Peanut Butter Smoothie";
    static String smoothie6 = "Chocolate Smoothie";
    static String smoothie7 = "Protein Smoothie";
    static String smoothie8 = "Oats Smoothie";
    static String[] smoothies = {
        smoothie1, smoothie2, smoothie3, smoothie4,
        smoothie5, smoothie6, smoothie7, smoothie8
    };

    // Milkshakes
    static String milk1 = "Vanilla Milkshake";
    static String milk2 = "Chocolate Milkshake";
    static String milk3 = "Oreo Milkshake";
    static String milk4 = "Strawberry Milkshake";
    static String milk5 = "KitKat Milkshake";
    static String milk6 = "Badam Milkshake";
    static String milk7 = "Rose Milkshake";
    static String milk8 = "Kesar Milkshake";
    static String[] milkshakes = {
        milk1, milk2, milk3, milk4,
        milk5, milk6, milk7, milk8
    };

    public static void main(String[] args) {
        System.out.println("Fruit Juices:");
        for (String item : fruitJuices) System.out.println(item);

        System.out.println("\nMixed Juices:");
        for (String item : mixedJuices) System.out.println(item);

        System.out.println("\nSeasonal Juices:");
        for (String item : seasonalJuices) System.out.println(item);

        System.out.println("\nCitrus Juices:");
        for (String item : citrusJuices) System.out.println(item);

        System.out.println("\nVeggie Juices:");
        for (String item : veggieJuices) System.out.println(item);

        System.out.println("\nCold Pressed Juices:");
        for (String item : coldPressed) System.out.println(item);

        System.out.println("\nSmoothies:");
        for (String item : smoothies) System.out.println(item);

        System.out.println("\nMilkshakes:");
        for (String item : milkshakes) System.out.println(item);
    }
}
