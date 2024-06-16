public class defaultmethodinterface {
  public static void main(String[] args) {
    B b = new B();
    b.a1();
    b.a2();
    b.a3();
    C c = new C();
    c.a1();
    c.a2();
    c.a3();
  }
}

interface A{
  void a1();
  void a2();
  default void a3(){
    System.out.println("may or may not override in implementing class");
  }
}

class B implements A{
  public void a1(){
    System.out.println("class B a1()");
  }

  public void a2(){
    System.out.println("class B a2()");
  }
}

class C implements A{
  public void a1(){
    System.out.println("class C a1()");
  }

  public void a2(){
    System.out.println("class C a2()");
  }

  public void a3(){
    System.out.println("override in implementing class");
  }
}

//if we add any method in interface after implementing all class then we can make this method default

//we can use it without implementing it in implementing classes
