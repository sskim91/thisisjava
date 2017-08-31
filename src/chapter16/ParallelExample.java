package chapter16;

import chapter13.Pair;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
    //병렬처리 예제
    public static void main(String[] args) {
        List<String> list = Arrays.asList("자바", "씨언어", "스위프트", "파이썬", "루비");

        //순차 처리
        Stream<String> stream = list.stream();
        stream.forEach(ParallelExample::print); //메소드 참조(s->ParallelExample.print(s)와 동일
        System.out.println();

        //병렬 처리
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParallelExample::print);

    }

    public static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
