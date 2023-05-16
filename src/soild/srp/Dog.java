package soild.srp;


public abstract class Dog {
  //단일책임원칙에 위배되는 코드
//  final static Boolean male = true;
//  final static Boolean female = false;
//  Boolean sex;
//
//  void pee() {
//    if(this.sex == male) {
//      System.out.println("한 쪽 다리를 들고 소변을 본다.");
//    } else {
//      System.out.println("뒷다리 두 개를 굽혀 앉은 자세로 소변을 본다.");
//    }
//  }
  //단일책임원칙을 지키는 코드
  abstract void pee();
}

class MaleDog extends Dog {
  @Override
  void pee() {
    System.out.println("한 쪽 다리를 들고 소변을 본다.");
  }
}

class FemaleDog extends Dog {
  @Override
  void pee() {
    System.out.println("뒷다리 두 개를 굽혀 앉은 자세로 소변을 본다.");
  }
}
