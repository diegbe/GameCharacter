public class Warrior extends GameCharacter{
    public Warrior (String name, int health, int level){
        super (name, health, level);
    }
    @Override
    public void attack(){
        System.out.println(getName() + " swings a sword at the enemy!");
    }
    @Override
    public void defend(){
        System.out.println(getName() + " raises a shield to block the attack!");
    }
   @Override
   public void printCharacterDetails(){
       System.out.println("Warrior [name: " + getName() + ", health: " + getHealth() + ", level: " + getLevel() + "]");
   }
   public void charge(){ 
       System.out.println(getName() + " charges towards the enemy!");
   }
    public void specialAttack(){ 
        System.out.println(getName() + " performs a devastating whirlwind attack!");
    }
    public void berserkerRage(){ 
        System.out.println(getName() + " enters a state of berserker rage!");
    }

}
