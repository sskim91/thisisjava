package chapter6;

public class ParameterExample {
    public static void main(String[] args) {
        Parameter param = new Parameter();

        int[] values1 = {1, 2, 3};
        int result1 = param.sum1(values1);
        System.out.println("result1 : " + result1);

        int result2 = param.sum1(new int[]{1, 2, 3, 4, 5});
        System.out.println("result2 : " + result2);

        int result3 = param.sum2(1, 2, 3);
        System.out.println("result3 : " + result3);

        int result4 = param.sum2(1, 2, 3, 4, 5);
        System.out.println("result4 : " + result4);
    }
}
