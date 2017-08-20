## 예외와 예외 클래스

- 에러(error) - 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
- 예외(exception) - 프로그램 코드에 의해서 수습 될 수 있는 다소 미약한 오류

#### 예외에는 두 가지 종류가 있다.

1) 일반 예외(Exception)
2) 실행 예외(Runtime Exception)

일반 예외는 컴파일러 체크 예외라고도 하는데, 자바 소스를 컴파일하는 과정에서 예외 처리가 필요한지 검사 하기 때문이다
만약 예외 처리가 코드가 없다면 컴파일 오류가 발생한다.

실행 예외는 컴파일하는 과정에서 예외 처리 코드를 검사하지 않는 예외를 말한다.

실행 예외는 자바 컴파일러가 체크를 하지 않기 때문에 오로지 개발자의 경험에 의해서 예외 코드를 삽입해야 한다.

초보자가 발생하기 쉬운 대표적인 실행 예외

- NullPointerException : 객체의 참조가 없는 상태, 즉 null값을 갖는 참조 변수로 객체 접근 연산자인 도트(.)를 사용했을 때 발생
- ArrayIndexOutOfBoundsException : 배열에서 인덱스 범위를 초과하여 사용할 경우
- NumberFormatException : 문자열을 숫자로 변경하거나 숫자를 문자열로 변경할 때 변환될수 없는 수나 문자가 있을때
- ClassCastException : 타입변환(Casting)은 상위 클래스와 하위 클래스 간에 발생하고 구현 클래스와 인터페이스 간에도 발생한다. 이러한 관계가 아니라면 클래스는 다른 클래스로 변환될 수 
없다. 억지로 타입 변환을 시도할 경우 발생