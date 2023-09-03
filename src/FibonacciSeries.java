public class FibonacciSeries {

    public static void main(String[] args) {
        int input = 10;
//        int output = fib(input);
//        System.out.println(output);
        for (int i = 0; i < 10; i++) {
            System.out.print(fib(i)+", ");
        }
    }

    //Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones
    //The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
    public static int fib(int number) {
        if (number <= 1) {
            return number;
        } else {
            return fib(number - 1) + fib(number - 2);
        }
    }

}