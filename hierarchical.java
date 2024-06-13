public class hierarchical {
  public static void main(String[] args) {
    B r = new B();
    C r1 = new C();
    r.input(); r.show();
    r1.input(); r1.disp();
  }

   void input(){
    System.out.println("Enter your name: ");
  }
}

class B extends hierarchical{
   void show(){
    System.out.println("My name is ankit");
   }
}

class C extends hierarchical{
  void disp(){
    System.out.println("My name is ankush");
  }
}
