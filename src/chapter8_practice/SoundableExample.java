package chapter8_practice;

public class SoundableExample{
    public static void main(String[] args) {
        printSound(new Dog());
        printSound(new Cat());
    }

    public static void printSound(Soundable soundable) {
        System.out.println(soundable.sound());
    }
}
