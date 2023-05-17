import templateMethodPattern.Animal;
import templateMethodPattern.Cat;
import templateMethodPattern.Dog;

public class TemplateMethodPatternTest {
  public static void main(String[] args) {
    Animal bolt = new Dog();
    Animal kitty = new Cat();

    bolt.playWithOwner();

    System.out.println();

    kitty.playWithOwner();
  }
}
