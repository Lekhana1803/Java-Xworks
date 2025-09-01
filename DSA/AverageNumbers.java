public class AverageNumbers {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide numbers as arguments.");
            return;
        }

        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Double.parseDouble(args[i]);
        }

        double avg = sum / args.length;
        System.out.println("Average = " + avg);
    }
}
