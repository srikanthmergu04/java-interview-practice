package practice;

import java.util.ArrayList;
import java.util.List;

public class DecimalToBinary {

    public static void main(String[] args) {
//        System.out.println("Binary value of 22 is "+convertDecToBinary(22));
        System.out.println(convertNumToString(11));
    }

    public static String convertDecToBinary(int num){
        int result = 0;

        StringBuilder stringBuilder = new StringBuilder();
        while(num > 0){
            stringBuilder.append(num%2);
            num = num /2;
        }

        return  stringBuilder.reverse().toString();
    }

    public static String convertNumToString(int num){

        List<Integer> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        while(num > 0){
            list.add(num%10);
            num = num / 10;
        }

        for(int i=list.size()-1;i>-1;i--){

            if(i == 3){
                stringBuilder.append(getValue(list.get(i)));
                stringBuilder.append("thousand");
            }

            stringBuilder.append(" ");

            if (i == 2){
                stringBuilder.append(getValue(list.get(i)));
                stringBuilder.append("hundred");
            }
            stringBuilder.append(" ");

            if(i == 1){
                stringBuilder.append(getValue2(list.get(i)));
            }

            stringBuilder.append(" ");

            if(i == 0){
                stringBuilder.append(getValue(list.get(i)));
            }


        }



        return  stringBuilder.toString();
    }

    static public String getValue(int num){
        StringBuilder stringBuilder = new StringBuilder();
        switch (num){
            case 1 : stringBuilder.append("one");
                break;
            case 2 : stringBuilder.append("two");
                break;
            case 3 : stringBuilder.append("three");
                break;
            case 4 : stringBuilder.append("four");
                break;
            case 5 : stringBuilder.append("five");
                break;
            case 6 : stringBuilder.append("six");
                break;
            case 7 : stringBuilder.append("seven");
                break;
            case 8 : stringBuilder.append("eight");
                break;
            case 9 : stringBuilder.append("nine");
                break;
        }

        return stringBuilder.toString();
    }

    static public String getValue2(int num){
        StringBuilder stringBuilder = new StringBuilder();
        switch (num){
            case 1 : stringBuilder.append("ten");
                break;
            case 2 : stringBuilder.append("twenty");
                break;
            case 3 : stringBuilder.append("thirty");
                break;
            case 4 : stringBuilder.append("forty");
                break;
            case 5 : stringBuilder.append("fifty");
                break;
            case 6 : stringBuilder.append("sixty");
                break;
            case 7 : stringBuilder.append("seventy");
                break;
            case 8 : stringBuilder.append("eighty");
                break;
            case 9 : stringBuilder.append("ninety");
                break;
        }

        return stringBuilder.toString();
    }
}
