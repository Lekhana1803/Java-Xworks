class Inventory {
    public static void check(String model, String empName) {
        System.out.println("Checked inventory for " + model);
        Dispatch.issue(model, empName);
    }
}
