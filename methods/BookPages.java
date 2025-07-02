class BookPages {

    static int pagesRead;

    public static void main(String[] args) {
        System.out.println("main started");
        readPages(30);
        System.out.println("Pages read: " + pagesRead);
        System.out.println("main ended");
    }

    public static void readPages(int pages) {
        System.out.println("readPages started");
        pagesRead = pagesRead + pages;
        System.out.println("readPages ended");
    }
}
