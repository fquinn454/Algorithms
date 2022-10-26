// Find the sum of the even-valued terms in the Fibonacci sequence up to four million
public class Fibonacci {

    public static int Fibonacci(){
        int x = 0;
        int y = 1;
        int total = 0;
        int current = 0;
        while (current<4000000){
            if(current % 2 == 0){
               total += current;
           }
            current = x+y;
            x = y;
            y = current;
        }
    return total;
    }
}
