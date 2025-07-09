
class Builder {
    public static void show(String property, String name) {
        System.out.println("Builder shows: " + property);
        Bank1.approve(property, name);
    }
}
