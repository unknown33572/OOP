package factoryMethodPattern;

public class CatToy extends AnimalToy {
  @Override
  public void identify() {
    System.out.println("나는 캣타워! 고양이의 친구!");
  }
}
