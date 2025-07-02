class SocialMediaPlatforms {

    // Messaging Apps
    static String msg1 = "WhatsApp";
    static String msg2 = "Telegram";
    static String msg3 = "Signal";
    static String msg4 = "Messenger";
    static String msg5 = "WeChat";
    static String msg6 = "LINE";
    static String msg7 = "Viber";
    static String msg8 = "Snapchat";
    static String[] messagingApps = {
        msg1, msg2, msg3, msg4,
        msg5, msg6, msg7, msg8
    };

    // Photo Sharing Apps
    static String photo1 = "Instagram";
    static String photo2 = "Pinterest";
    static String photo3 = "Snapchat";
    static String photo4 = "VSCO";
    static String photo5 = "Flickr";
    static String photo6 = "Retrica";
    static String photo7 = "B612";
    static String photo8 = "Dispo";
    static String[] photoSharingApps = {
        photo1, photo2, photo3, photo4,
        photo5, photo6, photo7, photo8
    };

    // Video Sharing Apps
    static String video1 = "YouTube";
    static String video2 = "TikTok";
    static String video3 = "Vimeo";
    static String video4 = "Likee";
    static String video5 = "Triller";
    static String video6 = "MX TakaTak";
    static String video7 = "Reels";
    static String video8 = "IGTV";
    static String[] videoSharingApps = {
        video1, video2, video3, video4,
        video5, video6, video7, video8
    };

    // Microblogging Apps
    static String micro1 = "X (Twitter)";
    static String micro2 = "Threads";
    static String micro3 = "Koo";
    static String micro4 = "Tumblr";
    static String micro5 = "Plurk";
    static String micro6 = "Parler";
    static String micro7 = "Gab";
    static String micro8 = "Mastodon";
    static String[] microbloggingApps = {
        micro1, micro2, micro3, micro4,
        micro5, micro6, micro7, micro8
    };

    // Professional Apps
    static String prof1 = "LinkedIn";
    static String prof2 = "GitHub";
    static String prof3 = "ResearchGate";
    static String prof4 = "Behance";
    static String prof5 = "Dribbble";
    static String prof6 = "AngelList";
    static String prof7 = "XING";
    static String prof8 = "Jobcase";
    static String[] professionalApps = {
        prof1, prof2, prof3, prof4,
        prof5, prof6, prof7, prof8
    };

    // Social Networking Apps
    static String net1 = "Facebook";
    static String net2 = "Google+";
    static String net3 = "MeWe";
    static String net4 = "Clubhouse";
    static String net5 = "Diaspora";
    static String net6 = "VK";
    static String net7 = "Nextdoor";
    static String net8 = "Ello";
    static String[] socialNetworkingApps = {
        net1, net2, net3, net4,
        net5, net6, net7, net8
    };

    // Content Sharing Apps
    static String cont1 = "Reddit";
    static String cont2 = "Quora";
    static String cont3 = "Medium";
    static String cont4 = "Tumblr";
    static String cont5 = "Wattpad";
    static String cont6 = "Substack";
    static String cont7 = "Stack Overflow";
    static String cont8 = "Product Hunt";
    static String[] contentSharingApps = {
        cont1, cont2, cont3, cont4,
        cont5, cont6, cont7, cont8
    };

    // Dating Apps
    static String date1 = "Tinder";
    static String date2 = "Bumble";
    static String date3 = "Hinge";
    static String date4 = "OkCupid";
    static String date5 = "Plenty of Fish";
    static String date6 = "Happn";
    static String date7 = "TrulyMadly";
    static String date8 = "Coffee Meets Bagel";
    static String[] datingApps = {
        date1, date2, date3, date4,
        date5, date6, date7, date8
    };

    public static void main(String[] args) {
        System.out.println("Messaging Apps:");
        for (String app : messagingApps) System.out.println(app);

        System.out.println("\nPhoto Sharing Apps:");
        for (String app : photoSharingApps) System.out.println(app);

        System.out.println("\nVideo Sharing Apps:");
        for (String app : videoSharingApps) System.out.println(app);

        System.out.println("\nMicroblogging Apps:");
        for (String app : microbloggingApps) System.out.println(app);

        System.out.println("\nProfessional Apps:");
        for (String app : professionalApps) System.out.println(app);

        System.out.println("\nSocial Networking Apps:");
        for (String app : socialNetworkingApps) System.out.println(app);

        System.out.println("\nContent Sharing Apps:");
        for (String app : contentSharingApps) System.out.println(app);

        System.out.println("\nDating Apps:");
        for (String app : datingApps) System.out.println(app);
    }
}
