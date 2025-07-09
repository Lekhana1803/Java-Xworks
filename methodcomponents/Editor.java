
class Editor {
    public static void edit(String movie, String director) {
        System.out.println("Editor working on: " + movie);
        Sound.add(movie, director);
    }
}
