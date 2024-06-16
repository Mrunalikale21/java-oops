public class extendinginterface {
  public static void main(String[] args) {
    ankit a = new ankit();
    a.add();
    a.sub();
  }
}

interface Gill {
  void add();
}

interface Raj extends Gill {
  void sub();
}

// inherit interface from one to other use extend keyword and when we want to
// use interface to use in another class use implement method

class ankit implements Raj {
  @Override
  public void add() {
    int a = 10;
    int b = 5;
    int c;
    c = a + b;
    System.out.println("addition " + c);
  }

  @Override
  public void sub() {
    int a = 10;
    int b = 5;
    int c;
    c = a - b;
    System.out.println("subtraction " + c);
  }

}

// inheritance in interface
