
class Payment {
    public static void pay(String movie, int tickets) {
        System.out.println("Payment done for " + tickets + " tickets of " + movie);
        Theatre.reserve(movie, tickets);
    }
}

