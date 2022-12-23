package practice;

import java.util.*;
import java.util.stream.Collectors;

public class StringProblem {

//    Write a program that counts the duplicate words in a string.
//    Sort the map by Values
//    String str = "Hello World, Hello Welcome to EPAM";
//    Hello - 2, World -1 , Welcome -1 , to -1 , Epam - 1

    public static void main(String[] args) {

        String str = "Hello World, Hello Welcome to EPAM";

        String[] words = str.split(" ");

//        Arrays.asList(words);

        HashMap<String, Integer> map = new HashMap<>();
        for(String s : words){

            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }else{
                map.put(s,1);
            }

        }

        System.out.println(map);

        map
                .entrySet()
                .stream()
              //  .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                //.sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(entry -> System.out.println(entry.getKey()+" "+entry.getValue()));

        System.out.println("\n\n");

        map
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey()+" "+entry.getValue()));






    }



}
