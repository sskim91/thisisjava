package chapter13;

public class BoxingMethodExample {
    public static void main(String[] args) {

        Box<Integer> box1 = Util.<Integer>boxing(100);
        int intValue = box1.get();

        Box<String> box2 = Util.<String>boxing("김성섭");
        String strValue = box2.get();
    }
}
