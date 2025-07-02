class TaskCounter {
    static int tasks;

    public static void main(String[] args) {
        System.out.println("main started");
        completeTask(3);
        System.out.println("Tasks done: " + tasks);
        System.out.println("main ended");
    }

    public static void completeTask(int t) {
        System.out.println("completeTask started");
        tasks = tasks + t;
        System.out.println("completeTask ended");
    }
}
