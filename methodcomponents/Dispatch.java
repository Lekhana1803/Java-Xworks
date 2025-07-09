
class Dispatch {
    public static void issue(String model, String empName) {
        System.out.println("Laptop dispatched to " + empName);
        Security.log(model, empName);
    }
}
