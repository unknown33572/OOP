import polymorphism01.Animal;
import polymorphism01.Penguin;

public class PolymorphismTest {
  public static void main(String[] args) {
    Penguin pororo = new Penguin();

    pororo.name = "뽀로로";
    pororo.habitat = "남극";

    pororo.showName();
    pororo.showName("코난");
    pororo.showHabitat();

     Animal pingu = new Penguin();

     pingu.name = "핑구";
     pingu.showName();
  }
}
