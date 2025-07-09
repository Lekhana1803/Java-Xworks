
class Consumer {
    public static void fileComplaint(String issue) {
        System.out.println("Complaint filed: " + issue);
        Portal.receive(issue);
    }
}
