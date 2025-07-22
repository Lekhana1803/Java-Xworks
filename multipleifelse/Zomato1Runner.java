public class Zomato1Runner {
    public static void main(String[] args) {
        String foodName = "Masala Dosa";  
        int quantity = 2;

        double price = Zomato1.search(foodName, quantity);
        System.out.println("Price of " + quantity + " " + foodName + " is: " + price);
    }
}