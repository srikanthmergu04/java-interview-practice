package practice;

import java.io.IOException;
import java.math.BigInteger;

public class A {
    public static void main(String[] args) {
        final String pig = "length: 10";
        final String dog = "length: " + pig.length();

        System.out.println(pig.equals(dog));
    }
}
