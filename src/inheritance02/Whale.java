package inheritance02;

public class Whale extends Mammalia implements Swim {
  public Whale() {
    myClass = "고래";
  }

  @Override
  public void swim() {
    System.out.println(myClass + "이(가) 수영합니다.");
  }
}
