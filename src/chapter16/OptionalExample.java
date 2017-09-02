package chapter16;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {

        //Optional 클래스 더 살펴보기
        List<Integer> list = new ArrayList<>();

        /*
        //예외 발생(java.utile.NoSuchElementException
        //요소가 없을경우 평균값이 없을수 있기때문에. 그래서 Optional 객체의 메소드를 사용
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        */

        //방법1
        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        if (optional.isPresent()) {//값이 있는지 확인 true/false 리턴
            System.out.println("방법1 평균: " + optional.getAsDouble());
        } else {
            System.out.println("방법1_평균: 0.0");
        }

        //방법2
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);   //값이 없을 경우 디폴트 값 설정
        System.out.println("방법2_평균: " + avg);

        //방법3
        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println("방법3_평균: " + a));    //평균 값이 있을때만 람다식 실행



    }
}
