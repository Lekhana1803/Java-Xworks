class DownloadProgress {
    static int progress;

    public static void main(String[] args) {
        System.out.println("main started");
        updateProgress(25);
        System.out.println("Download: " + progress + "%");
        System.out.println("main ended");
    }

    public static void updateProgress(int percent) {
        System.out.println("updateProgress started");
        progress = progress + percent;
        System.out.println("updateProgress ended");
    }
}
