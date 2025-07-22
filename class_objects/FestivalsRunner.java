class FestivalsRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Festivals fest = new Festivals();

        System.out.println("id = " + fest.festivalId);
        System.out.println("name = " + fest.name);
        System.out.println("month = " + fest.month);
        System.out.println("region = " + fest.region);
        System.out.println("duration days = " + fest.durationDays);
        System.out.println("holiday = " + fest.nationalHoliday);
        System.out.println("main activity = " + fest.mainActivity);

        fest.festivalId = 25;
        fest.name = "Diwali";
        fest.month = "October";
        fest.region = "All India";
        fest.durationDays = 5;
        fest.nationalHoliday = true;
        fest.mainActivity = "Lighting lamps and fireworks";

        System.out.println("id = " + fest.festivalId);
        System.out.println("name = " + fest.name);
        System.out.println("month = " + fest.month);
        System.out.println("region = " + fest.region);
        System.out.println("duration days = " + fest.durationDays);
        System.out.println("holiday = " + fest.nationalHoliday);
        System.out.println("main activity = " + fest.mainActivity);

        System.out.println("main ended");
    }
}
