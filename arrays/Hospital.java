class Hospital {
    static String generalHospitals[] = {"Apollo Hospital", "Fortis Hospital", "Manipal Hospital", "Max Hospital", "Columbia Asia", "AIIMS Delhi", "Narayana Health", "Global Hospital"};
    static String multiSpecialtyHospitals[] = {"Aster CMI", "Medanta", "BLK Hospital", "Continental Hospital", "Cloudnine", "Care Hospitals", "Yashoda Hospital", "Sunshine Hospital"};
    static String eyeHospitals[] = {"LV Prasad Eye Institute", "Narayana Nethralaya", "Dr. Agarwal's Eye Hospital", "Shankar Netralaya", "Vasan Eye Care", "Centre for Sight", "Netralaya", "Bansal Eye Care"};
    static String dentalHospitals[] = {"Clove Dental", "Partha Dental", "Sabka Dentist", "32 Dental", "Apollo White Dental", "Smile Dental", "Denty’s", "Perfect 32"};
    static String childrenHospitals[] = {"Rainbow Children's Hospital", "Motherhood", "Fernandez Hospital", "Surya Hospitals", "Lotus Hospitals", "Ovum", "KIMS Cuddles", "Neon"};
    static String cancerHospitals[] = {"Tata Memorial Hospital", "Kidwai Cancer Institute", "Apollo Cancer Centre", "Rajiv Gandhi Cancer Institute", "Adyar Cancer Institute", "Fortis Cancer Institute", "Max Oncology", "AIIMS Cancer Centre"};
    static String heartHospitals[] = {"Asian Heart Institute", "Fortis Escorts Heart Institute", "Jayadeva Hospital", "Narayana Institute of Cardiac Sciences", "Apollo Heart Centre", "Max Heart Hospital", "Care Heart Institute", "Medanta Heart Institute"};
    static String governmentHospitals[] = {"AIIMS Delhi", "Victoria Hospital", "Bowring Hospital", "NIMHANS", "Rajiv Gandhi Govt Hospital", "Osmania General Hospital", "Stanley Medical College", "Sion Hospital"};

    public static void main(String[] args) {
        System.out.println("General Hospitals: " + generalHospitals[0] + ", " + generalHospitals[1] + ", " + generalHospitals[2]);
        System.out.println("Length: " + generalHospitals.length);

        System.out.println("Multi-specialty Hospitals: " + multiSpecialtyHospitals[0] + ", " + multiSpecialtyHospitals[1] + ", " + multiSpecialtyHospitals[2]);
        System.out.println("Length: " + multiSpecialtyHospitals.length);

        System.out.println("Eye Hospitals: " + eyeHospitals[0] + ", " + eyeHospitals[1] + ", " + eyeHospitals[2]);
        System.out.println("Length: " + eyeHospitals.length);

        System.out.println("Dental Hospitals: " + dentalHospitals[0] + ", " + dentalHospitals[1] + ", " + dentalHospitals[2]);
        System.out.println("Length: " + dentalHospitals.length);

        System.out.println("Children Hospitals: " + childrenHospitals[0] + ", " + childrenHospitals[1] + ", " + childrenHospitals[2]);
        System.out.println("Length: " + childrenHospitals.length);

        System.out.println("Cancer Hospitals: " + cancerHospitals[0] + ", " + cancerHospitals[1] + ", " + cancerHospitals[2]);
        System.out.println("Length: " + cancerHospitals.length);

        System.out.println("Heart Hospitals: " + heartHospitals[0] + ", " + heartHospitals[1] + ", " + heartHospitals[2]);
        System.out.println("Length: " + heartHospitals.length);

        System.out.println("Government Hospitals: " + governmentHospitals[0] + ", " + governmentHospitals[1] + ", " + governmentHospitals[2]);
        System.out.println("Length: " + governmentHospitals.length);
    }
}
