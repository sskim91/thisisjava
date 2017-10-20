package chapter13_제네릭;

public class CompareMethodExample {
    public static void main(String[] args) {

        Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
        Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");

        //구체적인 타입을 명시적으로 지정
        boolean result1 = Util.<Integer, String>compare(p1, p2);

        if (result1) {
            System.out.println("논리적으로 동등한 객체입니다.");
        } else {
            System.out.println("논리적으로 동등하지 않는 객체입니다.");
        }


        Pair<String, String> p3 = new Pair<String, String>("user1", "삼성");
        Pair<String, String> p4 = new Pair<String, String>("user2", "삼성");

        //구체적인 타입을 추정
        boolean result2 = Util.compare(p3, p4);

        if (result2) {
            System.out.println("논리적으로 동등한 객체입니다.");
        } else {
            System.out.println("논리적으로 동등하지 않는 객체입니다.");
        }
    }
}
