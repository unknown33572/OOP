package polymorphism01;

public class Penguin extends Animal {
  public String habitat;

  public void showHabitat() {
    System.out.printf("%s는 %s에 살아\n", name, habitat);
  }
  @Override
  public void showName() {
    System.out.println("제 이름은 알아서 뭣하게용?");
  }

  public void showName(String yourName) {
    System.out.printf("%s 안녕, 나는 %s라고 해. 반가워.\n", yourName, name);
  }
}
