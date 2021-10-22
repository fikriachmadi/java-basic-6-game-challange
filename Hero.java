public class Hero extends Human {
  
    public Hero(String name, int age, int energy) {
      this.name = name;
      this.age = age;
      this.energy = energy;
    }
  
    void player() {
      System.out.println("========= Player ========");
      System.out.println("Name: " + this.name);
      System.out.println("Age: " + this.age);
      System.out.println("Energy: " + this.energy);
      System.out.println("=========================");
    }
  
    void checkEnergy() {
      if(energy <= 0) {
        System.out.println("Energi Anda habis! Player " + this.name + " tamat!");
      }
      else if(energy >= 100){
          System.out.println("Kamu menang " + this.name + " Selamat"); 
      }
      else{
          System.out.println("Kamu beruntung" + this.name);
      }
      System.exit(0);
    }
  
    void run() {
      for (int i = 0; i < 5; i++) {
      System.out.println(this.name + " sedang berlari....");
      energy -= 10;
      }
    }

    void eat() {
      for (int i = 0; i < 4; i++) {
        System.out.println(this.name + " sedang makan....");
        energy += 20;
      }
    }

    void drink() {
      for (int i = 0; i < 2; i++) {
       System.out.println(this.name + " sedang minum....");
       energy += 20;
      }
    }
      
    void jump() {
      for (int i = 0; i < 4; i++) {
       System.out.println(this.name + " sedang melompat....");
       energy -= 20;
      }
    }

    void sit() {
      for (int i = 0; i < 2; i++) {
       System.out.println(this.name + " sedang duduk....");
       energy += 10;
      }
    }

    void attack() {
      for (int i = 0; i < 4; i++) {
        System.out.println(this.name + " sedang menyerang....");
        energy -= 30;
      }
    }
  
    /* Buat method untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
     - pasang method checkHealth() di dalam method yang akan dibuat
     - Tampilkan pesan kegiatan yang sedang dilakukan, misal, jika lari: " sedang berlari..."
     - ubah energy sesuai kegiatan yang dilakukan:
      * eat = +20
      * drink = +20
      * jump = -20
      * sit = +10
      * attack = -30

      Group 8: walk 1x, run 5x, eat 4x, drink 2x, walk 6x, jump x4, sit 2x, attack 4x
  
      Contoh method seperti method run() diatas.
  
    */
  
  }