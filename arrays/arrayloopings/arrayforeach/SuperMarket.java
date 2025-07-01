class SuperMarket {
static String iceCreams[] = {"Vanilla", "Chocolate", "Strawberry", "Butter Pecan", "Cookie Dough","Cookies and Cream", "Mint Chocolate Chip", "Chocolate Chip", "Rocky Road", "Peanut Butter Cup"};
static String perfumes[] = {"Chanel No.5", "Dior Sauvage", "Gucci Bloom", "Versace Eros","Tom Ford Black Orchid", "Marc Jacobs Daisy", "CK One", "Burberry Her","YSL Libre", "Jo Malone Pear & Freesia"};
static String groceries[] = {"Milk", "Eggs", "Bread", "Rice", "Pasta","Canned Beans", "Tomato Sauce", "Cooking Oil", "Cheese", "Fresh Vegetables"};
static String cosmetics[] = {"Foundation", "Concealer", "Mascara", "Lipstick", "Blush","Eyeshadow Palette", "Moisturizer", "Sunscreen", "Face Cleanser", "Nail Polish"};
public static void main(String[] market) {
System.out.println("Ice Creams:");
for (String item : iceCreams) {
System.out.println(item);
}
System.out.println("Perfumes:");
for (String item : perfumes) {
System.out.println(item);
}
System.out.println("Groceries:");
for (String item : groceries) {
System.out.println(item);
}
System.out.println("Cosmetics:");
for (String item : cosmetics) {
System.out.println(item);
}
}
}
