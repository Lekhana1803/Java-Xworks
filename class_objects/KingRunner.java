class KingRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        King king = new King();

        System.out.println("id of king = " + king.kingId);
        System.out.println("name = " + king.name);
        System.out.println("kingdom = " + king.kingdom);
        System.out.println("age = " + king.age);
        System.out.println("reign period = " + king.reignPeriod);
        System.out.println("spouse = " + king.spouse);
        System.out.println("famous = " + king.famous);

        king.kingId = 16;
        king.name = "Ashoka";
        king.kingdom = "Maurya Empire";
        king.age = 42;
        king.reignPeriod = "268–232 BCE";
        king.spouse = "Asandhimitra";
        king.famous = true;

        System.out.println("id of king = " + king.kingId);
        System.out.println("name = " + king.name);
        System.out.println("kingdom = " + king.kingdom);
        System.out.println("age = " + king.age);
        System.out.println("reign period = " + king.reignPeriod);
        System.out.println("spouse = " + king.spouse);
        System.out.println("famous = " + king.famous);

        System.out.println("main ended");
    }
}
