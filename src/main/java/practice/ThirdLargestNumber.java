package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class ThirdLargestNumber {

    public static Integer getThirdLargestNumber(){

        int[] numbers = {5,6,3,2,8,9,10,12};

        Collections.singletonList(numbers).sort(null);

        System.out.print("3rd Largest Number: "+numbers[numbers.length-3]);

        return -1;
    }

    public static void getEvenNumbers(){

        int[] numbers = {5,6,3,2,8,9,10,12};
        Arrays.stream(numbers).filter(num -> num%2 == 0).forEach(num -> System.out.println(num));
    }



    public static void main(String[] args) {
        //getThirdLargestNumber();
        getEvenNumbers();
    }

}
