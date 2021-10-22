public class Human {
    String name;
    int age;
    int energy;
  
    public void walk() {
      for (int i = 0; i < 7; i++) {
      System.out.println(name + " sedang berjalan...");
      energy -= 5; 
      }
    }
  }