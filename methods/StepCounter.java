class StepCounter {
    static int steps;

    public static void main(String[] args) {
        System.out.println("main started");
        walk(2000);
        System.out.println("Total steps: " + steps);
        System.out.println("main ended");
    }

    public static void walk(int s) {
        System.out.println("walk started");
        steps = steps + s;
        System.out.println("walk ended");
    }
}
