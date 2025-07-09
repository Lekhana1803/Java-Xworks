
class Sound {
    public static void add(String movie, String director) {
        System.out.println("Sound added to " + movie);
        VFX.apply(movie, director);
    }
}
