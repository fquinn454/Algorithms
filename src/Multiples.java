//Find the sum of all the multiples of 3 or 5 below 1000
public class Multiples{
    public static int Multiples() {
        int total = 0;
        for (int i = 0; i < 1000; i++){
            if (i % 3 == 0 || i % 5 ==0){
                total += i;
            }
        }
        return total;
    }
}
