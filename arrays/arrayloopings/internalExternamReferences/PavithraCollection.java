class PavithraCollection {

    // Saree Brands
    static String saree1 = "Nalli";
    static String saree2 = "Pothys";
    static String saree3 = "RMKV";
    static String saree4 = "Kanchipuram Silks";
    static String saree5 = "Kalanjali";
    static String saree6 = "Samyakk";
    static String saree7 = "Vijayalakshmi Silks";
    static String saree8 = "Tulsi Silks";
    static String[] sareeBrands = {
        saree1, saree2, saree3, saree4,
        saree5, saree6, saree7, saree8
    };

    // Kurti Brands
    static String kurti1 = "W for Women";
    static String kurti2 = "Aurelia";
    static String kurti3 = "Biba";
    static String kurti4 = "Libas";
    static String kurti5 = "Global Desi";
    static String kurti6 = "Melange";
    static String kurti7 = "Soch";
    static String kurti8 = "Indya";
    static String[] kurtiBrands = {
        kurti1, kurti2, kurti3, kurti4,
        kurti5, kurti6, kurti7, kurti8
    };

    // Menswear Brands
    static String men1 = "Peter England";
    static String men2 = "Raymond";
    static String men3 = "Louis Philippe";
    static String men4 = "Allen Solly";
    static String men5 = "Van Heusen";
    static String men6 = "Manyavar";
    static String men7 = "Blackberrys";
    static String men8 = "Indian Terrain";
    static String[] menswearBrands = {
        men1, men2, men3, men4,
        men5, men6, men7, men8
    };

    // Kidswear Brands
    static String kids1 = "Gini & Jony";
    static String kids2 = "Mini Klub";
    static String kids3 = "Lilliput";
    static String kids4 = "UCB Kids";
    static String kids5 = "Mothercare";
    static String kids6 = "Chicco";
    static String kids7 = "Hopscotch";
    static String kids8 = "Cucumber";
    static String[] kidswearBrands = {
        kids1, kids2, kids3, kids4,
        kids5, kids6, kids7, kids8
    };

    // Western Wear Brands
    static String west1 = "ONLY";
    static String west2 = "VERO MODA";
    static String west3 = "ZARA";
    static String west4 = "H&M";
    static String west5 = "Forever 21";
    static String west6 = "Faballey";
    static String west7 = "DressBerry";
    static String west8 = "AND";
    static String[] westernWearBrands = {
        west1, west2, west3, west4,
        west5, west6, west7, west8
    };

    // Ethnic Wear Brands
    static String ethnic1 = "FabIndia";
    static String ethnic2 = "Biba";
    static String ethnic3 = "Aurelia";
    static String ethnic4 = "W";
    static String ethnic5 = "Global Desi";
    static String ethnic6 = "Soch";
    static String ethnic7 = "Rain & Rainbow";
    static String ethnic8 = "Inddus";
    static String[] ethnicWearBrands = {
        ethnic1, ethnic2, ethnic3, ethnic4,
        ethnic5, ethnic6, ethnic7, ethnic8
    };

    // Footwear Brands
    static String foot1 = "Bata";
    static String foot2 = "Red Tape";
    static String foot3 = "Metro";
    static String foot4 = "Liberty";
    static String foot5 = "Puma";
    static String foot6 = "Nike";
    static String foot7 = "Adidas";
    static String foot8 = "Catwalk";
    static String[] footwearBrands = {
        foot1, foot2, foot3, foot4,
        foot5, foot6, foot7, foot8
    };

    // Accessories Brands
    static String acc1 = "Fossil";
    static String acc2 = "Titan";
    static String acc3 = "Voylla";
    static String acc4 = "Peora";
    static String acc5 = "Clara";
    static String acc6 = "Estelle";
    static String acc7 = "Joker & Witch";
    static String acc8 = "Pipa Bella";
    static String[] accessoriesBrands = {
        acc1, acc2, acc3, acc4,
        acc5, acc6, acc7, acc8
    };

    public static void main(String[] args) {
        System.out.println("Saree Brands:");
        for (String brand : sareeBrands) System.out.println(brand);

        System.out.println("\nKurti Brands:");
        for (String brand : kurtiBrands) System.out.println(brand);

        System.out.println("\nMenswear Brands:");
        for (String brand : menswearBrands) System.out.println(brand);

        System.out.println("\nKidswear Brands:");
        for (String brand : kidswearBrands) System.out.println(brand);

        System.out.println("\nWestern Wear Brands:");
        for (String brand : westernWearBrands) System.out.println(brand);

        System.out.println("\nEthnic Wear Brands:");
        for (String brand : ethnicWearBrands) System.out.println(brand);

        System.out.println("\nFootwear Brands:");
        for (String brand : footwearBrands) System.out.println(brand);

        System.out.println("\nAccessories Brands:");
        for (String brand : accessoriesBrands) System.out.println(brand);
    }
}
