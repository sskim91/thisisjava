package chapter16;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        //루핑
        int[] intArr = {1, 2, 3, 4, 5};

        System.out.println("[peek()를 마지막에 호출한 경우]");
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(n -> System.out.println(n));  // 동작 하지 않음 peek()메소드는 중간처리 메소드에서 추가작업을 할때 사용하는데 최종처리 마지막에 호출하면 실행 안됨

        System.out.println("[최종 처리 메소드를 마지막에 호출한 경우]");
        int total = Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(n -> System.out.println(n))
                .sum(); //이 경우에는 동작 최종메소드를 호출했기 때문에
        System.out.println("총합: " + total);

        System.out.println("[forEach()를 마지막에 호출한 경우]");
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .forEach(n -> System.out.println(n));   //forEach는 최종메소드  실행됨
    }
}
