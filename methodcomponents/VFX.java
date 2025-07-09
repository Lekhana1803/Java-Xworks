
class VFX {
    public static void apply(String movie, String director) {
        System.out.println("VFX applied to " + movie);
        Distributor.release(movie, director);
    }
}
