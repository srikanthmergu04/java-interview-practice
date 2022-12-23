package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewProblems {

    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
//
//        numbers
//                .stream().map(val -> val*2)
//                .collect(Collectors.toList())
//                .forEach(val -> System.out.println(val));
        magic(4);
    }

    public static void magic(int n){

        int i = 1;

        while(i <= 4){

            int j = 1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            j = j -2;

            while(j > 0){
                System.out.print(j);
                j--;
            }
            System.out.println();
            i++;
        }

        int j = n-1;
        while(j > 0){

            int k = 1;
            while(k<=j){
                System.out.print(k);
                k++;
            }

            k = k -2;

            while(k > 0){
                System.out.print(k);
                k--;
            }

            System.out.println();

            j--;
        }

    }
}
