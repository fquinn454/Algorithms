
public class sumOfPrimes {
    public static long sumOfPrimes(){
        long sum = 0;
        for(long i = 2; i<2000000; i++){
            if(Primes.isPrime(i)){
                sum+=i;
            }
        }
        return sum;
    }
}
