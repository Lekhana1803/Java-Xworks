class Teashopmeth {

    static String itemNames[] = {
        "GreenTea", "LemonTea", "FilterCoffee", "Tea", "BadamMilk", "PlainMilk"
    };

    public static void main(String[] teashop) {
        System.out.println("main started");
        System.out.println("itemNames available are:");
        
        for (String item : itemNames) {
            System.out.println(item);
        }

        System.out.println("main ended");
    }
}
