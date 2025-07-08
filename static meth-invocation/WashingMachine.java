public class WashingMachine {
    static boolean isConnected;
    static int washTime = 15;
    static int maxTime = 60;
    static int minTime = 10;

    public static void onOrOff() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("Washing Machine is ON");
        } else {
            isConnected = false;
            System.out.println("Washing Machine is OFF");
        }
    }

    public static void increaseTime() {
        if (isConnected) {
            if (washTime < maxTime) {
                washTime = washTime + 5;
                System.out.println("Wash Time: " + washTime + " minutes");
            }
        } else {
            System.out.println("Turn on the Washing Machine first.");
        }
    }

    public static void decreaseTime() {
        if (isConnected) {
            if (washTime > minTime) {
                washTime = washTime - 5;
                System.out.println("Wash Time: " + washTime + " minutes");
            }
        } else {
            System.out.println("Turn on the Washing Machine first.");
        }
    }
}
