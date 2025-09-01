class SumOfDigits {
    public static void main(String[] args) {
        int num = 12345;  // you can change this value
        int sum = 0, temp = num;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits of " + num + " = " + sum);
    }
}
