
class User {
    public static void selectMovie(String movie, int tickets) {
        System.out.println("User selected " + movie + " with " + tickets + " tickets");
        Booking.book(movie, tickets);
    }
}