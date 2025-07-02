class FuelTank {
    static double fuel;

    public static void main(String[] args) {
        System.out.println("main started");
        refill(15.0);
        System.out.println("fuel left: " + fuel + " L");
        System.out.println("main ended");
    }

    public static void refill(double liters) {
        System.out.println("refill started");
        fuel = fuel + liters;
        System.out.println("refill ended");
    }
}
