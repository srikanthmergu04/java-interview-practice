package practice;

//1,2,3,4, 5

import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        //List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        int[] numbers = new int[6];

        int i = 0;
        while(i<numbers.length){
            numbers[i] = i+1;
            i++;
        }

        int end = numbers.length -1;

        System.out.println("length: "+end);

        int mid = numbers.length /2;

        int start = 0;
        while (start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }

        start = 0;

        while(start < numbers.length){
            System.out.print(" "+numbers[start]);
            start++;
        }

    }
}
