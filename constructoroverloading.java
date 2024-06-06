public class constructoroverloading {
  public static void main(String[] args) {
    A r = new A();
    A r1 = new A(10);
    A r2 = new A(23.89,"ankit");
    System.out.println(r.a+" "+r.b+" "+r.c);
    System.out.println(r1.a);
    System.out.println(r2.b+" "+r2.c);
  }
  }

class A{
  int a; double b; String c;
  A(){
   a=100; b=34.55; c="ankit";
  }

  A(int x){
    a=x;
  }
 
  A(double y, String z){
      b=y;
      c=z;
  }
  
}

//rpivate and default are same kindof private is same as default having private modifier hence we cant use both at same time becoz compiler will get confused if bboth are there
