package chapter16_스트림과병렬처리;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
    public static void main(String[] args) {
        //정렬 숫자 요소일 경우
        IntStream intStream = Arrays.stream(new int[]{5, 3, 2, 1, 4});
        intStream
                .sorted()
                .forEach(n-> System.out.println(n+","));
        System.out.println();

        //객체 요소일 경우
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 30),
                new Student("김성섭", 20),
                new Student("이성우", 10)
        );

        studentList.stream()
                .sorted()   //정수를 기준으로 오름차순으로 Student 정렬
                .forEach(s -> System.out.println(s.getScore() + ","));
        System.out.println();


        studentList.stream()
                .sorted(Comparator.reverseOrder())   //정수를 기준으로 내림차순으로 Student 정렬
                .forEach(s -> System.out.println(s.getScore() + ","));
    }
}
