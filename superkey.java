public class superkey {
  public static void main(String[] args) {
    B r = new B();
    r.show();
  }

  // int a = 10;
  void show(){
    System.out.println("hello viewer");
  }

  superkey(){
    System.out.println("hello in main class");
  }

  superkey(int a){
    System.out.println("hello in main class "+a);
  }
}

class B extends superkey{
  // int a=20;
  // void show(){
  //   System.out.println(super.a);
  //   System.out.println(a);
  // }

  void show(){

    super.show();
   System.out.println("hello learner");
  }

  B(){

    super(100);
    System.out.println("hello in sub class");
  }
  
}

//in case of default contructor sub class already contain super keyword hence we get both contructor by calling object of sub class

//but in case of parameterized contructor we have to call super and all give variable to them


