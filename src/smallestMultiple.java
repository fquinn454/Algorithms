//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20
public class smallestMultiple {

    public static boolean isMultiple(int number){
        for(int i = 1; i<21; i++){
            if(number % i !=0){
                return false;
            }
        }
        return true;
    }

    public static int smallestMultiple(){
        int number= 1;
        while(!isMultiple(number)){
            number++;
            }
        return number;
    }

}
