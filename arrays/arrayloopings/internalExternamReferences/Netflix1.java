class Netflix1 {

    // Kannada Movies
    static String kannada1 = "KGF";
    static String kannada2 = "Kantara";
    static String kannada3 = "kgf2";
    static String kannada4 = "Mungaru Male";
    static String kannada5 = "Googly";
    static String kannada6 = "Masterpiece";
    static String[] kannadaMovies = {
        kannada1, kannada2, kannada3, kannada4,
        kannada5, kannada6
    };

    // Hindi Movies
    static String hindi1 = "Dangal";
    static String hindi2 = "3 Idiots";
    static String hindi3 = "PK";
    static String hindi4 = "Sholay";
    static String hindi5 = "Zindagi Na Milegi Dobara";
    static String[] hindiMovies = {
        hindi1, hindi2, hindi3, hindi4, hindi5
    };

    // Telugu Movies
    static String telugu1 = "RRR";
    static String telugu2 = "Pushpa";
    static String telugu3 = "Bahubali";
    static String telugu4 = "Arjun Reddy";
    static String telugu5 = "Magadheera";
    static String[] teluguMovies = {
        telugu1, telugu2, telugu3, telugu4, telugu5
    };

    // Tamil Movies
    static String tamil1 = "Vikram";
    static String tamil2 = "Master";
    static String tamil3 = "Bigil";
    static String tamil4 = "Asuran";
    static String tamil5 = "Kaithi";
    static String[] tamilMovies = {
        tamil1, tamil2, tamil3, tamil4, tamil5
    };

    // Malayalam Movies
    static String malayalam1 = "Drishyam";
    static String malayalam2 = "Premam";
    static String malayalam3 = "Jallikattu";
    static String malayalam4 = "Kumbalangi Nights";
    static String malayalam5 = "Bangalore Days";
    static String[] malayalamMovies = {
        malayalam1, malayalam2, malayalam3, malayalam4, malayalam5
    };

    // English Movies
    static String eng1 = "Inception";
    static String eng2 = "Titanic";
    static String eng3 = "Interstellar";
    static String eng4 = "The Dark Knight";
    static String eng5 = "Avengers";
    static String[] englishMovies = {
        eng1, eng2, eng3, eng4, eng5
    };

    // Korean Movies
    static String korean1 = "Parasite";
    static String korean2 = "Train to Busan";
    static String korean3 = "Oldboy";
    static String korean4 = "Minari";
    static String korean5 = "Burning";
    static String[] koreanMovies = {
        korean1, korean2, korean3, korean4, korean5
    };

    // Japanese Movies
    static String jap1 = "Spirited Away";
    static String jap2 = "Your Name";
    static String jap3 = "Akira";
    static String jap4 = "Naruto";
    static String jap5 = "One Piece";
    static String[] japaneseMovies = {
        jap1, jap2, jap3, jap4, jap5
    };

    // Marathi Movies
    static String marathi1 = "Sairat";
    static String marathi2 = "Court";
    static String marathi3 = "Natsamrat";
    static String marathi4 = "Fandry";
    static String marathi5 = "Duniyadari";
    static String[] marathiMovies = {
        marathi1, marathi2, marathi3, marathi4, marathi5
    };

    // Bengali Movies
    static String bengali1 = "Pather Panchali";
    static String bengali2 = "Kahaani";
    static String bengali3 = "Chokher Bali";
    static String bengali4 = "Hemlock Society";
    static String bengali5 = "Shonar Kella";
    static String[] bengaliMovies = {
        bengali1, bengali2, bengali3, bengali4, bengali5
    };

    public static void main(String[] args) {
        System.out.println("Kannada Movies:");
        for (String movie : kannadaMovies) System.out.println(movie);

        System.out.println("\nHindi Movies:");
        for (String movie : hindiMovies) System.out.println(movie);

        System.out.println("\nTelugu Movies:");
        for (String movie : teluguMovies) System.out.println(movie);

        System.out.println("\nTamil Movies:");
        for (String movie : tamilMovies) System.out.println(movie);

        System.out.println("\nMalayalam Movies:");
        for (String movie : malayalamMovies) System.out.println(movie);

        System.out.println("\nEnglish Movies:");
        for (String movie : englishMovies) System.out.println(movie);

        System.out.println("\nKorean Movies:");
        for (String movie : koreanMovies) System.out.println(movie);

        System.out.println("\nJapanese Movies:");
        for (String movie : japaneseMovies) System.out.println(movie);

        System.out.println("\nMarathi Movies:");
        for (String movie : marathiMovies) System.out.println(movie);

        System.out.println("\nBengali Movies:");
        for (String movie : bengaliMovies) System.out.println(movie);
    }
}
