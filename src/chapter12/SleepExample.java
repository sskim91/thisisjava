package chapter12;

import java.awt.*;

public class SleepExample {
    public static void main(String[] args) {
        //3초 주기로 10번 비프음 발생
        //실행 중인 스레드를 일정시간 멈추게 하고 싶다면 정적 메소드인 sleep()을 사용

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i=0; i<10; i++) {
            toolkit.beep();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }
        }
    }
}
