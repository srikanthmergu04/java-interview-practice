package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySolution1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(9,9,9);
        int target = 1;
//        System.out.println("result:"+getModifiedNumber2(numbers,target));
        sortTwoArrays(Arrays.asList(1,2,3,4,5),Arrays.asList(2,2,3,5,7,8,9));

    }

    public static int getModifiedNumber(List<Integer> numbers, int value){
        int result = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for (int num:
             numbers) {
            stringBuilder.append(num);
        }

        return Integer.parseInt(stringBuilder.toString())+value;
    }

    public static List<Integer> getModifiedNumber2(List<Integer> numbers, int value){
        List<Integer> result = new ArrayList<>();

        int end = numbers.size()-1;

        while(end >0){
            if(numbers.get(end)+value > 9){
                numbers.set(end, ((numbers.get(end))+value) - 10);
                value = 1;
            }else{
                numbers.set(end, numbers.get(end)+value);
                value = 0;
            }
            end--;
        }

        return numbers;
    }

    public static void  sortTwoArrays(List<Integer> arr1, List<Integer> arr2){
        int i = 0;
        int j = 0;

        List<Integer> result = new ArrayList<>();

        while(i<arr1.size() && j<arr2.size()){

            if(arr1.get(i) < arr2.get(j)){
                result.add(arr1.get(i));
                i++;
            }else{
                result.add(arr2.get(j));
                j++;
            }
        }

        if(i < arr1.size()){
            while(i < arr1.size()){
                result.add(arr1.get(i));
                i++;
            }

        }else if(j < arr2.size()){
            while(j < arr2.size()){
                result.add(arr2.get(j));
                j++;
            }
        }

        System.out.println("Result: "+result);
    }

    public static void sortArray(List<Integer> number){



    }



}

