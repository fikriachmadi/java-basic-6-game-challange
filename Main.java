class Main extends Human {
    public static void main(String[] args) {
      Hero hero = new Hero("Fikri", 20, 100);
  
      hero.player();
      hero.walk();
      hero.run();
      hero.eat();
      hero.drink();
      hero.jump();
      hero.sit();
      hero.attack();
  
      //Group 8: run 5x, eat 4x, drink 2x, walk 60x, jump x4, sit 2x, attack 4x
      
      hero.player();
      hero.checkEnergy();
   
    }
    
  }