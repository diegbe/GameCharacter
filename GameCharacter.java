public abstract class GameCharacter {

    private String name;
    private int health;
    private int level;

    public GameCharacter(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public abstract void attack();
    public abstract void defend();
    public abstract void teletransport();
    public abstract void printCharacterDetails();
}
