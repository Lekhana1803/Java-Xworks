class ScoreBoard {
    static int score;

    public static void main(String[] args) {
        System.out.println("main started");
        updateScore(6);
        System.out.println("Current Score: " + score);
        System.out.println("main ended");
    }

    public static void updateScore(int runs) {
        System.out.println("updateScore started");
        score = score + runs;
        System.out.println("updateScore ended");
    }
}
