class LoanBalance {
    static double loan;

    public static void main(String[] args) {
        System.out.println("main started");
        repay(2000.0);
        System.out.println("Loan left: ₹" + loan);
        System.out.println("main ended");
    }

    public static void repay(double amount) {
        System.out.println("repay started");
        loan = loan - amount;
        System.out.println("repay ended");
    }
}
