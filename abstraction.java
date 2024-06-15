public class abstraction {
  public static void main(String[] args) {
    Dog r = new Dog();
    Lion l = new Lion();
    r.sound();
    l.sound();

  }

}

abstract class animal {
  animal() {
    System.out.println("All animals");
  }

  public abstract void sound(); // abstract method

}

class Dog extends animal {
  Dog() {
    super(); // to call constructor of abstract or super class
  }

  public void sound() {
    System.out.println("Dog is barking"); // use abstract method in subclass
  }
}

class Lion extends animal {
  Lion() {
    super();
  }

  public void sound() {
    System.out.println("Lion is roaring");
  }
}

// can not create object of abstract class
// to use abstract class we have to make its subclasses and hen inherit it from
// it.
// if it conatin partial implementation then we can make it abstract class