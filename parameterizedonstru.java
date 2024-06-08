public class parameterizedonstru {
  public static void main(String[] args) {
    A r = new A(100,200);
    r.show();
    A ref = new A(100, "monu");
    
  }
}

class A{
  int x;
  int y;
  A(int a, int b){ //parameterized constructor
    x = a;
    y = b;
  }

  A(int a, String b){
    System.out.println(a+" "+b);
  }
  void show(){
   System.out.println(x+" "+y);
  }
}
