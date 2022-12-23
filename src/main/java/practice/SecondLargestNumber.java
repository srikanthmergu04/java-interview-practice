package practice;

import java.util.Arrays;
import java.util.List;

public class SecondLargestNumber {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,2,10,4,1,19,20);
//
//        numbers.sort(null);
//
//        System.out.println(numbers.get(numbers.size()-2));
        System.out.println(reverse("ABCD"));
    }

    public static String reverse(String str){

        StringBuilder stringBuilder = new StringBuilder();

        int end = str.length()-1;
        System.out.println("len: "+end);
        while(end > -1){
            stringBuilder.append(str.charAt(end));
            end--;
        }



        return stringBuilder.toString();
    }
}
