package chapter13;

public class BoxExmaple {
    public static void main(String[] args) {

        Box<String> box = new Box<>();

        box.set("하이");
        System.out.println(box.get());

        Box<Integer> box2 = new Box<>();
        box2.set(12);
        System.out.println(box2.get());

    }
}
