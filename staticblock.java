public class staticblock {
  public static void main(String[] args) {
    staticblock r = new staticblock();
  }

  static{
    System.out.println("This is static block");
  }

  //instance block
  {
    System.out.println("please like");
  }

  staticblock(){
    System.out.println("this is inside contructor");
  }
}

//block will run as follows
//1)static block
//2)instance block by caaling object
//3)contructor (default)
//4)method in class
//if the method is static method then it will run whenever we call it
