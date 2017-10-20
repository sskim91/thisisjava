package chapter12_쓰레드;

public class SumThread extends Thread{

    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            sum += i;
        }
    }
}
