class Hospital {

    // General Hospitals
    static String gen1 = "Apollo Hospital";
    static String gen2 = "Fortis Hospital";
    static String gen3 = "Manipal Hospital";
    static String gen4 = "Max Hospital";
    static String gen5 = "Columbia Asia";
    static String gen6 = "AIIMS Delhi";
    static String gen7 = "Narayana Health";
    static String gen8 = "Global Hospital";
    static String[] generalHospitals = {
        gen1, gen2, gen3, gen4,
        gen5, gen6, gen7, gen8
    };

    // Multi-specialty Hospitals
    static String multi1 = "Aster CMI";
    static String multi2 = "Medanta";
    static String multi3 = "BLK Hospital";
    static String multi4 = "Continental Hospital";
    static String multi5 = "Cloudnine";
    static String multi6 = "Care Hospitals";
    static String multi7 = "Yashoda Hospital";
    static String multi8 = "Sunshine Hospital";
    static String[] multiSpecialtyHospitals = {
        multi1, multi2, multi3, multi4,
        multi5, multi6, multi7, multi8
    };

    // Eye Hospitals
    static String eye1 = "LV Prasad Eye Institute";
    static String eye2 = "Narayana Nethralaya";
    static String eye3 = "Dr. Agarwal's Eye Hospital";
    static String eye4 = "Shankar Netralaya";
    static String eye5 = "Vasan Eye Care";
    static String eye6 = "Centre for Sight";
    static String eye7 = "Netralaya";
    static String eye8 = "Bansal Eye Care";
    static String[] eyeHospitals = {
        eye1, eye2, eye3, eye4,
        eye5, eye6, eye7, eye8
    };

    // Dental Hospitals
    static String dental1 = "Clove Dental";
    static String dental2 = "Partha Dental";
    static String dental3 = "Sabka Dentist";
    static String dental4 = "32 Dental";
    static String dental5 = "Apollo White Dental";
    static String dental6 = "Smile Dental";
    static String dental7 = "Denty’s";
    static String dental8 = "Perfect 32";
    static String[] dentalHospitals = {
        dental1, dental2, dental3, dental4,
        dental5, dental6, dental7, dental8
    };

    // Children Hospitals
    static String child1 = "Rainbow Children's Hospital";
    static String child2 = "Motherhood";
    static String child3 = "Fernandez Hospital";
    static String child4 = "Surya Hospitals";
    static String child5 = "Lotus Hospitals";
    static String child6 = "Ovum";
    static String child7 = "KIMS Cuddles";
    static String child8 = "Neon";
    static String[] childrenHospitals = {
        child1, child2, child3, child4,
        child5, child6, child7, child8
    };

    // Cancer Hospitals
    static String cancer1 = "Tata Memorial Hospital";
    static String cancer2 = "Kidwai Cancer Institute";
    static String cancer3 = "Apollo Cancer Centre";
    static String cancer4 = "Rajiv Gandhi Cancer Institute";
    static String cancer5 = "Adyar Cancer Institute";
    static String cancer6 = "Fortis Cancer Institute";
    static String cancer7 = "Max Oncology";
    static String cancer8 = "AIIMS Cancer Centre";
    static String[] cancerHospitals = {
        cancer1, cancer2, cancer3, cancer4,
        cancer5, cancer6, cancer7, cancer8
    };

    // Heart Hospitals
    static String heart1 = "Asian Heart Institute";
    static String heart2 = "Fortis Escorts Heart Institute";
    static String heart3 = "Jayadeva Hospital";
    static String heart4 = "Narayana Institute of Cardiac Sciences";
    static String heart5 = "Apollo Heart Centre";
    static String heart6 = "Max Heart Hospital";
    static String heart7 = "Care Heart Institute";
    static String heart8 = "Medanta Heart Institute";
    static String[] heartHospitals = {
        heart1, heart2, heart3, heart4,
        heart5, heart6, heart7, heart8
    };

    // Government Hospitals
    static String gov1 = "AIIMS Delhi";
    static String gov2 = "Victoria Hospital";
    static String gov3 = "Bowring Hospital";
    static String gov4 = "NIMHANS";
    static String gov5 = "Rajiv Gandhi Govt Hospital";
    static String gov6 = "Osmania General Hospital";
    static String gov7 = "Stanley Medical College";
    static String gov8 = "Sion Hospital";
    static String[] governmentHospitals = {
        gov1, gov2, gov3, gov4,
        gov5, gov6, gov7, gov8
    };

    public static void main(String[] args) {
        System.out.println("General Hospitals:");
        for (String item : generalHospitals) System.out.println(item);

        System.out.println("\nMulti-specialty Hospitals:");
        for (String item : multiSpecialtyHospitals) System.out.println(item);

        System.out.println("\nEye Hospitals:");
        for (String item : eyeHospitals) System.out.println(item);

        System.out.println("\nDental Hospitals:");
        for (String item : dentalHospitals) System.out.println(item);

        System.out.println("\nChildren Hospitals:");
        for (String item : childrenHospitals) System.out.println(item);

        System.out.println("\nCancer Hospitals:");
        for (String item : cancerHospitals) System.out.println(item);

        System.out.println("\nHeart Hospitals:");
        for (String item : heartHospitals) System.out.println(item);

        System.out.println("\nGovernment Hospitals:");
        for (String item : governmentHospitals) System.out.println(item);
    }
}
