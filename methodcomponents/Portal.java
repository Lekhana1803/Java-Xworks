
class Portal {
    public static void receive(String issue) {
        System.out.println("Portal received complaint");
        Support.investigate(issue);
    }
}
