public class privatemethodinterface {
  public static void main(String[] args) {
    B b = new B();
  A.call();
  //b.call();
  b.sub(200, 100);
    
  }
}

//here we call default method and inside default method orivate method is calling

interface A{
  // default void call(){
  //   add(100,200);
  // }

  public static void call(){
    add(200,300);
  }
  private static void add(int x, int y){
    System.out.println("Sum of two number: "+(x+y));
  }
}

class B implements A{
  public void sub(int x, int y){
    System.out.println("Subtraction of two number: "+(x-y));
  }
}
