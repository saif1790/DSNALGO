package interview;

public class PrimeNumber {

    public static void main(String[] args) {

        int a[] = new int[5];
        //int length = a.length;
        System.out.println(a.length);

        int n = 100;
        for(int i = 1; i <= n; i++) {
            boolean isPrimeNumber = isPrime(i);
            if(isPrimeNumber) {
                System.out.println(i + "Number is prime");
            }
        }
            }

    public static boolean isPrime(int n) {

        if (n < 2)
            return false;

        /* taken n/2 because to reduce the number of iteration,if any number is divisible by
         2 and having more than 2 factor that number is not prime */
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
