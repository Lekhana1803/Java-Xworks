class BudgetTracker {
    static double expenses;

    public static void main(String[] args) {
        System.out.println("main started");
        addExpense(150.0);
        System.out.println("Total Expenses: ₹" + expenses);
        System.out.println("main ended");
    }

    public static void addExpense(double amount) {
        System.out.println("addExpense started");
        expenses = expenses + amount;
        System.out.println("addExpense ended");
    }
}
