class PeriodicTable {
    static String alkaliMetals[] = {"Lithium", "Sodium", "Potassium"};
    static String alkalineEarthMetals[] = {"Beryllium", "Magnesium", "Calcium"};
    static String transitionMetals[] = {"Iron", "Copper", "Zinc"};
    static String metalloids[] = {"Boron", "Silicon", "Arsenic"};
    static String nonMetals[] = {"Hydrogen", "Carbon", "Nitrogen"};
    static String nobleGases[] = {"Helium", "Neon", "Argon"};
    static String halogens[] = {"Fluorine", "Chlorine", "Bromine"};
    static String lanthanides[] = {"Lanthanum", "Cerium", "Neodymium"};

    public static void main(String[] args) {
        System.out.println("Alkali Metals: " + alkaliMetals[0] + ", " + alkaliMetals[1] + ", " + alkaliMetals[2]);
        System.out.println("Length: " + alkaliMetals.length);

        System.out.println("Alkaline Earth Metals: " + alkalineEarthMetals[0] + ", " + alkalineEarthMetals[1] + ", " + alkalineEarthMetals[2]);
        System.out.println("Length: " + alkalineEarthMetals.length);

        System.out.println("Transition Metals: " + transitionMetals[0] + ", " + transitionMetals[1] + ", " + transitionMetals[2]);
        System.out.println("Length: " + transitionMetals.length);

        System.out.println("Metalloids: " + metalloids[0] + ", " + metalloids[1] + ", " + metalloids[2]);
        System.out.println("Length: " + metalloids.length);

        System.out.println("Non-Metals: " + nonMetals[0] + ", " + nonMetals[1] + ", " + nonMetals[2]);
        System.out.println("Length: " + nonMetals.length);

        System.out.println("Noble Gases: " + nobleGases[0] + ", " + nobleGases[1] + ", " + nobleGases[2]);
        System.out.println("Length: " + nobleGases.length);

        System.out.println("Halogens: " + halogens[0] + ", " + halogens[1] + ", " + halogens[2]);
        System.out.println("Length: " + halogens.length);

        System.out.println("Lanthanides: " + lanthanides[0] + ", " + lanthanides[1] + ", " + lanthanides[2]);
        System.out.println("Length: " + lanthanides.length);
		
		/*looping statments
		for(String nonMetals : nonMetals){
			System.out.println(nonMetals);
		}*/
    }
}
