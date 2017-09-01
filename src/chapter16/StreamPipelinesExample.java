package chapter16;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
    public static void main(String[] args) {
        //스트림 파이프라인
        List<Member> list = Arrays.asList(
                new Member("홍길동", Member.MALE, 30),
                new Member("김성섭", Member.MALE,27),
                new Member("우분투", Member.FEMAIL, 90),
                new Member("스트림", Member.FEMAIL, 40)
        );

        double ageAvg = list.stream()
                .filter(m -> m.getSex() == Member.MALE)
                .mapToInt(Member :: getAge)
                .average()
                .getAsDouble();

        System.out.println("남자 평균 나이: " + ageAvg);
    }
}
