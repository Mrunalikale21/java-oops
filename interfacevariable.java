public class interfacevariable {
  public static void main(String[] args) {
    customerRaj c = new sellerSanju();
    c.purchase();
    System.out.println(customerRaj.amt); //to show it is static that we can class it direct by class
  }
}

interface customerRaj{
    int amt=5; //public, static , final
    void purchase(); //public , abstract
}

class sellerSanju implements customerRaj{
    @Override
    public void purchase(){
      System.out.println("Raj needs "+amt+" kg rice");
    }
}
