package abstractMethod;

public class Cow extends Animal {
  public Cow() {
    name = "소";
  }

  @Override
  public void cry() {
    System.out.println("음메~ 음메~");
  }
}
