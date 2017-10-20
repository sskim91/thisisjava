package chapter10_예외처리;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        chageDog(dog);

        Cat cat = new Cat();
        chageDog(cat);
    }

    public static void chageDog(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog)animal;
        }
    }
}

class Animal{}
class Dog extends Animal {}
class Cat extends Animal {}
