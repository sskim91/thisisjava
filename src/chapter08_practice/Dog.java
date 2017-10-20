package chapter08_practice;

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
