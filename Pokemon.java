public class Pokemon {
    private String name;
    private String type;
    private int hp;
    private int level;

    public Pokemon(int level, int hp, String name, String type) {
        this.level = level;
        this.hp = hp;
        this.name = name;
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void healPokemon() {
        System.out.println("Tun Tun Tun Tu Du Dun, Your " + this.name + " has been healed have a nice day.");
    }
    public void speak() {
        System.out.println(this.name);
    }
    public void levelUp() {
        this.level++;
    }
}