import inheritance02.*;

public class Driver {
  public static void main(String[] args) {
    Fly bat = new Bat();
    bat.fly();

    Fly sparrow = new Sparrow();
    sparrow.fly();

    Swim[] swimmers = new Swim[2];
    swimmers[0] = new Penquin();
    swimmers[1] = new Whale();

    for(int i = 0; i < swimmers.length; i++) {
      swimmers[i].swim();
    }
  }
}
