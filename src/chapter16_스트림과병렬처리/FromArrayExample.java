package chapter16_스트림과병렬처리;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
    public static void main(String[] args) {

        //배열로부터 스트림 얻기
        String[] strArray = {"홍길동", "김성섭", "북카페"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(s -> System.out.println(s + ","));

        System.out.println();

        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(s -> System.out.println(s + ","));

    }
}
