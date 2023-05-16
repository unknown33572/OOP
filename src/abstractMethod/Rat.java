package abstractMethod;

public class Rat extends Animal {
  public Rat() {
    name = "쥐";
  }

  @Override
  public void cry() {
    System.out.println("찍! 찍!");
  }
}
