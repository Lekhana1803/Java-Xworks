public class Fan {
    static boolean isConnected;
    static int speed = 0;
    static int maxSpeed = 5;

    public static void onOrOff() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("Fan is ON");
        } else {
            isConnected = false;
            System.out.println("Fan is OFF");
        }
    }

    public static void increaseSpeed() {
        if (isConnected) {
            if (speed < maxSpeed) {
                speed = speed + 1;
                System.out.println("Fan speed: " + speed);
            }
        } else {
            System.out.println("Turn on the Fan first.");
        }
    }

    public static void decreaseSpeed() {
        if (isConnected) {
            if (speed > 0) {
                speed = speed - 1;
                System.out.println("Fan speed: " + speed);
            }
        } else {
            System.out.println("Turn on the Fan first.");
        }
    }
}
