package inheritance02;

public class Sparrow extends Bird implements Fly {
  public Sparrow() {
    myClass = "참새";
  }

  @Override
  public void fly() {
    System.out.println(myClass + "(이)가 날아다닙니다.");
  }
}
