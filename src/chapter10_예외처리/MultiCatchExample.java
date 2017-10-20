package chapter10_예외처리;

public class MultiCatchExample {
    public static void main(String[] args) {
        //자바 7부터 하나의 catch 블록에서 여러가지 예외를 추가할 수 있는 멀티캐치
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(value1 + "+" + value2 + "=" + result);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다.");
        } catch (Exception e) {
            System.out.println("알수 없는 예외 발생");
        }finally {
            System.out.println("다시 실행하세요.");
        }
    }
}
