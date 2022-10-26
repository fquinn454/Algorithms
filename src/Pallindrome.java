//Find the largest palindrome made from the product of two 3-digit numbers
public class Pallindrome {

    public static boolean isPallindrome(String number){
        for(int i = 0; i < number.length()/2; i++){
            if(number.charAt(i)!=number.charAt(number.length()-1-i)){
                return false;
            }
        }
    return true;
    }

    public static int largestPallindrome(){
        int largest = 0;
        for(int x = 999; x>0; x--){
            for(int y = 999; y>0; y--){
                Integer possiblePallindrome = x * y;
                if (isPallindrome(possiblePallindrome.toString())) {
                    if (possiblePallindrome > largest){
                        largest = possiblePallindrome;
                    }
                }
            }
        }
        return largest;
    }
}
