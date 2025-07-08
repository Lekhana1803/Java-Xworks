public class Cooler {
    static boolean isConnected;
    static int coolingLevel = 1;
    static int maxLevel = 5;
    static int minLevel = 1;

    public static void onOrOff() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("Cooler is ON");
        } else {
            isConnected = false;
            System.out.println("Cooler is OFF");
        }
    }

    public static void increaseCooling() {
        if (isConnected) {
            if (coolingLevel < maxLevel) {
                coolingLevel = coolingLevel + 1;
                System.out.println("Cooling Level: " + coolingLevel);
            }
        } else {
            System.out.println("Turn on the Cooler first.");
        }
    }

    public static void decreaseCooling() {
        if (isConnected) {
            if (coolingLevel > minLevel) {
                coolingLevel = coolingLevel - 1;
                System.out.println("Cooling Level: " + coolingLevel);
            }
        } else {
            System.out.println("Turn on the Cooler first.");
        }
    }
}
