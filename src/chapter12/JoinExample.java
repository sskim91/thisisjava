package chapter12;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            sumThread.join();   //sumThread가 종료할 때까지 메인스레드를 일시정지 시킴
        } catch (InterruptedException e) {

        }
        System.out.println("합: "+sumThread.getSum());
    }
}
