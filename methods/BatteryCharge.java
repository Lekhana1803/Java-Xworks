class BatteryCharge {
    static int charge;

    public static void main(String[] args) {
        System.out.println("main started");
        chargeBattery(30);
        System.out.println("Charge: " + charge + "%");
        System.out.println("main ended");
    }

    public static void chargeBattery(int percent) {
        System.out.println("chargeBattery started");
        charge = charge + percent;
        System.out.println("chargeBattery ended");
    }
}
