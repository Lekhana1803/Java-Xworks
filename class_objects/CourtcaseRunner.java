class CourtcaseRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Courtcase c = new Courtcase();

        System.out.println("case id = " + c.caseId);
        System.out.println("title = " + c.caseTitle);
        System.out.println("plaintiff = " + c.plaintiff);
        System.out.println("defendant = " + c.defendant);
        System.out.println("status = " + c.status);
        System.out.println("court name = " + c.courtName);
        System.out.println("hearing date = " + c.hearingDate);

        c.caseId = 14;
        c.caseTitle = "Land Dispute";
        c.plaintiff = "Ravi";
        c.defendant = "Shyam";
        c.status = "Pending";
        c.courtName = "Supreme Court";
        c.hearingDate = "01-Jan-2026";

        System.out.println("case id = " + c.caseId);
        System.out.println("title = " + c.caseTitle);
        System.out.println("plaintiff = " + c.plaintiff);
        System.out.println("defendant = " + c.defendant);
        System.out.println("status = " + c.status);
        System.out.println("court name = " + c.courtName);
        System.out.println("hearing date = " + c.hearingDate);

        System.out.println("main ended");
    }
}
