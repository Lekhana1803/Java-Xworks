class ComplaintRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        String issue = "Product not working";

        Consumer.fileComplaint(issue);

        System.out.println("Main ended");
    }
}
