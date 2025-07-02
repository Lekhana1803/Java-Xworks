class ExamTimer {
    static int timeLeft;

    public static void main(String[] args) {
        System.out.println("main started");
        reduceTime(10);
        System.out.println("Time left: " + timeLeft + " min");
        System.out.println("main ended");
    }

    public static void reduceTime(int min) {
        System.out.println("reduceTime started");
        timeLeft = timeLeft - min;
        System.out.println("reduceTime ended");
    }
}
