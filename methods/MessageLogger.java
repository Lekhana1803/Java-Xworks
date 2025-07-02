class MessageLogger {
    static int messages;

    public static void main(String[] args) {
        System.out.println("main started");
        logMessage(10);
        System.out.println("Total messages: " + messages);
        System.out.println("main ended");
    }

    public static void logMessage(int count) {
        System.out.println("logMessage started");
        messages = messages + count;
        System.out.println("logMessage ended");
    }
}
