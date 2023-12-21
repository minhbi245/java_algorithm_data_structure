
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        playWithFindNumber();
    }

    public static void playWithFindNumber() {
        int[] nums = {1, 2, 3, 4, 55, 666, 7589};
        int numbersContainInNumberFound = findNumbers(nums);
        System.out.println(numbersContainInNumberFound);
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num: nums) {
            int numberContain = calculateTheNumbersContainIsEven(num);
            if(numberContain % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int calculateTheNumbersContainIsEven(int num) {
        int count = 0;
        int result = num;
        while(result != 0) {
            result = num / 10;
            num = result;
            count++;
        }
        return count;
    }
}