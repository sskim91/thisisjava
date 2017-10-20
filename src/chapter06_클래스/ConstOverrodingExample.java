package chapter06_클래스;

public class ConstOverrodingExample {
    public static void main(String[] args) {
        ConstOverroding const1 = new ConstOverroding();
        System.out.println(const1.company);
        System.out.println();

        ConstOverroding const2 = new ConstOverroding("자가용");
        System.out.println(const2.company + " " + const2.model);
        System.out.println();

        ConstOverroding const3 = new ConstOverroding("자가용", "빨강");
        System.out.println(const3.company + " " + const3.model + " " + const3.color);
        System.out.println();

        ConstOverroding const4 = new ConstOverroding("택시", "검정", 200);
        System.out.println(const4.company + " " + const4.model + " " + const4.color + " " + const4.maxSpeed);
    }
}
