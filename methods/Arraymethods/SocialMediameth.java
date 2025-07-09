class SocialMediameth {
    static String majorPlatforms[] = {"Facebook", "YouTube", "Instagram"};
    static String messagingApps[] = {"WhatsApp", "Telegram", "Messenger"};
    static String shortVideoApps[] = {"TikTok", "Snapchat"};
    static String nichePlatforms[] = {"Pinterest", "LinkedIn"};

    // Method to display major platforms
    static void displayMajorPlatforms() {
        System.out.println("Major Platforms:");
        for (String platform : majorPlatforms) {
            System.out.println(platform);
        }
    }

    // Method to display messaging apps
    static void displayMessagingApps() {
        System.out.println("Messaging Apps:");
        for (String app : messagingApps) {
            System.out.println(app);
        }
    }

    // Method to display short video apps
    static void displayShortVideoApps() {
        System.out.println("Short Video Apps:");
        for (String app : shortVideoApps) {
            System.out.println(app);
        }
    }

    // Method to display niche platforms
    static void displayNichePlatforms() {
        System.out.println("Niche Platforms:");
        for (String site : nichePlatforms) {
            System.out.println(site);
        }
    }

    public static void main(String[] media) {
        displayMajorPlatforms();
        displayMessagingApps();
        displayShortVideoApps();
        displayNichePlatforms();
    }
}
