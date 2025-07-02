class StudentMarks {
    static int marks;

    public static void main(String[] args) {
        System.out.println("main started");
        addMarks(45);
        System.out.println("Total Marks: " + marks);
        System.out.println("main ended");
    }

    public static void addMarks(int score) {
        System.out.println("addMarks started");
        marks = marks + score;
        System.out.println("addMarks ended");
    }
}
