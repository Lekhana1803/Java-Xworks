class GymEquipmentRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        GymEquipment eq = new GymEquipment(); // default values

        System.out.println("id of equipment = " + eq.equipmentId);
        System.out.println("name of equipment = " + eq.name);
        System.out.println("type of equipment = " + eq.type);
        System.out.println("weight of equipment = " + eq.weight);
        System.out.println("price of equipment = " + eq.price);
        System.out.println("brand of equipment = " + eq.brand);
        System.out.println("for indoor use = " + eq.indoorUse);

        eq.equipmentId = 4;
        eq.name = "Treadmill";
        eq.type = "Cardio";
        eq.weight = 120.5;
        eq.price = 45000.00;
        eq.brand = "PowerMax";
        eq.indoorUse = true;

        System.out.println("id of equipment = " + eq.equipmentId);
        System.out.println("name of equipment = " + eq.name);
        System.out.println("type of equipment = " + eq.type);
        System.out.println("weight of equipment = " + eq.weight);
        System.out.println("price of equipment = " + eq.price);
        System.out.println("brand of equipment = " + eq.brand);
        System.out.println("for indoor use = " + eq.indoorUse);

        System.out.println("main ended");
    }
}
