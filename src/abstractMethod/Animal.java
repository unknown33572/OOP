package abstractMethod;

public class Animal {
  public String name;

  public void showName() {
    System.out.printf("안녕, 나는 %s야. 반가워.\n", name);
  }

  public void cry() {
    System.out.println(name + "이(가) 웁니다.");
  }
}