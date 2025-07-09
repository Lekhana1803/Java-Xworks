
class Buyer1 {
    public static void book(String name, String property) {
        System.out.println(name + " is booking: " + property);
        Agent1.contact(name, property);
    }
}
