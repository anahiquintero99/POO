import javax.swing.text.View;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world");
    Car car = new Car();
    car.license = "AMQ123";
    car.driver = "Andres Herrera";
    car.passenger = 4;
    car.printDataCar();

    Car car2 = new Car();
    car2.license = "Qwe123";
    car2.driver = "Anahi Quintero";
    car2.passenger = 3;
    car2.printDataCar();

  }// End of main
}// End of FirstJavaProgram Class