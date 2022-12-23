package practice;

import java.util.Arrays;

public class reverseStringUsingRecursion {
    public static void main(String[] args) {

        String str = "Java libreary for Blueyonder is Awesome";

        Character[] ch = new Character[str.length()];
        reverse(ch,0,str.length()-1);

    }

    public static  void reverse(Character[] ch, int first, int last){


        if(first >last){
            System.out.println(Arrays.toString(ch));
            return;
        }

        char newChar = ch[last];
        ch[last] = ch[first];
        ch[first] = newChar;

        reverse(ch, first+1, last-1);
    }

}
