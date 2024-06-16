public class varargmethod {
  public static void main(String[] args) {
    A r = new A();
    r.add();
    r.add(10);
    r.add(10, 20, 30);
    r.add(1, 2, 3, 4, 5, 6, 7);
  }
}

class A {
  void add(int... a) { // var-args method
    int sum = 0;
    for (int x : a) { // here we use for each loop coz array variable cant add in int i.e sum
      sum = sum + x;
    }
    System.out.println("sum of numbers is: " + sum);

  }
}

// when we have variable number of parameters we can use var arg method i.e
// differnt parameter

// int ... a = int[] a
