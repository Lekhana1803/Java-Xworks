class PeriodicTable {

    // Alkali Metals
    static String alkali1 = "Lithium";
    static String alkali2 = "Sodium";
    static String alkali3 = "Potassium";
    static String[] alkaliMetals = { alkali1, alkali2, alkali3 };

    // Alkaline Earth Metals
    static String earth1 = "Beryllium";
    static String earth2 = "Magnesium";
    static String earth3 = "Calcium";
    static String[] alkalineEarthMetals = { earth1, earth2, earth3 };

    // Transition Metals
    static String trans1 = "Iron";
    static String trans2 = "Copper";
    static String trans3 = "Zinc";
    static String[] transitionMetals = { trans1, trans2, trans3 };

    // Metalloids
    static String met1 = "Boron";
    static String met2 = "Silicon";
    static String met3 = "Arsenic";
    static String[] metalloids = { met1, met2, met3 };

    // Non-Metals
    static String non1 = "Hydrogen";
    static String non2 = "Carbon";
    static String non3 = "Nitrogen";
    static String[] nonMetals = { non1, non2, non3 };

    // Noble Gases
    static String noble1 = "Helium";
    static String noble2 = "Neon";
    static String noble3 = "Argon";
    static String[] nobleGases = { noble1, noble2, noble3 };

    // Halogens
    static String halo1 = "Fluorine";
    static String halo2 = "Chlorine";
    static String halo3 = "Bromine";
    static String[] halogens = { halo1, halo2, halo3 };

    // Lanthanides
    static String lan1 = "Lanthanum";
    static String lan2 = "Cerium";
    static String lan3 = "Neodymium";
    static String[] lanthanides = { lan1, lan2, lan3 };

    public static void main(String[] args) {
        System.out.println("Alkali Metals:");
        for (String element : alkaliMetals) System.out.println(element);

        System.out.println("\nAlkaline Earth Metals:");
        for (String element : alkalineEarthMetals) System.out.println(element);

        System.out.println("\nTransition Metals:");
        for (String element : transitionMetals) System.out.println(element);

        System.out.println("\nMetalloids:");
        for (String element : metalloids) System.out.println(element);

        System.out.println("\nNon-Metals:");
        for (String element : nonMetals) System.out.println(element);

        System.out.println("\nNoble Gases:");
        for (String element : nobleGases) System.out.println(element);

        System.out.println("\nHalogens:");
        for (String element : halogens) System.out.println(element);

        System.out.println("\nLanthanides:");
        for (String element : lanthanides) System.out.println(element);
    }
}
