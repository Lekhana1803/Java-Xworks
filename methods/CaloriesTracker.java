class CaloriesTracker {
    static int calories;

    public static void main(String[] args) {
        System.out.println("main started");
        burnCalories(300);
        System.out.println("Calories burned: " + calories);
        System.out.println("main ended");
    }

    public static void burnCalories(int c) {
        System.out.println("burnCalories started");
        calories = calories + c;
        System.out.println("burnCalories ended");
    }
}
