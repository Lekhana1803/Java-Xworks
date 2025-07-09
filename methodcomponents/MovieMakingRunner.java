class MovieMakingRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        String movie = "Dream Film";
        String director = "Raj";

        Director.shoot(movie, director);

        System.out.println("Main ended");
    }
}
