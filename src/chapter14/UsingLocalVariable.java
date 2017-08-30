package chapter14;

public class UsingLocalVariable {
    void method(int arg) {  //arg는 final 특성을 가짐
        int localVar = 40;  //localVar 는 final 특성을 가짐

        // final 특성 때문에 수정 불가
        //arg = 30;
        //localVar = 41;

        //람다식
        MyFunctionalInterface fi = () -> {
            //로컬 변수 읽기
            System.out.println("arg: " + arg);
            System.out.println("localVar: " + localVar + "\n");
        };
        fi.method();
    }
}
