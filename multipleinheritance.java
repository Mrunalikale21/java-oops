public class multipleinheritance {
  public static void main(String[] args) {
    multiple m = new multiple();
    m.show();
    m.disp();
  }
}

interface A{
  void show();
}

interface B{
  void disp();
}

class multiple implements A,B{
   public void show(){
    System.out.println("Interface A ");
   }

   public void disp(){
    System.out.println("Interface B ");
   }
}

//here not occur the problem like class coz defination of method is gove in sub class only
