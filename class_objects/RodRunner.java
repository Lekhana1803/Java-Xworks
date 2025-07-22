class RodRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Rod rod = new Rod();

        System.out.println("id of rod = " + rod.rodId);
        System.out.println("material = " + rod.material);
        System.out.println("length = " + rod.length);
        System.out.println("diameter = " + rod.diameter);
        System.out.println("weight = " + rod.weight);
        System.out.println("price = " + rod.price);
        System.out.println("is hollow = " + rod.hollow);

        rod.rodId = 7;
        rod.material = "Steel";
        rod.length = 6.5;
        rod.diameter = 2.2;
        rod.weight = 15.4;
        rod.price = 2500.0;
        rod.hollow = false;

        System.out.println("id of rod = " + rod.rodId);
        System.out.println("material = " + rod.material);
        System.out.println("length = " + rod.length);
        System.out.println("diameter = " + rod.diameter);
        System.out.println("weight = " + rod.weight);
        System.out.println("price = " + rod.price);
        System.out.println("is hollow = " + rod.hollow);

        System.out.println("main ended");
    }
}
