class BarAlcohols {

    // Whisky Brands
    static String whisky1 = "Royal Stag";
    static String whisky2 = "Blenders Pride";
    static String whisky3 = "McDowell's No.1";
    static String whisky4 = "Imperial Blue";
    static String whisky5 = "Signature";
    static String whisky6 = "Antiquity Blue";
    static String whisky7 = "Chivas Regal";
    static String whisky8 = "Jack Daniel's";
    static String[] whiskyBrands = {
        whisky1, whisky2, whisky3, whisky4,
        whisky5, whisky6, whisky7, whisky8
    };

    // Vodka Brands
    static String vodka1 = "Smirnoff";
    static String vodka2 = "Magic Moments";
    static String vodka3 = "Absolut";
    static String vodka4 = "Grey Goose";
    static String vodka5 = "Romanov";
    static String vodka6 = "White Mischief";
    static String vodka7 = "Belvedere";
    static String vodka8 = "Finlandia";
    static String[] vodkaBrands = {
        vodka1, vodka2, vodka3, vodka4,
        vodka5, vodka6, vodka7, vodka8
    };

    // Beer Brands
    static String beer1 = "Kingfisher";
    static String beer2 = "Budweiser";
    static String beer3 = "Heineken";
    static String beer4 = "Corona";
    static String beer5 = "Tuborg";
    static String beer6 = "Carlsberg";
    static String beer7 = "Bira 91";
    static String beer8 = "Haywards 5000";
    static String[] beerBrands = {
        beer1, beer2, beer3, beer4,
        beer5, beer6, beer7, beer8
    };

    // Rum Brands
    static String rum1 = "Old Monk";
    static String rum2 = "Bacardi";
    static String rum3 = "Captain Morgan";
    static String rum4 = "McDowell's Rum";
    static String rum5 = "Hercules";
    static String rum6 = "Jamaica Gold";
    static String rum7 = "Malibu";
    static String rum8 = "Contessa";
    static String[] rumBrands = {
        rum1, rum2, rum3, rum4,
        rum5, rum6, rum7, rum8
    };

    // Gin Brands
    static String gin1 = "Bombay Sapphire";
    static String gin2 = "Tanqueray";
    static String gin3 = "Beefeater";
    static String gin4 = "Greater Than";
    static String gin5 = "Hapusa";
    static String gin6 = "Blue Riband";
    static String gin7 = "Monkey 47";
    static String gin8 = "Gordon's";
    static String[] ginBrands = {
        gin1, gin2, gin3, gin4,
        gin5, gin6, gin7, gin8
    };

    // Tequila Brands
    static String tequila1 = "Jose Cuervo";
    static String tequila2 = "Patrón";
    static String tequila3 = "1800";
    static String tequila4 = "Sauza";
    static String tequila5 = "Don Julio";
    static String tequila6 = "Camino Real";
    static String tequila7 = "El Jimador";
    static String tequila8 = "Espolon";
    static String[] tequilaBrands = {
        tequila1, tequila2, tequila3, tequila4,
        tequila5, tequila6, tequila7, tequila8
    };

    // Wine Brands
    static String wine1 = "Sula";
    static String wine2 = "Fratelli";
    static String wine3 = "Grover Zampa";
    static String wine4 = "York";
    static String wine5 = "Four Seasons";
    static String wine6 = "Big Banyan";
    static String wine7 = "Myra";
    static String wine8 = "Reveilo";
    static String[] wineBrands = {
        wine1, wine2, wine3, wine4,
        wine5, wine6, wine7, wine8
    };

    // Cocktails
    static String cocktail1 = "Mojito";
    static String cocktail2 = "Margarita";
    static String cocktail3 = "Martini";
    static String cocktail4 = "Whiskey Sour";
    static String cocktail5 = "Long Island Iced Tea";
    static String cocktail6 = "Cosmopolitan";
    static String cocktail7 = "Bloody Mary";
    static String cocktail8 = "Screwdriver";
    static String[] cocktails = {
        cocktail1, cocktail2, cocktail3, cocktail4,
        cocktail5, cocktail6, cocktail7, cocktail8
    };

    public static void main(String[] args) {
        System.out.println("Whisky Brands:");
        for (String brand : whiskyBrands) {
            System.out.println(brand);
        }

        System.out.println("\nVodka Brands:");
        for (String brand : vodkaBrands) {
            System.out.println(brand);
        }

        System.out.println("\nBeer Brands:");
        for (String brand : beerBrands) {
            System.out.println(brand);
        }

        System.out.println("\nRum Brands:");
        for (String brand : rumBrands) {
            System.out.println(brand);
        }

        System.out.println("\nGin Brands:");
        for (String brand : ginBrands) {
            System.out.println(brand);
        }

        System.out.println("\nTequila Brands:");
        for (String brand : tequilaBrands) {
            System.out.println(brand);
        }

        System.out.println("\nWine Brands:");
        for (String brand : wineBrands) {
            System.out.println(brand);
        }

        System.out.println("\nCocktails:");
        for (String drink : cocktails) {
            System.out.println(drink);
        }
    }
}
