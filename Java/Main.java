import javax.swing.text.View;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world");
    Car car = new Car("AMQ123", new Account("Andres Herrera", "An123"));
    car.passenger = 4;
    car.printDataCar();

    Car car2 = new Car("Qwe123", new Account("Anahi Quintero", "LSD123"));
    car2.passenger = 3;
    car2.printDataCar();

  }// End of main
}// End of FirstJavaProgram Class