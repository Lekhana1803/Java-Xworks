class JewelleryRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Jewellery jewel = new Jewellery();

        System.out.println("id of jewellery = " + jewel.jewelleryId);
        System.out.println("type = " + jewel.type);
        System.out.println("material = " + jewel.material);
        System.out.println("weight = " + jewel.weight);
        System.out.println("price = " + jewel.price);
        System.out.println("design = " + jewel.design);
        System.out.println("brand = " + jewel.brand);

        jewel.jewelleryId = 6;
        jewel.type = "Necklace";
        jewel.material = "Gold";
        jewel.weight = 25.5;
        jewel.price = 150000.75;
        jewel.design = "Traditional";
        jewel.brand = "Tanishq";

        System.out.println("id of jewellery = " + jewel.jewelleryId);
        System.out.println("type = " + jewel.type);
        System.out.println("material = " + jewel.material);
        System.out.println("weight = " + jewel.weight);
        System.out.println("price = " + jewel.price);
        System.out.println("design = " + jewel.design);
        System.out.println("brand = " + jewel.brand);

        System.out.println("main ended");
    }
}
