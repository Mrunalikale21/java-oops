public class methodoverloading {
  public static void main(String[] args) {
    A r = new A();
    r.add();
    r.add(2,5);
    r.add(12,6.5);
  }

}

class A{

  void add(){
    int a=10,b=20,c;
    c = a+b;
    System.out.println(c);
  }

  void add(int x, int y){
    int c;
    c = x+y;
    System.out.println(c);
  }
  void add(int x, double y){
    double c;
    c = x+y;
    System.out.println(c);
  }
}

//return type can also be differ bs name same hona chahiye
