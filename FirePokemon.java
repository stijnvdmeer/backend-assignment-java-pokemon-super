public class FirePokemon extends Pokemon {
    private int xp;
    private int stats[];

    public FirePokemon(String name, int stats[]) {
        super(1, 100, name, "Fire");
        this.xp = 0;
        this.stats = stats;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int[] getStats() {
        return stats;
    }

    public void setStats(int[] stats) {
        this.stats = stats;

    }

    public void ember() {
        System.out.println(getName() + " use ember!");
    }
    public void scratch() {
        System.out.println(getName() + "  use scratch!");
    }

    @Override
    public void levelUp() {
        this.xp += 50;
        System.out.println(getName() + " Has gained 50 xp!");

        if (this.xp >= 100) {
            this.xp = 0;
            setLevel(getLevel() + 1);
            System.out.println(getName() + " Has leveled up to level " + getLevel());
        }
    }
}

