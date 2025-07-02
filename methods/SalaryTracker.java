class SalaryTracker {
    static double salary;

    public static void main(String[] args) {
        System.out.println("main started");
        receive(25000);
        System.out.println("Total Salary: ₹" + salary);
        System.out.println("main ended");
    }

    public static void receive(double s) {
        System.out.println("receive started");
        salary = salary + s;
        System.out.println("receive ended");
    }
}
