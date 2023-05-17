package templateMethodPattern;

public class Dog extends Animal {
  @Override
  void play() {
    System.out.println("멍! 멍!");
  }

  @Override
  void runSomething() {
    System.out.println("멍! 멍! 꼬리 살랑 살랑~");
  }
}

