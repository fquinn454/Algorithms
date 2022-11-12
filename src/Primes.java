//Find the largest prime factor of a number

import static java.lang.Math.sqrt;

public class Primes {

    public static boolean isPrime(long number) {
        for (int i = 2; i <= sqrt(number); ++i) {
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
    //What is the 10 001st prime number?
    public static int primeInTheSequence(int number){
        int answer = 0;
        int count = 0;
        for(int i = 2; count <= number; i++){
            if(isPrime(i)){
                count++;
                answer = i;
            }
        }
        return answer;
    }
}
