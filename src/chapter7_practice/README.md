5.Parent 클래스를 상속해서 Child 클래스를 다음과 같이 작성 했는데, Child 클래스의 생성자에서 컴파일 에러가 발생. 그 이유는?

~~~
public class Parent {
    public String name;

    public Parent(String name) {
        this.name = name;
    }
}

public class Child extends Parent{
    private int studentNo;

    public Child(String name, int studentNo) {
        this.name = name;
        this.studentNo = studentNo;
    }
}
~~~
- 수정 코드
~~~
public class Child extends Parent{
    private int studentNo;

    public Child(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }
}
~~~

> 부모 클래스에서 기본 생성자가 없고 매개 변수가 있는 생성자만 있다면 자식 생성자에서 만드시 부모 생성자 호출을 위해 super(매개값,..)를 명시적으로 호출해야 한다.
super()는 반드시 자식 생성자 첫 줄에 위치해야 한다. 그렇지 않으면 컴파일 에러가 발생

  
  
7.Tire 클래스를 상속받아 snowTire 클래슬르 다음과 같이 작성. SnowTireExample 클래스를
실행했을 때 출력 결과는?

~~~
public class Tire {
    public void run() {
        System.out.println("일반 타이어가 굴러갑니다.");
    }
}
  
public class SnowTire extends Tire{
    @Override
    public void run() {
        System.out.println("스노우 타이어가 굴러갑니다.");
    }
}

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        snowTire.run();
        tire.run();
    }
}
~~~

>결과
- 스노우 타이어가 굴러갑니다.
- 스노우 타이어가 굴러갑니다.

> 부모 클래스에서 자식 클래스로 오버라이딩된 메소드가 실행된다.