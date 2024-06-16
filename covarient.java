public class covarient {
  public static void main(String[] args) {
    B b = new B();
    b.show();
  }
}

class A{
  A show(){
    System.out.println("Leran coding");
    return this;  //this = new A()
  }
}

class B extends A{
  @Override
  B show(){
    super.show();
    System.out.println("please like");
    return this;
  }
}

//covarirent return type means we can change return type of  overriden method