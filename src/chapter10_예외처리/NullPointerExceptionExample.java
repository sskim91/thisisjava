package chapter10_예외처리;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String data = null;
        System.out.println(data.toString());
        /*
        data 변수는 null 값을 가지고 있기 때문에 String 객체를 참조하고 있지 않음
         */
    }
}
