class ForestSafariRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        ForestSafari safari = new ForestSafari();

        System.out.println("id = " + safari.safariId);
        System.out.println("forest = " + safari.forestName);
        System.out.println("ticket price = " + safari.ticketPrice);
        System.out.println("vehicle = " + safari.vehicleType);
        System.out.println("duration = " + safari.durationHours);
        System.out.println("guide included = " + safari.guideIncluded);
        System.out.println("location = " + safari.location);

        safari.safariId = 22;
        safari.forestName = "Jim Corbett";
        safari.ticketPrice = 1500.0;
        safari.vehicleType = "Jeep";
        safari.durationHours = 3;
        safari.guideIncluded = true;
        safari.location = "Uttarakhand";

        System.out.println("id = " + safari.safariId);
        System.out.println("forest = " + safari.forestName);
        System.out.println("ticket price = " + safari.ticketPrice);
        System.out.println("vehicle = " + safari.vehicleType);
        System.out.println("duration = " + safari.durationHours);
        System.out.println("guide included = " + safari.guideIncluded);
        System.out.println("location = " + safari.location);

        System.out.println("main ended");
    }
}
