package chapter16;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("홍길동", "김성섭", "김성섭", "김수용", "이자바");

        names.stream()
                .distinct() //중복 제거
                .forEach(n -> System.out.println(n));
        System.out.println();

        names.stream()
                .filter(n -> n.startsWith("김"))     //김 씨 성 필터링
                .forEach(n -> System.out.println(n));
        System.out.println();

        names.stream()
                .distinct() //중복 제거후 필터링
                .filter(n-> n.startsWith("김"))
                .forEach(n-> System.out.println(n));

    }
}
