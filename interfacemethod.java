public class interfacemethod {
  public static void main(String[] args) {
    RahulTech r = new RahulTech();
    r.design();
    r.webdevlopment();
  }
}

interface client {
  void design();

  void webdevlopment();
}// to know the requriement

abstract class RajTech implements client {

  @Override
  public void design() {
    System.out.println("green, top menu, three dot button");
  }
}

class RahulTech extends RajTech {
  @Override
  public void webdevlopment() {
    System.out.println("HTML, CSS, JS");
  }
}
