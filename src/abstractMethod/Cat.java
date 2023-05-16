package abstractMethod;

public class Cat extends Animal {
  public Cat() {
    name = "고양이";
  }

  @Override
  public void cry() {
    System.out.println("야옹~ 야옹~");
  }
}
