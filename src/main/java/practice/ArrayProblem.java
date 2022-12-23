package practice;

import java.util.Arrays;
import java.util.List;

public class ArrayProblem {

//    Inputs 1) Int array [30,40,50,60,70,88,90,10,20]
//        2) int n.
//    Output print -1 if n is not in the array, else print the position.

    public static void main(String[] args) {

        int[] numbers = {30,40,50,60,70,88,90};

       // System.out.println(findNum(numbers,99));
        System.out.println(findNumUsingBinarySearch(numbers,88));

    }


    public static int findNum(int numbers[], int target){
        int result = -1;

        for(int i=0;i<numbers.length;i++){

            if(numbers[i] == target){
                return i;
            }
        }

        return result;
    }

    public static int findNumUsingBinarySearch(int numbers[], int target){
        int result = -1;


        int start = 0;
        int end = numbers.length;

        while(start <= end){

            int mid = (start + end)/2;

            if(numbers[mid] == target){
                return mid;
            }else if(numbers[mid] > target){
                end = mid - 1;
            }else{
                start = mid+1;
            }
        }

        return result;
    }


}
