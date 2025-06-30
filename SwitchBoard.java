public class SwitchBoard {
    public static int totalSwitches = 10;
    public static String manufacturer = "ElectroCo";
    public static boolean isSmart = true;
    public static String model = "SB-1000";
    public static String voltage = "240V";
    public static int currentRating = 16;
    public static boolean hasIndicator = true;
    public static String color = "White";
    public static double weight = 0.5;
    public static String material = "Plastic";
    public static boolean waterproof = false;
    public static String installationType = "Wall-mounted";
    public static int warrantyMonths = 24;
    public static String serialNumber = "SN12345";
    public static String countryOfOrigin = "India";
    public static boolean isROHSCompliant = true;
    public static String protectionClass = "IP20";

    public static void main(String[] args) {
		double price = 29.99;
		System.out.println("price of switchBoard is="+price);
		price=35.8;
		System.out.println("updated price is="+price);

        System.out.println("totalSwitches = " + totalSwitches);
        System.out.println("manufacturer = " + manufacturer);
        System.out.println("isSmart = " + isSmart);
        System.out.println("model = " + model);
        System.out.println("voltage = " + voltage);
        System.out.println("currentRating = " + currentRating);
        System.out.println("hasIndicator = " + hasIndicator);
        System.out.println("color = " + color);
        System.out.println("weight = " + weight);
        System.out.println("material = " + material);
        System.out.println("waterproof = " + waterproof);
        System.out.println("installationType = " + installationType);
        System.out.println("warrantyMonths = " + warrantyMonths);
        System.out.println("serialNumber = " + serialNumber);
        System.out.println("price = " + price);
        System.out.println("countryOfOrigin = " + countryOfOrigin);
        System.out.println("isROHSCompliant = " + isROHSCompliant);
        System.out.println("protectionClass = " + protectionClass);
    }
}
