package chapter16;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        //다른 요소로 대체
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 10),
                new Student("김성섭", 20),
                new Student("이성우", 30)
        );

        studentList.stream()
                .mapToInt(Student :: getScore)
                .forEach(score -> System.out.println(score));
    }
}
