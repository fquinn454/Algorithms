//What is the largest prime factor of the number 600851475143

public class PrimeFactor {

    public static boolean isPrime(long number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long largestPrime(long prime) {
        int divisor = 1;
        while (divisor < prime) {
            if (prime % divisor == 0) {
                long max = prime / divisor;
                boolean maxIsPrime = isPrime(max);
                if (maxIsPrime) {
                    return max;
                }
            }
            divisor++;
        }
        return 0;
    }
}
