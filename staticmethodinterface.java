public class staticmethodinterface {
  public static void main(String[] args) {
    demo d = new demo();
    d.show();
    A.show();
  }
}

interface A{
  public static void show(){
    System.out.println("Can't no override interface static method");
  }
}

class demo implements A{

  public static void show(){
    System.out.println("error");
  }
}

//we can make static method in interface that we can acess it by interface method and it can be only access by interface method implementing class cant override it


//we can not use @Override with static method it will give error 
