class CasinoRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Casino casino = new Casino();

        System.out.println("id of casino = " + casino.casinoId);
        System.out.println("name = " + casino.name);
        System.out.println("location = " + casino.location);
        System.out.println("games = " + casino.numberOfGames);
        System.out.println("entry fee = " + casino.entryFee);
        System.out.println("open 24 hrs = " + casino.open24Hours);
        System.out.println("owner = " + casino.owner);

        casino.casinoId = 19;
        casino.name = "Royal Vegas";
        casino.location = "Goa";
        casino.numberOfGames = 50;
        casino.entryFee = 5000.0;
        casino.open24Hours = true;
        casino.owner = "Mr. Sharma";

        System.out.println("id of casino = " + casino.casinoId);
        System.out.println("name = " + casino.name);
        System.out.println("location = " + casino.location);
        System.out.println("games = " + casino.numberOfGames);
        System.out.println("entry fee = " + casino.entryFee);
        System.out.println("open 24 hrs = " + casino.open24Hours);
        System.out.println("owner = " + casino.owner);

        System.out.println("main ended");
    }
}
