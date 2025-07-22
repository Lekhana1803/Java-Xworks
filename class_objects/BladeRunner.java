class BladeRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Blade blade = new Blade();

        // Default values
        System.out.println("id of blade = " + blade.bladeId);
        System.out.println("brand of blade = " + blade.brand);
        System.out.println("type of blade = " + blade.type);
        System.out.println("thickness of blade = " + blade.thickness);
        System.out.println("price of blade = " + blade.price);
        System.out.println("material of blade = " + blade.material);
        System.out.println("is reusable = " + blade.isReusable);

        // Assign values
        blade.bladeId = 201;
        blade.brand = "Gillette";
        blade.type = "Double Edge";
        blade.thickness = 0.25;
        blade.price = 25.75;
        blade.material = "Stainless Steel";
        blade.isReusable = false;

        // Updated values
        System.out.println("id of blade = " + blade.bladeId);
        System.out.println("brand of blade = " + blade.brand);
        System.out.println("type of blade = " + blade.type);
        System.out.println("thickness of blade = " + blade.thickness);
        System.out.println("price of blade = " + blade.price);
        System.out.println("material of blade = " + blade.material);
        System.out.println("is reusable = " + blade.isReusable);

        System.out.println("main ended");
    }
}
