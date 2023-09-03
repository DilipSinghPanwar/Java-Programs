public class FibonacciSeries {

    public static void main(String[] args) {
        int input = 10;
//        int output = fib(input);
//        System.out.println(output);
        for (int i = 0; i < 10; i++) {
            System.out.print(fib(i)+", ");
        }
    }

    public static int fib(int number) {
        if (number <= 1) {
            return number;
        } else {
            return fib(number - 1) + fib(number - 2);
        }
    }

}