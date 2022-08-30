package ex02;

public class Car {
  String company = "현대자동차";
  String model;
  String color = "검정";
  int maxSpeed = 350;

  Car(){}
  Car(String model){
    this(model, "은색", 250);
  }
  Car(String model, String color){
    this(model, color, 250);
  }
  Car(String model, String color, int maxSpeed){
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }
}
