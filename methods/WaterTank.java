class WaterTank {
    static int water;

    public static void main(String[] args) {
        System.out.println("main started");
        fill(100);
        System.out.println("Water level: " + water + " L");
        System.out.println("main ended");
    }

    public static void fill(int liters) {
        System.out.println("fill started");
        water = water + liters;
        System.out.println("fill ended");
    }
}
