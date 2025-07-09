class Netflixmeth {
static String englishMovieNames[] = {"Oppenheimer", "Titanic", "The Shawshank Redemption","The Godfather", "The Dark Knight", "Forrest Gump","Inception", "The Matrix", "Goodfellas"};
static String kannadaMovieNames[] = {"KGF", "KGF2", "Kantara", "Bhageera","Om", "Bheema", "A"};
static String teluguMovieNames[] = {"Salaar", "Bahubali1", "Bahubali2", "Saaho","HiNana", "Dasara", "Kubeera"};

public static void main(String[] netflix) {
System.out.println("English Movies:");
for (String name : englishMovieNames) {
System.out.println(name);
}
System.out.println("Kannada Movies:");
for (String name : kannadaMovieNames) {
System.out.println(name);
}

System.out.println("Telugu Movies:");
for (String name : teluguMovieNames) {
System.out.println(name);
}


}
}
