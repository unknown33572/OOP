package inheritance02;

public class Bat extends Mammalia implements Fly {
  public Bat() {
    myClass = "박쥐";
  }

  @Override
  public void fly() {
    System.out.println(myClass + "이(가) 날아다닙니다.");
  }
}
