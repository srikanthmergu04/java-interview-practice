package practice;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class JavaPractice {
    public static void main(String[] args) {

        mostRepeating("tester");


    }

    //tester
    public static char mostRepeating(String str){

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(Character ch: str.toCharArray()){

            if(ch == ' '){
                continue;
            }

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }

        }

        int max = map.values().stream().max(Integer::compareTo).get();



        for(int i : map.values()){
            if(i> max){
                max = i;
            }
        }


        for (Map.Entry<Character,Integer> entry: map.entrySet()){

            if(entry.getValue() == max){
                return entry.getKey();
            }

        }
        return 0;
    }
}
