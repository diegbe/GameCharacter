public class Main {
    public static void main(String[] args) {
        Wizard gandalf = new Wizard("Gandalf", 100, 100);
        Warrior link = new Warrior("Link", 60, 80);

        gandalf.printCharacterDetails();
        link.printCharacterDetails();

        System.out.println("Battle wizard VS warrior");
        System.out.println("-----------");

        gandalf.attack();
        link.defend();

        link.attack();
        gandalf.defend();

        link.charge();
        gandalf.teleport();

        System.out.println("Ultimate Attacks:");
        System.out.println("-----------");

        gandalf.specialAttack();
        link.specialAttack();

        gandalf.heal();
        link.berserkerRage();
    }
}
