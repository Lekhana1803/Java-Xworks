class Wallet {

    static double amount;

    public static void main(String[] args) {
        System.out.println("main started");
        addMoney(500.0);
        System.out.println("Current Wallet Amount: " + amount);
        System.out.println("main ended");
    }

    public static void addMoney(double money) {
        System.out.println("addMoney started");
        amount = amount + money; 
        System.out.println("addMoney ended");
    }

    public static void spendMoney(double money) {
        System.out.println("spendMoney started");
        amount = amount - money; 
        System.out.println("spendMoney ended");
    }
}
