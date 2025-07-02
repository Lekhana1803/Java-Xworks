class BillSplitter {
    static double total;

    public static void main(String[] args) {
        System.out.println("main started");
        addItem(150.75);
        System.out.println("Total Bill: ₹" + total);
        System.out.println("main ended");
    }

    public static void addItem(double price) {
        System.out.println("addItem started");
        total = total + price;
        System.out.println("addItem ended");
    }
}
