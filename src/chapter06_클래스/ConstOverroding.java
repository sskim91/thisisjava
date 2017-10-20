package chapter06_클래스;

public class ConstOverroding {
    //필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //기본 생성자
    public ConstOverroding(){

    }

    public ConstOverroding(String model) {
        this.model = model;
    }

    public ConstOverroding(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public ConstOverroding(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
