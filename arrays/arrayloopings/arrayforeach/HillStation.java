class HillStation {
static String resortNames[] = {"JW Marriott Walnut Grove","Ananda in the Himalayas","Club Mahindra Munnar","Taj Madikeri Resort & Spa","Mountain View Hideaway","Blue Mountain Resort","Serenity Valley Wayanad"};
static String rooms[] = {"Deluxe Room", "Spa Suite", "Heritage Cottage","Treehouse", "Valley View Cottage", "Luxury Villa", "Premium Suite"};
static String activities[] = {"Trekking", "Yoga", "Birdwatching","Coffee Plantation Tour", "Zip‑lining", "Rafting", "Nature Walks"};
static String diningOptions[] = {"Multi‑cuisine Restaurant", "Locale Specialties","Afternoon Tea", "Fine Dining", "Poolside Bar", "Room Service", "Outdoor BBQ"};
static String spaTreatments[] = {"Ayurvedic Massage", "Hot Stone Therapy", "Jacuzzi","Sauna", "Herbal Steam", "Reflexology", "Meditation Sessions"};
static String views[] = {"Mountain View", "River View", "Tea Estate View","Valley View", "Forest View", "Lake View", "Sunset View"};
public static void main(String[] hillstation) {
System.out.println("Resorts:");
for (String resort : resortNames) {
System.out.println(resort);
}
System.out.println("\nRooms:");
for (String room : rooms) {
System.out.println(room);
}
System.out.println("\nActivities:");
for (String activity : activities) {
System.out.println(activity);
}
System.out.println("\nDining Options:");
for (String dining : diningOptions) {
System.out.println(dining);
}
System.out.println("\nSpa Treatments:");
for (String spa : spaTreatments) {
System.out.println(spa);
}
System.out.println("\nViews:");
for (String view : views) {
System.out.println(view);
}
}
}
