package chapter16_스트림과병렬처리;

import java.util.stream.IntStream;

public class FromIntRangeExample {

    public static int sum;

    public static void main(String[] args) {
        //정수 범위 Stream
        IntStream intStream = IntStream.range(1, 100);
        intStream.forEach(s -> sum += s);
        System.out.println(sum);
    }
}
