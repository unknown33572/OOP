package strategyPattern;

public class Gun implements Strategy {
  @Override
  public void runStrategy() {
    System.out.println("탕탕!");
  }
}
