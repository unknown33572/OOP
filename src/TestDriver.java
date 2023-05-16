import inheritance03.Animal;
import inheritance03.Penguin;

public class TestDriver {
  public static void main(String[] args) {
    Penguin pororo = new Penguin();

    pororo.name = "뽀로로";
    pororo.habitat = "남극";

    pororo.showName();
    pororo.showHabitat();

    Animal pingu = new Penguin();

    pingu.name = "핑구";
//    pingu.habitat = "남극";

      pingu.showName();
//      pingu.showHabitat();

  }
}
