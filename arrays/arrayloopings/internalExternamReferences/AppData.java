class AppData {
    
    static String social1 = "WhatsApp";
    static String social2 = "Instagram";
    static String social3 = "Facebook";
    static String social4 = "Snapchat";
    static String social5 = "X (Twitter)";
    static String social6 = "Telegram";
    static String social7 = "Threads";
    static String social8 = "Clubhouse";
    static String[] socialApps = {social1, social2, social3,social4, social5, social6, social7, social8 };

    
    static String entertainment1 = "Netflix";
    static String entertainment2 = "Amazon Prime Video";
    static String entertainment3 = "Disney+ Hotstar";
    static String entertainment4 = "YouTube";
    static String entertainment5 = "MX Player";
    static String entertainment6 = "JioCinema";
    static String entertainment7 = "ZEE5";
    static String entertainment8 = "Spotify";
    static String[] entertainmentApps = {
        entertainment1, entertainment2, entertainment3, entertainment4,
        entertainment5, entertainment6, entertainment7, entertainment8
    };

    
    static String education1 = "Google Classroom";
    static String education2 = "BYJU'S";
    static String education3 = "Khan Academy";
    static String education4 = "Coursera";
    static String education5 = "Udemy";
    static String education6 = "Unacademy";
    static String education7 = "Vedantu";
    static String education8 = "Duolingo";
    static String[] educationApps = {
        education1, education2, education3, education4,
        education5, education6, education7, education8
    };

    
    public static void main(String[] args) {
        System.out.println("Top Social Apps:");
        for (String app : socialApps) {
            System.out.println(app);
        }

        System.out.println("\nTop Entertainment Apps:");
        for (String app : entertainmentApps) {
            System.out.println(app);
        }

        System.out.println("\nTop Education Apps:");
        for (String app : educationApps) {
            System.out.println(app);
        }
    }
}
