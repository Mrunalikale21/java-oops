public class constructor1 {
  public static void main(String[] args){
    A r = new A();
    r.show();
  }
}

class A {
  int a;
  String name;
  // A(){
  //   a =0;
  //   name=null;
  // } default constructor

  void show(){
    System.out.println(a+" "+name);
  }
}
