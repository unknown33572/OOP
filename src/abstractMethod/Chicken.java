package abstractMethod;

public class Chicken extends Animal {
  public Chicken() {
    name = "닭";
  }

  @Override
  public void cry() {
    System.out.println("꼬끼오~ 꼬끼오~");
  }
}
