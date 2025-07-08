public class Projector {
    static boolean isConnected;
    static int brightness = 5;
    static int maxBrightness = 10;
    static int minBrightness = 1;

    public static void onOrOff() {
        if (isConnected) {
            isConnected = true;
            System.out.println("Projector is ON");
        } else {
            isConnected = false;
            System.out.println("Projector is OFF");
        }
    }

    public static void increaseBrightness() {
        if (isConnected) {
            if (brightness < maxBrightness) {
                brightness = brightness + 1;
                System.out.println("Brightness: " + brightness);
            }
        } else {
            System.out.println("Turn on the Projector first.");
        }
    }

    public static void decreaseBrightness() {
        if (isConnected) {
            if (brightness > minBrightness) {
                brightness = brightness - 1;
                System.out.println("Brightness: " + brightness);
            }
        } else {
            System.out.println("Turn on the Projector first.");
        }
    }
}
