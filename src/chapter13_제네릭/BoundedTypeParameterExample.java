package chapter13_제네릭;

public class BoundedTypeParameterExample {
    public static void main(String[] args) {

        //String은 Number 타입이 아님
        //String str = Util.compare("a", "b");

        int result = Util.compare(10, 20);
        System.out.println(result);

        int result2 = Util.compare(4.5, 3);
        System.out.println(result2);
    }
}
