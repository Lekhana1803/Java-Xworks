class Barmeth {
    static String beers[] = {"KF Strong", "Budweiser Magnum", "Stout"};
    static String cocktails[] = {"Margarita", "Old Fashioned", "Negroni"};
    static String whisky[] = {"Johnnie Walker", "Jameson", "Jack Daniel's"};

    // Method to display beers
    static void displayBeers() {
        System.out.println("Beers:");
        for (String name : beers) {
            System.out.println(name);
        }
    }

    // Method to display cocktails
    static void displayCocktails() {
        System.out.println("Cocktails:");
        for (String name : cocktails) {
            System.out.println(name);
        }
    }

    // Method to display whisky
    static void displayWhisky() {
        System.out.println("Whisky:");
        for (String name : whisky) {
            System.out.println(name);
        }
    }

    public static void main(String[] bar) {
        displayBeers();       // Call to print beers
        displayCocktails();   // Call to print cocktails
        displayWhisky();      // Call to print whisky
    }
}
