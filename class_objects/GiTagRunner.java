class GiTagRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        GiTag gi = new GiTag();

        System.out.println("id = " + gi.tagId);
        System.out.println("product = " + gi.productName);
        System.out.println("region = " + gi.region);
        System.out.println("category = " + gi.category);
        System.out.println("year granted = " + gi.yearGranted);
        System.out.println("still valid = " + gi.stillValid);
        System.out.println("authority = " + gi.authority);

        gi.tagId = 24;
        gi.productName = "Mysore Silk";
        gi.region = "Karnataka";
        gi.category = "Textile";
        gi.yearGranted = 2005;
        gi.stillValid = true;
        gi.authority = "Geographical Indications Registry";

        System.out.println("id = " + gi.tagId);
        System.out.println("product = " + gi.productName);
        System.out.println("region = " + gi.region);
        System.out.println("category = " + gi.category);
        System.out.println("year granted = " + gi.yearGranted);
        System.out.println("still valid = " + gi.stillValid);
        System.out.println("authority = " + gi.authority);

        System.out.println("main ended");
    }
}
