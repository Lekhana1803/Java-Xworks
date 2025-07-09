class LaptopRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        String empName = "Rahul";
        String model = "Dell";

        Employee.request(empName, model);

        System.out.println("Main ended");
    }
}
