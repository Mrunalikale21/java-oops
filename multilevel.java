public class multilevel {
  public static void main(String args[]){
    C r = new C();
    r.add(); r.div(); r.multi(); r.remainder(); r.sub();

  }

  int a,b,c;
  void add(){
    a=10;b=20;
    c=a+b;
    System.out.println("sum of two number: "+c);
  }

  void sub(){
    a=10;b=2;
    c=a-b;
    System.out.println("subtraction of two number: "+c);
  }
}

class B extends multilevel{
  void multi(){
    a=10;b=2;
    c=a*b;
    System.out.println("multiplication of two number: "+c);
  }

  void div(){
    a=10;b=2;
    c=a/b;
    System.out.println("division of two number: "+c);
  }
}

class C extends B{
  void remainder(){
    a=10;b=2;
    c=a%b;
    System.out.println("remainder of two number: "+c);
  }
}
