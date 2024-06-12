public class encaplsulation {
  public static void main(String[] args) {
    A r = new A();
    r.setValue(100);
    System.out.println(r.getValue());
  }
}

class A{
  private int value; //data hiding

  public void setValue(int x){  //data abstraction
     value = x;
  }

  public int getValue(){
     return value;
  }
}

//here we can acces private variable by get and set mwthod
