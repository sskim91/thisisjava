package chapter15_컬렉션;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "자바", "프로그래밍");

        for (String name : list) {
            System.out.println(name);
        }

        List<Integer> list2 = Arrays.asList(1, 2, 3);
        for (int i : list2) {
            System.out.println(i);
        }
    }
}
