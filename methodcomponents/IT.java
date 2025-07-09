
class IT {
    public static void approve(String empName, String model) {
        System.out.println("IT approved laptop request");
        Inventory.check(model, empName);
    }
}

