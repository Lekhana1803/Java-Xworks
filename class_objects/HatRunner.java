class HatRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Hat hat = new Hat();

        System.out.println("id of hat = " + hat.hatId);
        System.out.println("style = " + hat.style);
        System.out.println("color = " + hat.color);
        System.out.println("material = " + hat.material);
        System.out.println("size = " + hat.size);
        System.out.println("price = " + hat.price);
        System.out.println("brand = " + hat.brand);

        hat.hatId = 9;
        hat.style = "Fedora";
        hat.color = "Brown";
        hat.material = "Wool";
        hat.size = 58.0;
        hat.price = 750.0;
        hat.brand = "Woodland";

        System.out.println("id of hat = " + hat.hatId);
        System.out.println("style = " + hat.style);
        System.out.println("color = " + hat.color);
        System.out.println("material = " + hat.material);
        System.out.println("size = " + hat.size);
        System.out.println("price = " + hat.price);
        System.out.println("brand = " + hat.brand);

        System.out.println("main ended");
    }
}
