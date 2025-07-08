class TeashopRunner {

    public static void main(String[] args) {
        System.out.println("main started");
        System.out.println("itemNames available are:");

        Teashop.firstItem("GreenTea", "LemonTea");
        Teashop.secondItem("FilterCoffee", "Tea");
        Teashop.thirdItem("BadamMilk", "PlainMilk");
        // If you want to list all items exactly two per call, you could:
        // Teashop.fourthItem("Item7", "Item8");
        // Teashop.fifthItem("Item9", "Item10");
        // Teashop.sixthItem("Item11", "Item12");

        System.out.println("main ended");
    }
}
