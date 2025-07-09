
class Bank1 {
    public static void approve(String property, String name) {
        System.out.println("Loan approved for " + name);
        Legal1.verify(property, name);
    }
}
