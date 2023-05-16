package inheritance02;

public class Penquin extends Bird implements Swim {
  public Penquin() {
    myClass = "펭귄";
  }

  @Override
  public void swim() {
    System.out.println(myClass + "이(가) 수영합니다.");
  }
}
