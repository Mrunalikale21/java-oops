public class defaultconstrucotr {
  public static void main(String[] args){
      A r = new A();
      r.disp();
  }
}

class A{
  int a; String b; boolean c;

  A(){
    a = 100;
    b = "ankit";
    c = true;
  }

  void disp(){
    System.out.println(a+" "+b+" "+c);
  }
}
