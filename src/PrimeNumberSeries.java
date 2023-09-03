public class PrimeNumberSeries {
    public static void main(String[] args) {
        //prime, any positive integer greater than 1 that is divisible only by itself and 1
        // e.g., 2, 3, 5, 7, 11, 13, 17, 19, 23, ….
        // For example, 13 is only divisible by one or itself.
        //Note: 0 and 1 are not prime numbers; 2 is the only even prime number.
//        Why is 1 and 0 neither prime or composite?
//        So, 0 cannot be a prime or composite number. 1 has only one factor, which is itself.
//        It doesn't satisfy the definition of both prime and composite numbers,
//        so it cannot be a prime or composite number. So on this basis we can easily say that “0” and “1” are neither prime nor composite.
        int input = 23;
        for (int i =2; i <= input; i++) {
            if (checkPrime(i)){
                System.out.print(i+" ");
            }

        }
    }

    public static boolean checkPrime(int input) {
        int temp = 0;
        boolean result;
        for (int i = 2; i < (input - 1); i++) {
            if (input % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
