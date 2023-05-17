import factoryMethodPattern.Animal;
import factoryMethodPattern.AnimalToy;
import factoryMethodPattern.Cat;
import factoryMethodPattern.Dog;

public class FactoryMethodTest {
  public static void main(String[] args) {
    Animal bolt = new Dog();
    Animal kitty = new Cat();

    AnimalToy boltBall = bolt.getToy();
    AnimalToy kittyTower = kitty.getToy();

    boltBall.identify();
    kittyTower.identify();
  }
}
