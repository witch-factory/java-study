package ex02;

public class CarExample {
  public static void main(String[] args){
    Car car1=new Car();
    System.out.println("car1.company: "+car1.company + " car1.model: "+car1.model + " car1.color: "+car1.color + " car1.maxSpeed: "+car1.maxSpeed);

    Car car2=new Car("자가용");
    System.out.println("car2.company: "+car2.company + " car2.model: "+car2.model + " car2.color: "+car2.color + " car2.maxSpeed: "+car2.maxSpeed);
    
    Car car3=new Car("자가용", "빨강");
    System.out.println("car3.company: "+car3.company + " car3.model: "+car3.model + " car3.color: "+car3.color + " car3.maxSpeed: "+car3.maxSpeed);
  }
}
