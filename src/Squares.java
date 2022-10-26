public class Squares {
    public static int sumOfSquares(int number){
        int total = 0;
        for(int i = 1; i<=number; i++){
            total += i*i;
        }
        return total;
    }
    public static int squareOfSum(int number){
        int total = 0;
        for(int i = 1; i<=number; i++){
            total += i;
        }
        return total*total;
    }
}
