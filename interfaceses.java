import java.util.Scanner;

public class interfaceses {
  public static void main(String[] args) {
    Raju r = new Raju();
    r.input();
    r.output();
  }
}

interface client {
  void input(); // public , abstract

  void output();
}

class Raju implements client {
  String name;
  double sal;

  public void input() { // coz interface methods are public so this shl also be public
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter username");
    name = sc.nextLine();

    System.out.println("Enter salary");
    sal = sc.nextDouble();
  }

  public void output() {
    System.out.println(name + " " + sal);
  }
}

// contain only abstract methods
// methods are by default public aand abstract
// and variables are public , static and final
// iterface method must be implement in sub classes
// interface is deals with client and developer
// final used coz we cant change requriements of client