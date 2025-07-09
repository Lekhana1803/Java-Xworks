class Iplmeth {
    static String teamnames[] = {"RCB", "CSK", "MI", "GT", "LSG", "KKR", "SRH", "PBKS", "RR", "DC"};

    // Method to display IPL team names
    static void displayTeams() {
        System.out.println("IPL Teams:");
        for (String team : teamnames) {
            System.out.println(team);
        }
    }

    public static void main(String[] ipl) {
        displayTeams(); // Call the method to print teams
    }
}
