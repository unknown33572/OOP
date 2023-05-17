package strategyPattern;

public class Client {
  public static void main(String[] args) {
    Strategy strategy = null;
    Soldier soldier74 = new Soldier();

    strategy = new Gun();
    soldier74.runContext(strategy);

    System.out.println();

    strategy = new Sword();
    soldier74.runContext(strategy);
  }
}
