package factoryMethodPattern;

public class DogToy extends AnimalToy {
  @Override
  public void identify() {
    System.out.println("나는 테니스공! 강아지의 친구!");
  }
}
