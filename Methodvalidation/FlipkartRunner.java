class FlipkartRunner {
    public static void main(String[] args) {
        boolean isRegistered = Flipkart.registerUser("Anjali", "anjali@example.com");
        System.out.println("User registered: " + isRegistered);
        Flipkart.getUserInfo();
    }
}
