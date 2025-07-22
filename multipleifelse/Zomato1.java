public class Zomato1 {

    public static double getFoodPrice(String foodName, int quantity) {
        double price = 0.0;

        if (foodName == "Paneer Butter Masala") {
            price = 199 * quantity;
        } else if (foodName == "Veg Biryani") {
            price = 149 * quantity;
        } else if (foodName == "Chicken Biryani") {
            price = 299 * quantity;
        } else if (foodName == "Masala Dosa") {
            price = 99 * quantity;
	
        } else if (foodName == "Samosa") {
            price = 89 * quantity;
        } else if (foodName == "Butter Chicken") {
            price = 249 * quantity;
        } else if (foodName == "Chole Bhature") {
            price = 129 * quantity;
        } else if (foodName == "Vada Pav") {
            price = 59 * quantity;
        } else if (foodName == "Aloo Paratha") {
            price = 149 * quantity;
        } else if (foodName == "Idli Vada") {
            price = 119 * quantity;
        } else if (foodName == "Pav Bhaji") {
            price = 89 * quantity;
        } else if (foodName == "Manchurian Fried Rice") {
            price = 179 * quantity;
        } else if (foodName == "Spring Roll") {
            price = 139 * quantity;
        } else if (foodName == "Pizza Margherita") {
            price = 199 * quantity;
        } else if (foodName == "Chicken Burger") {
            price = 269 * quantity;
        } else if (foodName == "French Fries") {
            price = 109 * quantity;
        } else if (foodName == "Cold Coffee") {
            price = 59 * quantity;
        } else if (foodName == "Lassi") {
            price = 79 * quantity;
        } else if (foodName == "Gulab Jamun") {
            price = 99.89 * quantity;
        } else if (foodName == "Ice Cream") {
            price = 89.00 * quantity;
        } else {
            System.out.println("'" + foodName + "' is not available on the menu.");
        }

        return price;
    }

    public static double search(String foodname, int quantity) {
        return getFoodPrice(foodname, quantity);
    }
}