class CoinsRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Coins coin = new Coins();

        System.out.println("id of coin = " + coin.coinId);
        System.out.println("material = " + coin.material);
        System.out.println("weight = " + coin.weight);
        System.out.println("diameter = " + coin.diameter);
        System.out.println("value = " + coin.value);
        System.out.println("country = " + coin.country);
        System.out.println("year = " + coin.year);

        coin.coinId = 5;
        coin.material = "Copper";
        coin.weight = 5.2;
        coin.diameter = 2.5;
        coin.value = 10;
        coin.country = "India";
        coin.year = 2024;

        System.out.println("id of coin = " + coin.coinId);
        System.out.println("material = " + coin.material);
        System.out.println("weight = " + coin.weight);
        System.out.println("diameter = " + coin.diameter);
        System.out.println("value = " + coin.value);
        System.out.println("country = " + coin.country);
        System.out.println("year = " + coin.year);

        System.out.println("main ended");
    }
}
