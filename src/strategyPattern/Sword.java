package strategyPattern;

public class Sword implements Strategy {
  @Override
  public void runStrategy() {
    System.out.println("챙챙!");
  }
}
