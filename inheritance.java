public class inheritance {
  public static void main(String[] args) {
    ankit r = new ankit();
    r.input();
    r.disp();
  }

  int roll, marks;
  String name;

  void input() {
    System.out.println("Enter roll no,name & marks");
  }
}

class ankit extends inheritance {
  void disp() {
    roll = 1;
    name = "ankit";
    marks = 89;
    System.out.println(roll + " " + name + " " + marks);
  }
}
