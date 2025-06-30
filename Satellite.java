public class Satellite {
    public static String name = "Orbital One";
    public static double orbitalAltitudeKm = 550.5;
    public static double massKg = 1200.0;
    public static String purpose = "Earth Observation";
    public static String launchDate = "2022-07-15";
    public static String operator = "SpaceTech Co.";
    public static double powerWatts = 1500;
    public static boolean hasCamera = true;
    public static boolean hasRadar = false;
    public static String launchVehicle = "Falcon 9";
    public static String status = "Operational";
    public static double expectedLifespanYears = 7.5;
    public static String orbitType = "LEO";
    public static boolean isGeostationary = false;
    public static double inclinationDeg = 97.0;
    public static String groundStation = "GS-Alpha";
    public static double dataRateMbps = 50.0;
    public static boolean hasAutopilot = true;
    public static String manufacturer = "SpaceTech";

    public static void main(String[] args) {
        System.out.println("name = " + name);
        System.out.println("orbitalAltitudeKm = " + orbitalAltitudeKm);
        System.out.println("massKg = " + massKg);
        System.out.println("purpose = " + purpose);
        System.out.println("launchDate = " + launchDate);
        System.out.println("operator = " + operator);
        System.out.println("powerWatts = " + powerWatts);
        System.out.println("hasCamera = " + hasCamera);
        System.out.println("hasRadar = " + hasRadar);
        System.out.println("launchVehicle = " + launchVehicle);
        System.out.println("status = " + status);
        System.out.println("expectedLifespanYears = " + expectedLifespanYears);
        System.out.println("orbitType = " + orbitType);
        System.out.println("isGeostationary = " + isGeostationary);
        System.out.println("inclinationDeg = " + inclinationDeg);
        System.out.println("groundStation = " + groundStation);
        System.out.println("dataRateMbps = " + dataRateMbps);
        System.out.println("hasAutopilot = " + hasAutopilot);
        System.out.println("manufacturer = " + manufacturer);
    }
}
