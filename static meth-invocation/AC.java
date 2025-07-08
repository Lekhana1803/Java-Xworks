public class AC {
    static boolean isConnected;
    static int temperature = 24;
    static int maxTemp = 30;
    static int minTemp = 16;

    public static void onOrOff() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("AC is turned ON");
        } else {
            isConnected = false;
            System.out.println("AC is turned OFF");
        }
    }

    public static void increaseTemp() {
        if (isConnected) {
            if (temperature < maxTemp) {
                temperature = temperature + 1;
                System.out.println("Temperature increased to " + temperature + "°C");
            }
        } else {
            System.out.println("Please turn on the AC");
        }
    }

    public static void decreaseTemp() {
        if (isConnected) {
            if (temperature > minTemp) {
                temperature = temperature - 1;
                System.out.println("Temperature decreased to " + temperature + "°C");
            }
        } else {
            System.out.println("Please turn on the AC");
        }
    }
	
}