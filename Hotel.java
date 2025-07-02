class Hotel {
    static String menus[] = {"Pasta", "Burger", "Pizza", "Sandwich", "Salad", "Soup", "Fries", "Noodles", "Curry", "Biryani", "Steak", "Tacos", "Wrap", "Dosa", "Idli", "Sushi", "Pancakes", "Waffles", "Roti", "Paratha", "Donuts", "Kebab", "Lasagna", "Samosa", "Momos"};
    static String drinks[] = {"Water", "Tea", "Coffee", "Juice", "Milkshake", "Soda", "Lassi", "Mocktail"};
    static String desserts[] = {"Ice Cream", "Gulab Jamun", "Rasgulla", "Kheer", "Halwa", "Brownie", "Tiramisu", "Pudding"};
    static String starters[] = {"Spring Roll", "Soup", "Garlic Bread", "Cutlet", "Kebabs", "Bruschetta", "Chilli Paneer", "Hara Bhara Kabab"};
    static String breads[] = {"Naan", "Roti", "Paratha", "Kulcha", "Puri", "Bhature", "Focaccia", "Baguette"};
    static String riceItems[] = {"Plain Rice", "Fried Rice", "Biryani", "Pulao", "Jeera Rice", "Tomato Rice", "Lemon Rice", "Curd Rice"};
    static String combos[] = {"Thali", "Burger Combo", "Pizza Combo", "Chinese Combo", "South Indian Combo", "Mini Meal", "Wrap Combo", "Salad Bowl"};
    static String specials[] = {"Chef's Special", "Today's Special", "Weekend Special", "Festival Special", "Seasonal Delight", "Tandoori Special", "BBQ Special", "Family Feast"};

    public static void main(String[] args) {
        System.out.println("Hotel Menus: " + menus[0] + ", " + menus[1] + ", " + menus[2]);
        System.out.println("Length: " + menus.length);
        System.out.println("Drinks: " + drinks[0] + ", " + drinks[1] + ", " + drinks[2]);
        System.out.println("Length: " + drinks.length);
        System.out.println("Desserts: " + desserts[0] + ", " + desserts[1] + ", " + desserts[2]);
        System.out.println("Length: " + desserts.length);
        System.out.println("Starters: " + starters[0] + ", " + starters[1] + ", " + starters[2]);
        System.out.println("Length: " + starters.length);
        System.out.println("Breads: " + breads[0] + ", " + breads[1] + ", " + breads[2]);
        System.out.println("Length: " + breads.length);
        System.out.println("Rice Items: " + riceItems[0] + ", " + riceItems[1] + ", " + riceItems[2]);
        System.out.println("Length: " + riceItems.length);
        System.out.println("Combos: " + combos[0] + ", " + combos[1] + ", " + combos[2]);
        System.out.println("Length: " + combos.length);
        System.out.println("Specials: " + specials[0] + ", " + specials[1] + ", " + specials[2]);
        System.out.println("Length: " + specials.length);
    }
}