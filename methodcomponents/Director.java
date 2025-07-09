
class Director {
    public static void shoot(String movie, String director) {
        System.out.println(director + " started shooting: " + movie);
        Editor.edit(movie, director);
    }
}
