class Booking {
    public static void book(String movie, int tickets) {
        System.out.println("Booking " + tickets + " tickets");
        Payment.pay(movie, tickets);
    }
}
