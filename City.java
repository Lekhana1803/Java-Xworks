class City {
    static String pinCodes[] = {"560001", "110001", "400001", "700001", "600001", "500001", "380001", "302001"};
    static String areaNames[] = {"Indiranagar", "Connaught Place", "Bandra", "Salt Lake", "T. Nagar", "Banjara Hills", "Navrangpura", "Vaishali Nagar"};
    static String landmarks[] = {"Lalbagh", "India Gate", "Marine Drive", "Victoria Memorial", "Marina Beach", "Charminar", "Sabarmati Ashram", "Hawa Mahal"};
    static String metroStations[] = {"MG Road", "Rajiv Chowk", "Churchgate", "Esplanade", "Washermanpet", "Ameerpet", "Kalupur", "Chandpole"};
    static String malls[] = {"Orion Mall", "Select Citywalk", "Phoenix Mall", "South City Mall", "Express Avenue", "GVK Mall", "Ahmedabad One", "Triton Mall"};
    static String rivers[] = {"Arkavathi", "Yamuna", "Mithi", "Hooghly", "Cooum", "Musi", "Sabarmati", "Banas"};
    static String lakes[] = {"Ulsoor Lake", "Sanjay Lake", "Powai Lake", "Rabindra Sarobar", "Chetpet Lake", "Hussain Sagar", "Kankaria Lake", "Man Sagar Lake"};
    static String airports[] = {"Kempegowda Airport", "Indira Gandhi Airport", "Chhatrapati Shivaji Airport"};

    public static void main(String[] args) {
        System.out.println("Pin Codes: " + pinCodes[0] + ", " + pinCodes[1] + ", " + pinCodes[2]);
        System.out.println("Length: " + pinCodes.length);

        System.out.println("Area Names: " + areaNames[0] + ", " + areaNames[1] + ", " + areaNames[2]);
        System.out.println("Length: " + areaNames.length);

        System.out.println("Landmarks: " + landmarks[0] + ", " + landmarks[1] + ", " + landmarks[2]);
        System.out.println("Length: " + landmarks.length);

        System.out.println("Metro Stations: " + metroStations[0] + ", " + metroStations[1] + ", " + metroStations[2]);
        System.out.println("Length: " + metroStations.length);

        System.out.println("Malls: " + malls[0] + ", " + malls[1] + ", " + malls[2]);
        System.out.println("Length: " + malls.length);

        System.out.println("Rivers: " + rivers[0] + ", " + rivers[1] + ", " + rivers[2]);
        System.out.println("Length: " + rivers.length);

        System.out.println("Lakes: " + lakes[0] + ", " + lakes[1] + ", " + lakes[2]);
        System.out.println("Length: " + lakes.length);

        System.out.println("Airports: " + airports[0] + ", " + airports[1] + ", " + airports[2]);
        System.out.println("Length: " + airports.length);
    }
}
