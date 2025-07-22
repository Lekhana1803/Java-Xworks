class FlowersRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Flowers flower = new Flowers();

        System.out.println("id of flower = " + flower.flowerId);
        System.out.println("name = " + flower.name);
        System.out.println("color = " + flower.color);
        System.out.println("price per kg = " + flower.pricePerKg);
        System.out.println("fragrance = " + flower.fragrance);
        System.out.println("season = " + flower.season);
        System.out.println("decorative = " + flower.decorative);

        flower.flowerId = 17;
        flower.name = "Rose";
        flower.color = "Red";
        flower.pricePerKg = 500.0;
        flower.fragrance = "Sweet";
        flower.season = "Winter";
        flower.decorative = true;

        System.out.println("id of flower = " + flower.flowerId);
        System.out.println("name = " + flower.name);
        System.out.println("color = " + flower.color);
        System.out.println("price per kg = " + flower.pricePerKg);
        System.out.println("fragrance = " + flower.fragrance);
        System.out.println("season = " + flower.season);
        System.out.println("decorative = " + flower.decorative);

        System.out.println("main ended");
    }
}
