3.다음은 Soundable 인터페이스입니다. sound() 추상 메소드는 객체의 소리를 리턴
~~~java
public interface Soundable {
    public String sound();
}
~~~
SoundableExample 클래스에서 printSound() 메소드는 Soundable 인터페이스
타입의 매개변수를 가지고 있습니다. main() 메소드에서 printSound()를 호출할 때 Cat과
Dog 객체를 주고 실행하면 각각 "야옹"과 "멍멍"이 출력되도록 Cat과 Dog 클래스를 작성.

~~~java
public class SoundableExample{
    public static void main(String[] args) {
        printSound(new Dog());
        printSound(new Cat());
    }

    public static void printSound(Soundable soundable) {
        System.out.println(soundable.sound());
    }
}
~~~

Dog, Cat 객체 작성
~~~java
public class Dog implements Soundable {

    private String dogSound;

    public Dog() {
        this.dogSound = "멍멍";
        sound();
    }

    @Override
    public String sound() {
        return this.dogSound;
    }
}

public class Cat implements Soundable {

    private String catSound;

    public Cat() {
        this.catSound = "야옹";
        sound();
    }

    @Override
    public String sound() {
        return this.catSound;
    }
}
~~~

4.DaoExample 클래스의 main()메소드에서 dbWork() 메소드를 호출할 때
OracleDao와 MySqlDao 객체를 매개값으로 주고 호출했습니다. dbWork() 메소드는 두 객체를
모두 매개값으로 받기 위해 DataAccessObject 타입의 매개 변수를 가지고 있습니다.
실행 결과를 보고 DataAccessObject 인터페이스와 OracleDao, MySqlDao 구현 클래스를 각각 작성

~~~java
public class DaoExample {
    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());
    }

    public static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }
}
~~~
    -결과
    Oracle DB에서 검색
    Oracle DB에서 삽입
    Oracle DB에서 수정
    Oracle DB에서 삭제
    MySql DB에서 검색
    MySql DB에서 삽입
    MySql DB에서 수정
    MySql DB에서 삭제
    
코드    
~~~java
public interface DataAccessObject {
    public void select();

    public void insert();

    public void update();

    public void delete();
}

public class MySqlDao implements DataAccessObject {

    private String mysqlStr;

    public MySqlDao() {
        this.mysqlStr = "MySql DB";
    }

    @Override
    public void select() {
        System.out.println(mysqlStr+"에서 검색");
    }

    @Override
    public void insert() {
        System.out.println(mysqlStr+"에서 삽입");
    }

    @Override
    public void update() {
        System.out.println(mysqlStr+"에서 수정");
    }

    @Override
    public void delete() {
        System.out.println(mysqlStr+"에서 삭제");
    }
}
public class OracleDao implements DataAccessObject {

    private String oracleStr;

    public OracleDao() {
        this.oracleStr = "Oracle DB";
    }

    @Override
    public void select() {
        System.out.println(oracleStr+"에서 검색");
    }

    @Override
    public void insert() {
        System.out.println(oracleStr+"에서 삽입");
    }

    @Override
    public void update() {
        System.out.println(oracleStr+"에서 수정");
    }

    @Override
    public void delete() {
        System.out.println(oracleStr+"에서 삭제");
    }
}
~~~

5.다음은 Action 인터페이스입니다. work() 추상 메소드는 객체의 작업을 시작시킵니다.
~~~java
public interface Action {
    public void work();
}
~~~

ActionExample 클래스의 main() 메소드에서 Action의 익명 구현 객체를 만들어
다음과 같은 실행 결과가 나올 수 있도록 박스 안에 들어갈 코드를 작성해보세요.
~~~java
public class ActionExample {
    public static void main(String[] args) {

        Action action = //작성

        action.work();
    }
}
~~~

    -실행 결과
    복사를 합니다.

코드
~~~java
public class ActionExample {
    public static void main(String[] args) {

        Action action = new Action() {
            @Override
            public void work() {
                System.out.println("복사를 합니다.");
            }
        };

        action.work();
    }
}

~~~