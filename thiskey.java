public class thiskey {
  public static void main(String[] args) {
    thiskey r = new thiskey();
     //r.show();
  }

  thiskey(){
  //  System.out.println("this is default construtor");
  this(100);
  }

  int a;
  thiskey(int a){
    //this.a = a;
    //this();
    System.out.println(a);
  }

  // void show(){
  //   System.out.println(a);
  // }

}

//this() use to call default construtor of own class all can call parameterized contrucotr  all its class 
