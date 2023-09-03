public class Swap2ValWithTemp {
    public static void main(String[] args) {
        //Swapping two numbers means exchanging the values of two variables with each other.
        int first = 10;
        int second = 20;
        System.out.println("first value before swap: "+first);
        System.out.println("second value before swap: "+second);
        int temp = first;
        first = second;
        second = temp;
        System.out.println("first value after swap: "+first);
        System.out.println("second value after swap: "+second);
    }
}
