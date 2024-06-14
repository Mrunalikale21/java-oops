public class abstract2 {
  public static void main(String[] args) {
    java j = new java();
    j.developer();
    j.rank();
   

    //we can make reference of abstract class
  }
}

abstract class Programming{
  public abstract void developer();
  public abstract void rank();
}

abstract class HTML extends Programming{
  @Override
  public void developer(){
    System.out.println("Tim Berners Lee");
  }

}

class java extends HTML{
  @Override
  public void rank(){
    System.out.println("1");
  }
}

//if abstract methods are not overriden in sub class then that claases will became the abstract class

//we can also done it by making html class abstract and java will extend html then all method will run by creating object of java class

