class PlayStationmeth {
    static String actionAdventure[] = {
        "The Last of Us Part I", "God of War Ragnarök", "Marvel's Spider-Man 2"
    };

    static String openWorld[] = {
        "Horizon Forbidden West", "Elden Ring", "Ghost of Tsushima Director's Cut"
    };

    static String shooter[] = {
        "DOOM Eternal", "Helldivers 2"
    };

    // Method to display Action Adventure games
    static void displayActionAdventure() {
        System.out.println("Action Adventure Games:");
        for (String game : actionAdventure) {
            System.out.println(game);
        }
    }

    // Method to display Open World games
    static void displayOpenWorld() {
        System.out.println("Open World Games:");
        for (String game : openWorld) {
            System.out.println(game);
        }
    }

    // Method to display Shooter games
    static void displayShooter() {
        System.out.println("Shooter Games:");
        for (String game : shooter) {
            System.out.println(game);
        }
    }

    public static void main(String[] playstation) {
        displayActionAdventure();
        displayOpenWorld();
        displayShooter();
    }
}
