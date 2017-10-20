package chapter15_컬렉션;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        //객체 정렬하기
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        NavigableSet<Integer> desecendingSet = scores.descendingSet(); //내림 차순
        for(Integer score : desecendingSet ) {
            System.out.print(score + " ");
        }
        System.out.println();

        NavigableSet<Integer> ascendingSet = desecendingSet.descendingSet();    // 오름차순으로 정렬하고 싶으면 내림차순을 두번 호출하면됨
        for (Integer score : ascendingSet) {
            System.out.print(score + " ");
        }

    }
}
