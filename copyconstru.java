public class copyconstru {
  public static void main(String[] args) {
    A r = new A();
    A r2 = new A(r);

  }
}

class A{
  int a;
  String b;
  A(){
   a=10;
   b="learncoding";
   System.out.println(a+" "+b);
  }

  A(A ref){ //making reference variable
    a = ref.a;
    b = ref.b;
    System.out.println(a+" "+b);
  }

}
