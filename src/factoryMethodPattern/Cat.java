package factoryMethodPattern;

public class Cat extends Animal {
  @Override
  public AnimalToy getToy() {
    return new CatToy();
  }
}
