//package practice;
//
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;
//import java.util.function.Predicate;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//public class EPAMInterview {
//    public static void main(String[] args) {
//
////        - generates 10 integer values
////        - remain only even values
////                - multiply on 5
////                - sum
//
//        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5);
//        List<Integer> numbers2 = Arrays.asList(5,6,7,8,9);
//
//        int newSum = Stream
//                .of(numbers1,numbers2)
//                .flatMap(Collection::stream)
//                .filter(EPAMInterview::filterVal)
//                .map(val -> val*5)
//                .sum();
//
//        int sum = IntStream
//                .range(0,11)
//                .filter(EPAMInterview::filterVal)
//                .map(val -> val*5)
//                .sum();
//
//        System.out.println("sum: "+sum);
//
//
//    }
//
//    public static boolean filterVal(int val){
//
//        return val%2 ==0;
//
////        if(val%2 ==0){
////            return true;
////        }else{
////            return false;
////        }
//
//    }
//}
