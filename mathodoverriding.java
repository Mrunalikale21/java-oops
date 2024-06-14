public class mathodoverriding {
  public static void main(String[] args) {
    //shape r = new square(); we can give refrence of main class
    square r = new square();
    r.draw();
  }
}

class shape{

  void draw(){
    System.out.println("we dont know what is shape type");
  }
}

class square extends shape{

  @Override
  void draw(){

    super.draw();
    System.out.println("square shape");
  }
}

//if method is not overriden then it will call method of super class by calling object of sub class
