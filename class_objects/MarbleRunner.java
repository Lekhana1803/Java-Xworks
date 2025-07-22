class MarbleRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Marble marble = new Marble();

        System.out.println("id of marble = " + marble.marbleId);
        System.out.println("color = " + marble.color);
        System.out.println("origin = " + marble.origin);
        System.out.println("price per sq ft = " + marble.pricePerSqFt);
        System.out.println("finish = " + marble.finish);
        System.out.println("imported = " + marble.imported);
        System.out.println("type = " + marble.type);

        marble.marbleId = 20;
        marble.color = "White";
        marble.origin = "Italy";
        marble.pricePerSqFt = 1500.0;
        marble.finish = "Glossy";
        marble.imported = true;
        marble.type = "Carrara";

        System.out.println("id of marble = " + marble.marbleId);
        System.out.println("color = " + marble.color);
        System.out.println("origin = " + marble.origin);
        System.out.println("price per sq ft = " + marble.pricePerSqFt);
        System.out.println("finish = " + marble.finish);
        System.out.println("imported = " + marble.imported);
        System.out.println("type = " + marble.type);

        System.out.println("main ended");
    }
}
