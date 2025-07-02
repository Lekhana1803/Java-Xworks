class PenBox {

    static int pens;

    public static void main(String[] args) {
        System.out.println("main started");
        addPens(5);
        System.out.println("Pens in box: " + pens);
        System.out.println("main ended");
    }

    public static void addPens(int count) {
        System.out.println("addPens started");
        pens = pens + count;
        System.out.println("addPens ended");
    }
}
