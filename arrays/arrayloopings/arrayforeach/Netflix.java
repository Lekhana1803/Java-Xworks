class Netflix {
static String englishMovieNames[] = {"Oppenheimer", "Titanic", "The Shawshank Redemption","The Godfather", "The Dark Knight", "Forrest Gump","Inception", "The Matrix", "Goodfellas"};
static String kannadaMovieNames[] = {"KGF", "KGF2", "Kantara", "Bhageera","Om", "Bheema", "A"};
static String teluguMovieNames[] = {"Salaar", "Bahubali1", "Bahubali2", "Saaho","HiNana", "Dasara", "Kubeera"};
static String tamilMovieNames[] = {"Leo", "TouristFamily", "VIP1", "VIP2","Dragon", "Vikram", "Jailer"};
static String malyalamMovieNames[] = {"Sandesham", "Kireedam", "Home", "Manichithrathazhu","Nadodikkattu", "Kumbalangi Nights", "Drishyam2", "Devasuram"};
static String koreanSeriesNames[] = {"Goodboy", "squidgame", "family","karma", "MercyforNone", "Light Shop", "Vigilante"};
static String hindiMovieNames[] = {"Raid", "Raid2", "ABCD", "ABCD2","BhajrangiBhaijaan", "Cocktial", "Housefull"};
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

System.out.println("Tamil Movies:");
for (String name : tamilMovieNames) {
System.out.println(name);
}

System.out.println("Malayalam Movies:");
for (String name : malyalamMovieNames) {
System.out.println(name);
}

System.out.println("Korean Series:");
for (String name : koreanSeriesNames) {
System.out.println(name);
}

System.out.println("Hindi Movies:");
for (String name : hindiMovieNames) {
System.out.println(name);
}
}
}
