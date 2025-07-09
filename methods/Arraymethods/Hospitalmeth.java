class Hospitalmeth {
    static String cardiologists[] = {
        "Dr. Ashok Seth", "Dr. Devi Prasad Shetty", "Dr. Naresh Trehan"
    };

    static String specialists[] = {
        "Dr. Priyadarshi Ranjan", "Dr. Randeep Guleria", "Dr. D. Nageshwar Reddy",
        "Dr. Abhideep Chaudhary", "Dr. Subhash Gupta", "Dr. Naresh Trehan Jr.", "Dr. Deepak Namjoshi"
    };

    // Method to display cardiologists
    static void displayCardiologists() {
        System.out.println("Cardiologists:");
        for (String doctor : cardiologists) {
            System.out.println(doctor);
        }
    }

    // Method to display specialists
    static void displaySpecialists() {
        System.out.println("Specialists:");
        for (String doctor : specialists) {
            System.out.println(doctor);
        }
    }

    public static void main(String[] hospital) {
        displayCardiologists();  // Call to print cardiologists
        displaySpecialists();    // Call to print specialists
    }
}
