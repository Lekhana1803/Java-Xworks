class Tourism {
static String heritageCities[]= {"Agra", "Jaipur", "Delhi"};
static String mountainDestinations[]= {"Shimla", "Manali", "Darjeeling"};
static String hillStations[]= {"Kodaikanal", "Coorg", "Munnar"};
static String beachGetaways[]= {"Goa", "Alleppey", "Andaman & Nicobar"};
static String spiritualSites[]= {"Varanasi", "Rishikesh", "Golden Temple"};
public static void main(String[] tourism) {
System.out.println("Heritage Cities:");
for (String city : heritageCities) {
System.out.println(city);
}
System.out.println("\nMountain Destinations:");
for (String place : mountainDestinations) {
System.out.println(place);
}
System.out.println("\nHill Stations:");
for (String hill : hillStations) {
System.out.println(hill);
}
System.out.println("\nBeach Getaways:");
for (String beach : beachGetaways) {
System.out.println(beach);
}
System.out.println("\nSpiritual Sites:");
for (String site : spiritualSites) {
System.out.println(site);
}
}
}
