class PlayStation {

    // Action Games
    static String action1 = "God of War";
    static String action2 = "Uncharted 4";
    static String action3 = "The Last of Us";
    static String[] actionGames = {
        action1, action2, action3
    };

    // Adventure Games
    static String adventure1 = "Horizon Zero Dawn";
    static String adventure2 = "Spider-Man";
    static String adventure3 = "Ghost of Tsushima";
    static String[] adventureGames = {
        adventure1, adventure2, adventure3
    };

    // Racing Games
    static String racing1 = "Gran Turismo";
    static String racing2 = "Need for Speed";
    static String racing3 = "F1 2021";
    static String[] racingGames = {
        racing1, racing2, racing3
    };

    // Sports Games
    static String sports1 = "FIFA 23";
    static String sports2 = "NBA 2K23";
    static String sports3 = "WWE 2K22";
    static String[] sportsGames = {
        sports1, sports2, sports3
    };

    // Shooter Games
    static String shooter1 = "Call of Duty";
    static String shooter2 = "Battlefield";
    static String shooter3 = "Fortnite";
    static String[] shooterGames = {
        shooter1, shooter2, shooter3
    };

    // RPG Games
    static String rpg1 = "Bloodborne";
    static String rpg2 = "Elden Ring";
    static String rpg3 = "Final Fantasy XV";
    static String[] rpgGames = {
        rpg1, rpg2, rpg3
    };

    // Platform Games
    static String platform1 = "Ratchet & Clank";
    static String platform2 = "Crash Bandicoot";
    static String platform3 = "LittleBigPlanet";
    static String[] platformGames = {
        platform1, platform2, platform3
    };

    // Fighting Games
    static String fight1 = "Tekken 7";
    static String fight2 = "Mortal Kombat";
    static String fight3 = "Street Fighter V";
    static String[] fightingGames = {
        fight1, fight2, fight3
    };

    public static void main(String[] args) {
        System.out.println("Action Games:");
        for (String game : actionGames) System.out.println(game);

        System.out.println("\nAdventure Games:");
        for (String game : adventureGames) System.out.println(game);

        System.out.println("\nRacing Games:");
        for (String game : racingGames) System.out.println(game);

        System.out.println("\nSports Games:");
        for (String game : sportsGames) System.out.println(game);

        System.out.println("\nShooter Games:");
        for (String game : shooterGames) System.out.println(game);

        System.out.println("\nRPG Games:");
        for (String game : rpgGames) System.out.println(game);

        System.out.println("\nPlatform Games:");
        for (String game : platformGames) System.out.println(game);

        System.out.println("\nFighting Games:");
        for (String game : fightingGames) System.out.println(game);
    }
}
