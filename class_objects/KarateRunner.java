class KarateRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Karate karate = new Karate();

        System.out.println("id = " + karate.studentId);
        System.out.println("name = " + karate.studentName);
        System.out.println("belt level = " + karate.beltLevel);
        System.out.println("age = " + karate.age);
        System.out.println("trainer = " + karate.trainerName);
        System.out.println("years practiced = " + karate.yearsPracticed);
        System.out.println("black belt = " + karate.blackBelt);

        karate.studentId = 18;
        karate.studentName = "Arjun";
        karate.beltLevel = "Brown";
        karate.age = 16;
        karate.trainerName = "Sensei Raju";
        karate.yearsPracticed = 4;
        karate.blackBelt = false;

        System.out.println("id = " + karate.studentId);
        System.out.println("name = " + karate.studentName);
        System.out.println("belt level = " + karate.beltLevel);
        System.out.println("age = " + karate.age);
        System.out.println("trainer = " + karate.trainerName);
        System.out.println("years practiced = " + karate.yearsPracticed);
        System.out.println("black belt = " + karate.blackBelt);

        System.out.println("main ended");
    }
}
