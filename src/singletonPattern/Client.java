package singletonPattern;

public class Client {
  public static void main(String[] args) {
    // private 생성자이므로 new 연산자를 사용해 인스턴스를 생성할 수 없다.
    // Singleton obj1 = new Singleton();

    Singleton obj1 = Singleton.getInstance();
    Singleton obj2 = Singleton.getInstance();
    Singleton obj3 = Singleton.getInstance();
    System.out.println(obj1);
    System.out.println(obj2);
    System.out.println(obj3);

    obj1 = null;
    obj2 = null;
    obj3 = null;
  }
}
