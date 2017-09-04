package chapter8_practice;

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
