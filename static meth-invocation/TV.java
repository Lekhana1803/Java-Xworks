public class TV {
    static boolean isConnected;
    static int volume = 10;
    static int maxVolume = 20;
    static int minVolume = 0;

    public static void onOrOff() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("TV is ON");
        } else {
            isConnected = false;
            System.out.println("TV is OFF");
        }
    }

    public static void increaseVolume() {
        if (isConnected) {
            if (volume < maxVolume) {
                volume = volume + 1;
                System.out.println("TV Volume: " + volume);
            }
        } else {
            System.out.println("Turn on the TV first.");
        }
    }

    public static void decreaseVolume() {
        if (isConnected) {
            if (volume > minVolume) {
                volume = volume - 1;
                System.out.println("TV Volume: " + volume);
            }
        } else {
            System.out.println("Turn on the TV first.");
        }
    }
}
