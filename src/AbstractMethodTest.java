import abstractMethod.*;

public class AbstractMethodTest {
  public static void main(String[] args) {
    Animal animals[] = new Animal[5];

    animals[0] = new Rat();
    animals[1] = new Cat();
    animals[2] = new Dog();
    animals[3] = new Cow();
    animals[4] = new Chicken();

    for(Animal animal : animals) {
      animal.showName();
      animal.cry();
    }
  }
}
