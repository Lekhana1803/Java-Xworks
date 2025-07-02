class VisitorCounter {
    static int visitors;

    public static void main(String[] args) {
        System.out.println("main started");
        newVisitor(5);
        System.out.println("Total Visitors: " + visitors);
        System.out.println("main ended");
    }

    public static void newVisitor(int count) {
        System.out.println("newVisitor started");
        visitors = visitors + count;
        System.out.println("newVisitor ended");
    }
}
