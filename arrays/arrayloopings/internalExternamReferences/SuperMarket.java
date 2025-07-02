class SuperMarket {

    // Ice Creams
    static String ice1 = "Vanilla";
    static String ice2 = "Chocolate";
    static String ice3 = "Strawberry";
    static String ice4 = "Mango";
    static String ice5 = "Butterscotch";
    static String ice6 = "Pista";
    static String ice7 = "Black Currant";
    static String ice8 = "Cookie Dough";
    static String ice9 = "Kulfi";
    static String ice10 = "Choco Chip";
    static String[] iceCreams = {
        ice1, ice2, ice3, ice4, ice5,
        ice6, ice7, ice8, ice9, ice10
    };

    // Perfumes
    static String perfume1 = "Dior";
    static String perfume2 = "Chanel";
    static String perfume3 = "Versace";
    static String perfume4 = "Gucci";
    static String perfume5 = "Axe";
    static String perfume6 = "Park Avenue";
    static String perfume7 = "Wild Stone";
    static String perfume8 = "Yardley";
    static String perfume9 = "Denver";
    static String perfume10 = "Fogg";
    static String[] perfumes = {
        perfume1, perfume2, perfume3, perfume4, perfume5,
        perfume6, perfume7, perfume8, perfume9, perfume10
    };

    // Groceries
    static String grocery1 = "Rice";
    static String grocery2 = "Wheat";
    static String grocery3 = "Sugar";
    static String grocery4 = "Salt";
    static String grocery5 = "Oil";
    static String grocery6 = "Dals";
    static String grocery7 = "Spices";
    static String grocery8 = "Flour";
    static String grocery9 = "Tea";
    static String grocery10 = "Coffee";
    static String[] groceries = {
        grocery1, grocery2, grocery3, grocery4, grocery5,
        grocery6, grocery7, grocery8, grocery9, grocery10
    };

    // Cosmetics
    static String cosmetic1 = "Lipstick";
    static String cosmetic2 = "Foundation";
    static String cosmetic3 = "Kajal";
    static String cosmetic4 = "Eyeliner";
    static String cosmetic5 = "Compact";
    static String cosmetic6 = "Blush";
    static String cosmetic7 = "BB Cream";
    static String cosmetic8 = "Mascara";
    static String cosmetic9 = "Nail Polish";
    static String cosmetic10 = "Primer";
    static String[] cosmetics = {
        cosmetic1, cosmetic2, cosmetic3, cosmetic4, cosmetic5,
        cosmetic6, cosmetic7, cosmetic8, cosmetic9, cosmetic10
    };

    // Snacks
    static String snack1 = "Chips";
    static String snack2 = "Biscuits";
    static String snack3 = "Namkeen";
    static String snack4 = "Popcorn";
    static String snack5 = "Noodles";
    static String snack6 = "Chocolate";
    static String snack7 = "Cookies";
    static String snack8 = "Mixture";
    static String snack9 = "Crackers";
    static String snack10 = "Wafers";
    static String[] snacks = {
        snack1, snack2, snack3, snack4, snack5,
        snack6, snack7, snack8, snack9, snack10
    };

    // Beverages
    static String beverage1 = "Pepsi";
    static String beverage2 = "Coke";
    static String beverage3 = "Sprite";
    static String beverage4 = "Fanta";
    static String beverage5 = "Juice";
    static String beverage6 = "Water";
    static String beverage7 = "Red Bull";
    static String beverage8 = "Appy Fizz";
    static String beverage9 = "Maaza";
    static String beverage10 = "Limca";
    static String[] beverages = {
        beverage1, beverage2, beverage3, beverage4, beverage5,
        beverage6, beverage7, beverage8, beverage9, beverage10
    };

    // Fruits
    static String fruit1 = "Apple";
    static String fruit2 = "Banana";
    static String fruit3 = "Orange";
    static String fruit4 = "Grapes";
    static String fruit5 = "Mango";
    static String fruit6 = "Papaya";
    static String fruit7 = "Pineapple";
    static String fruit8 = "Strawberry";
    static String fruit9 = "Kiwi";
    static String fruit10 = "Guava";
    static String[] fruits = {
        fruit1, fruit2, fruit3, fruit4, fruit5,
        fruit6, fruit7, fruit8, fruit9, fruit10
    };

    // Vegetables
    static String veg1 = "Tomato";
    static String veg2 = "Potato";
    static String veg3 = "Onion";
    static String veg4 = "Carrot";
    static String veg5 = "Beans";
    static String veg6 = "Spinach";
    static String veg7 = "Cauliflower";
    static String veg8 = "Cabbage";
    static String veg9 = "Peas";
    static String veg10 = "Brinjal";
    static String[] vegetables = {
        veg1, veg2, veg3, veg4, veg5,
        veg6, veg7, veg8, veg9, veg10
    };

    public static void main(String[] args) {
        System.out.println("Ice Creams:");
        for (String item : iceCreams) System.out.println(item);

        System.out.println("\nPerfumes:");
        for (String item : perfumes) System.out.println(item);

        System.out.println("\nGroceries:");
        for (String item : groceries) System.out.println(item);

        System.out.println("\nCosmetics:");
        for (String item : cosmetics) System.out.println(item);

        System.out.println("\nSnacks:");
        for (String item : snacks) System.out.println(item);

        System.out.println("\nBeverages:");
        for (String item : beverages) System.out.println(item);

        System.out.println("\nFruits:");
        for (String item : fruits) System.out.println(item);

        System.out.println("\nVegetables:");
        for (String item : vegetables) System.out.println(item);
    }
}
