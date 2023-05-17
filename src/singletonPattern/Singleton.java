package singletonPattern;

public class Singleton {
  private static Singleton once;
  private Singleton() {}
  public static Singleton getInstance() {
    if (once == null) {
      once = new Singleton();
    }
    return once;
  }
}
