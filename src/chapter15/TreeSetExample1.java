package chapter15;

import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        Integer score = null;

        score = scores.first(); //제일 낮은 객체를 리턴
        System.out.println("가장 낮은 점수: " + score);

        score = scores.last(); //제일 높은 객체를 리턴
        System.out.println("가장 높은 점수: " + score);

        score = scores.lower(new Integer(95));  //주어진 객체보다 바로 아래 객체를 리턴
        System.out.println("95점 아래 점수: " + score);

        score = scores.higher(new Integer(95)); //주언 객체보다 바로 위 객체를 리턴
        System.out.println("95점 위의 점수: " + score);

        score = scores.floor(new Integer(95));  //주어진 객체와 동등한 객체가 있으면 리턴, 만약 없다면 주어진 객체의 바로 아래의 객체를 리턴
        System.out.println("95점 이거나 바로 아래 점수: " + score);

        score = scores.ceiling(new Integer(85));    //주어진 객체와 동등한 객체가 있으면 리턴, 만약 없다면 주어진 객체의 바로 위의 객체를 리턴
        System.out.println("85점 이거나 바로 위의 점수: " + score + "\n");

        while (!scores.isEmpty()) {
            score = scores.pollFirst();  //제일 낮은 객체를 꺼내오고 컬렉션에서 제거함
            System.out.println(score +" (남은 객체 수: "+scores.size()+")");
        }
    }
}
