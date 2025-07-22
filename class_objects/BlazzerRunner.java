class BlazzerRunner {

    public static void main(String[] args) {
        System.out.println("main started");

        // Create Blazzer object
        Blazzer blazzer = new Blazzer();  

        // Print default values
        System.out.println("id of blazzer = " + blazzer.blazzerId);
        System.out.println("brand of blazzer = " + blazzer.brand);
        System.out.println("size of blazzer = " + blazzer.size);
        System.out.println("color of blazzer = " + blazzer.color);
        System.out.println("price of blazzer = " + blazzer.price);
        System.out.println("material of blazzer = " + blazzer.material);
        System.out.println("style of blazzer = " + blazzer.style);

        // Assign new values
        blazzer.blazzerId = 101;
        blazzer.brand = "Raymond";
        blazzer.size = "L";
        blazzer.color = "Black";
        blazzer.price = 4500.50;
        blazzer.material = "Wool";
        blazzer.style = "Formal";

        // Print updated values
        System.out.println("id of blazzer = " + blazzer.blazzerId);
        System.out.println("brand of blazzer = " + blazzer.brand);
        System.out.println("size of blazzer = " + blazzer.size);
        System.out.println("color of blazzer = " + blazzer.color);
        System.out.println("price of blazzer = " + blazzer.price);
        System.out.println("material of blazzer = " + blazzer.material);
        System.out.println("style of blazzer = " + blazzer.style);

        System.out.println("main ended");
    }
}
