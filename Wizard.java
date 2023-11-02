public class Wizard extends GameCharacter{
    public Wizard (String name, int health, int level){ super (name, health, level);}
    @Override
    public void attack(){System.out.println(getName() + " casts a powerful spell!");}
    @Override
    public void defend(){System.out.println(getName() + " conjures a protective barrier!");}
    @Override
    public void printCharacterDetails(){System.out.println("Wizard [name: " + getName() + ", health: " + getHealth() + ", level: " + getLevel() + "]");}

    public void teleport(){System.out.println(getName() + " teleports to safety");}
    public void specialAttack(){System.out.println(getName() + " unleashes the special arcane blast!");}
    public void heal(){System.out.println(getName() + " performs a healing spell!");}

}
