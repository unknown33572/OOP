package di_Properties;

public class Driver {
  public static void main(String[] args) {
    //Tire tire = new KoreaTire();
     Tire tire = new AmericaTire();
    Car car = new Car();
    car.setTire(tire);
    System.out.println(car.getTireBrand());
  }
}
