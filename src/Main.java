import inheritance01.*;

public class Main {
  public static void main(String[] args) {
//    Animal animal = new Animal();
//    animal.showMe();
//
//    Mammalia mammalia = new Mammalia();
//    mammalia.showMe();
//
//    Bird bird = new Bird();
//    bird.showMe();
//
//    Whale whale = new Whale();
//    whale.showMe();
//
//    Bat bat = new Bat();
//    bat.showMe();
//
//    Sparrow sparrow = new Sparrow();
//    sparrow.showMe();
//
//    Penquin penquin = new Penquin();
//    penquin.showMe();
//
//    System.out.println("Hello world!");

      Animal[] animals = new Animal[7];
      animals[0] = new Animal();
      animals[1] = new Mammalia();
      animals[2] = new Bird();
      animals[3] = new Whale();
      animals[4] = new Bat();
      animals[5] = new Sparrow();
      animals[6] = new Penquin();

      for(int i = 0; i < animals.length; i++) {
        animals[i].showMe();
      }
  }
}