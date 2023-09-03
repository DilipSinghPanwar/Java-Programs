public class Swap2ValWithoutTemp {
    public static void main(String[] args) {
        //Swapping two numbers means exchanging the values of two variables with each other.
        int first = 10;
        int second = 20;
        System.out.println("first value before swap: "+first);
        System.out.println("second value before swap: "+second);
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println("first number after swap: "+first);
        System.out.println("second number after swap: "+second);

    }
}
