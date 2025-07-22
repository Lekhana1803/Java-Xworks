class CrackersRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Crackers cracker = new Crackers();

        System.out.println("id of cracker = " + cracker.crackerId);
        System.out.println("name = " + cracker.name);
        System.out.println("type = " + cracker.type);
        System.out.println("price = " + cracker.price);
        System.out.println("weight = " + cracker.weight);
        System.out.println("eco-friendly = " + cracker.ecoFriendly);
        System.out.println("manufacturer = " + cracker.manufacturer);

        cracker.crackerId = 15;
        cracker.name = "Flower Pot";
        cracker.type = "Sparkler";
        cracker.price = 120.0;
        cracker.weight = 0.5;
        cracker.ecoFriendly = true;
        cracker.manufacturer = "SafeCrackers Ltd";

        System.out.println("id of cracker = " + cracker.crackerId);
        System.out.println("name = " + cracker.name);
        System.out.println("type = " + cracker.type);
        System.out.println("price = " + cracker.price);
        System.out.println("weight = " + cracker.weight);
        System.out.println("eco-friendly = " + cracker.ecoFriendly);
        System.out.println("manufacturer = " + cracker.manufacturer);

        System.out.println("main ended");
    }
}
