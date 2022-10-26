//Find the largest prime factor of a number

public class PrimeFactor {

    public static boolean isPrime(long number) {
        for (int i = 2; i < (number+1)/2; i++) {
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
