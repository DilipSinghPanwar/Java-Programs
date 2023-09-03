public class Factorial {
    public static void main(String[] args) {
        //Factorial of a non-negative integer is the multiplication of all positive integers smaller than or equal to n.
        int input = 5;  // 5 * 4 * 3 * 2 * 1
        int result = 1;

        //first way
        for (int i = 1; i <= input; i++) {
            result = result * i;
        }
        System.out.println(result);

        //second way
//        for (int i = input; i >= 1; i --) {
//            result = result * i;
//        }
//        System.out.println(result);
    }
}
