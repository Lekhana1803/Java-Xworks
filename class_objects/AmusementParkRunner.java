class AmusementParkRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        AmusementPark park = new AmusementPark();

        System.out.println("id = " + park.parkId);
        System.out.println("name = " + park.name);
        System.out.println("location = " + park.location);
        System.out.println("entry fee = " + park.entryFee);
        System.out.println("rides = " + park.numberOfRides);
        System.out.println("water park = " + park.waterParkIncluded);
        System.out.println("owner = " + park.owner);

        park.parkId = 23;
        park.name = "Wonderla";
        park.location = "Bangalore";
        park.entryFee = 1200.0;
        park.numberOfRides = 45;
        park.waterParkIncluded = true;
        park.owner = "Wonderla Group";

        System.out.println("id = " + park.parkId);
        System.out.println("name = " + park.name);
        System.out.println("location = " + park.location);
        System.out.println("entry fee = " + park.entryFee);
        System.out.println("rides = " + park.numberOfRides);
        System.out.println("water park = " + park.waterParkIncluded);
        System.out.println("owner = " + park.owner);

        System.out.println("main ended");
    }
}
