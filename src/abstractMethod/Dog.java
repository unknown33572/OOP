package abstractMethod;

public class Dog extends Animal {
  public Dog() {
    name = "개";
  }

  @Override
  public void cry() {
    System.out.println("멍! 멍!");
  }
}
