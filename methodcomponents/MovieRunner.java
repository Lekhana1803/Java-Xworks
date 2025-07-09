class MovieRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        String movie = "Inception";
        int tickets = 2;

        User.selectMovie(movie, tickets);

        System.out.println("Main ended");
    }
}


