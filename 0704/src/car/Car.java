package car;

public class Car {
    String name;
    String color;
    int size;

    // 기본 생성자
    public Car(){
        this.name = "Default";
        this.color = "blue";
        this.size = 100;
    }

    // 매개변수 있는 생성자
    public Car(String name, String color, int size){
        this.name = name;
        this.color = color;
        this.size = size;
    }

    // 메서드 - go
    public void go(){
        System.out.printf("%s Car go\n", this.name);
    }

    // 메서드 - stop
    public void stop(){
        System.out.printf("%s Car stop\n", this.name);
    }
}
