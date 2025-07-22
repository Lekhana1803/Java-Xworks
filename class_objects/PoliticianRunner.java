class PoliticianRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Politician p = new Politician();

        System.out.println("id of politician = " + p.politicianId);
        System.out.println("name = " + p.name);
        System.out.println("party = " + p.party);
        System.out.println("age = " + p.age);
        System.out.println("constituency = " + p.constituency);
        System.out.println("years in power = " + p.yearsInPower);
        System.out.println("active = " + p.active);

        p.politicianId = 13;
        p.name = "Arjun Kumar";
        p.party = "National Party";
        p.age = 55;
        p.constituency = "Delhi South";
        p.yearsInPower = 10;
        p.active = true;

        System.out.println("id of politician = " + p.politicianId);
        System.out.println("name = " + p.name);
        System.out.println("party = " + p.party);
        System.out.println("age = " + p.age);
        System.out.println("constituency = " + p.constituency);
        System.out.println("years in power = " + p.yearsInPower);
        System.out.println("active = " + p.active);

        System.out.println("main ended");
    }
}
