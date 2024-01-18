public class Fibonacci {
    public static void generateSequence(int seq) {
        long first = 0;
        long second = 1;
        for (int i = 0; i != seq; i++) {
            System.out.print(first + " ");
            long sum = first + second;
            first = second;
            second = sum;
        }
    }
}
