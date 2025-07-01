class PlayStation {
    static String actionGames[] = {"God of War", "Uncharted 4", "The Last of Us"};
    static String adventureGames[] = {"Horizon Zero Dawn", "Spider-Man", "Ghost of Tsushima"};
    static String racingGames[] = {"Gran Turismo", "Need for Speed", "F1 2021"};
    static String sportsGames[] = {"FIFA 23", "NBA 2K23", "WWE 2K22"};
    static String shooterGames[] = {"Call of Duty", "Battlefield", "Fortnite"};
    static String rpgGames[] = {"Bloodborne", "Elden Ring", "Final Fantasy XV"};
    static String platformGames[] = {"Ratchet & Clank", "Crash Bandicoot", "LittleBigPlanet"};
    static String fightingGames[] = {"Tekken 7", "Mortal Kombat", "Street Fighter V"};

    public static void main(String[] args) {
		
        System.out.println("Action Games: " + actionGames[0] + ", " + actionGames[1] + ", " + actionGames[2]);
        System.out.println("Length: " + actionGames.length);

        System.out.println("Adventure Games: " + adventureGames[0] + ", " + adventureGames[1] + ", " + adventureGames[2]);
        System.out.println("Length: " + adventureGames.length);

        System.out.println("Racing Games: " + racingGames[0] + ", " + racingGames[1] + ", " + racingGames[2]);
        System.out.println("Length: " + racingGames.length);

        System.out.println("Sports Games: " + sportsGames[0] + ", " + sportsGames[1] + ", " + sportsGames[2]);
        System.out.println("Length: " + sportsGames.length);

        System.out.println("Shooter Games: " + shooterGames[0] + ", " + shooterGames[1] + ", " + shooterGames[2]);
        System.out.println("Length: " + shooterGames.length);

        System.out.println("RPG Games: " + rpgGames[0] + ", " + rpgGames[1] + ", " + rpgGames[2]);
        System.out.println("Length: " + rpgGames.length);

        System.out.println("Platform Games: " + platformGames[0] + ", " + platformGames[1] + ", " + platformGames[2]);
        System.out.println("Length: " + platformGames.length);

        System.out.println("Fighting Games: " + fightingGames[0] + ", " + fightingGames[1] + ", " + fightingGames[2]);
        System.out.println("Length: " + fightingGames.length);
    }
}
