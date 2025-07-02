class Hotel {

    // Menus
    static String menu1 = "Pasta";
    static String menu2 = "Burger";
    static String menu3 = "Pizza";
    static String menu4 = "Sandwich";
    static String menu5 = "Salad";
    static String menu6 = "Soup";
    static String menu7 = "Fries";
    static String menu8 = "Noodles";
    static String menu9 = "Curry";
    static String menu10 = "Biryani";
    static String menu11 = "Steak";
    static String menu12 = "Tacos";
    static String menu13 = "Wrap";
    static String menu14 = "Dosa";
    static String menu15 = "Idli";
    static String menu16 = "Sushi";
    static String menu17 = "Pancakes";
    static String menu18 = "Waffles";
    static String menu19 = "Roti";
    static String menu20 = "Paratha";
    static String menu21 = "Donuts";
    static String menu22 = "Kebab";
    static String menu23 = "Lasagna";
    static String menu24 = "Samosa";
    static String menu25 = "Momos";
    static String[] menus = {
        menu1, menu2, menu3, menu4, menu5,
        menu6, menu7, menu8, menu9, menu10,
        menu11, menu12, menu13, menu14, menu15,
        menu16, menu17, menu18, menu19, menu20,
        menu21, menu22, menu23, menu24, menu25
    };

    // Drinks
    static String drink1 = "Water";
    static String drink2 = "Tea";
    static String drink3 = "Coffee";
    static String drink4 = "Juice";
    static String drink5 = "Milkshake";
    static String drink6 = "Soda";
    static String drink7 = "Lassi";
    static String drink8 = "Mocktail";
    static String[] drinks = {
        drink1, drink2, drink3, drink4,
        drink5, drink6, drink7, drink8
    };

    // Desserts
    static String des1 = "Ice Cream";
    static String des2 = "Gulab Jamun";
    static String des3 = "Rasgulla";
    static String des4 = "Kheer";
    static String des5 = "Halwa";
    static String des6 = "Brownie";
    static String des7 = "Tiramisu";
    static String des8 = "Pudding";
    static String[] desserts = {
        des1, des2, des3, des4,
        des5, des6, des7, des8
    };

    // Starters
    static String start1 = "Spring Roll";
    static String start2 = "Soup";
    static String start3 = "Garlic Bread";
    static String start4 = "Cutlet";
    static String start5 = "Kebabs";
    static String start6 = "Bruschetta";
    static String start7 = "Chilli Paneer";
    static String start8 = "Hara Bhara Kabab";
    static String[] starters = {
        start1, start2, start3, start4,
        start5, start6, start7, start8
    };

    // Breads
    static String bread1 = "Naan";
    static String bread2 = "Roti";
    static String bread3 = "Paratha";
    static String bread4 = "Kulcha";
    static String bread5 = "Puri";
    static String bread6 = "Bhature";
    static String bread7 = "Focaccia";
    static String bread8 = "Baguette";
    static String[] breads = {
        bread1, bread2, bread3, bread4,
        bread5, bread6, bread7, bread8
    };

    // Rice Items
    static String rice1 = "Plain Rice";
    static String rice2 = "Fried Rice";
    static String rice3 = "Biryani";
    static String rice4 = "Pulao";
    static String rice5 = "Jeera Rice";
    static String rice6 = "Tomato Rice";
    static String rice7 = "Lemon Rice";
    static String rice8 = "Curd Rice";
    static String[] riceItems = {
        rice1, rice2, rice3, rice4,
        rice5, rice6, rice7, rice8
    };

    // Combos
    static String combo1 = "Thali";
    static String combo2 = "Burger Combo";
    static String combo3 = "Pizza Combo";
    static String combo4 = "Chinese Combo";
    static String combo5 = "South Indian Combo";
    static String combo6 = "Mini Meal";
    static String combo7 = "Wrap Combo";
    static String combo8 = "Salad Bowl";
    static String[] combos = {
        combo1, combo2, combo3, combo4,
        combo5, combo6, combo7, combo8
    };

    // Specials
    static String sp1 = "Chef's Special";
    static String sp2 = "Today's Special";
    static String sp3 = "Weekend Special";
    static String sp4 = "Festival Special";
    static String sp5 = "Seasonal Delight";
    static String sp6 = "Tandoori Special";
    static String sp7 = "BBQ Special";
    static String sp8 = "Family Feast";
    static String[] specials = {
        sp1, sp2, sp3, sp4,
        sp5, sp6, sp7, sp8
    };

    public static void main(String[] args) {
        System.out.println("Menus:");
        for (String item : menus) System.out.println(item);

        System.out.println("\nDrinks:");
        for (String item : drinks) System.out.println(item);

        System.out.println("\nDesserts:");
        for (String item : desserts) System.out.println(item);

        System.out.println("\nStarters:");
        for (String item : starters) System.out.println(item);

        System.out.println("\nBreads:");
        for (String item : breads) System.out.println(item);

        System.out.println("\nRice Items:");
        for (String item : riceItems) System.out.println(item);

        System.out.println("\nCombos:");
        for (String item : combos) System.out.println(item);

        System.out.println("\nSpecials:");
        for (String item : specials) System.out.println(item);
    }
}
