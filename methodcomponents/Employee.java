
class Employee {
    public static void request(String empName, String model) {
        System.out.println(empName + " requested a laptop");
        IT.approve(empName, model);
    }
}
