class SpiceShop {

    // Powdered Spices
    static String powder1 = "Turmeric";
    static String powder2 = "Cumin Powder";
    static String powder3 = "Coriander Powder";
    static String powder4 = "Red Chili Powder";
    static String[] powderedSpices = {
        powder1, powder2, powder3, powder4
    };

    // Whole Spices
    static String whole1 = "Cloves";
    static String whole2 = "Cardamom";
    static String whole3 = "Cinnamon";
    static String whole4 = "Black Pepper";
    static String[] wholeSpices = {
        whole1, whole2, whole3, whole4
    };

    // Spice Blends
    static String blend1 = "Garam Masala";
    static String blend2 = "Sambar Powder";
    static String blend3 = "Chaat Masala";
    static String[] spiceBlends = {
        blend1, blend2, blend3
    };

    // Seeds
    static String seed1 = "Mustard Seeds";
    static String seed2 = "Fenugreek Seeds";
    static String seed3 = "Fennel Seeds";
    static String[] seeds = {
        seed1, seed2, seed3
    };

    // Herbs
    static String herb1 = "Basil";
    static String herb2 = "Oregano";
    static String herb3 = "Thyme";
    static String herb4 = "Bay Leaf";
    static String[] herbs = {
        herb1, herb2, herb3, herb4
    };

    // Dried Leaves
    static String leaf1 = "Curry Leaves";
    static String leaf2 = "Mint Leaves";
    static String leaf3 = "Kaffir Lime Leaves";
    static String[] driedLeaves = {
        leaf1, leaf2, leaf3
    };

    // Seasoning Mixes
    static String season1 = "Tandoori Masala";
    static String season2 = "Pav Bhaji Masala";
    static String season3 = "Biryani Masala";
    static String[] seasoningMixes = {
        season1, season2, season3
    };

    // Regional Spices
    static String region1 = "Kashmiri Chili";
    static String region2 = "Malvani Masala";
    static String region3 = "Chettinad Masala";
    static String[] regionalSpices = {
        region1, region2, region3
    };

    public static void main(String[] args) {
        System.out.println("Powdered Spices:");
        for (String item : powderedSpices) System.out.println(item);

        System.out.println("\nWhole Spices:");
        for (String item : wholeSpices) System.out.println(item);

        System.out.println("\nSpice Blends:");
        for (String item : spiceBlends) System.out.println(item);

        System.out.println("\nSeeds:");
        for (String item : seeds) System.out.println(item);

        System.out.println("\nHerbs:");
        for (String item : herbs) System.out.println(item);

        System.out.println("\nDried Leaves:");
        for (String item : driedLeaves) System.out.println(item);

        System.out.println("\nSeasoning Mixes:");
        for (String item : seasoningMixes) System.out.println(item);

        System.out.println("\nRegional Spices:");
        for (String item : regionalSpices) System.out.println(item);
    }
}
