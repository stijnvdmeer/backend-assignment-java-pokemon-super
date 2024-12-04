public class WaterPokemon extends Pokemon {
    private int xp;
    private List <Integer> stats = new ArrayList<Integer>();

    public WaterPokemon(String name) {
        this.xp = 0;
        super(1, 100, name, "Water");
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public List<Integer> getStats() {
        return stats;
    }

    public void setStats(int physAtk, int specAtk, int physDef, int specDef, int speed) {
        this.stats.add(physAtk);
        this.stats.add(specAtk);
        this.stats.add(physDef);
        this.stats.add(specDef);
        this.stats.add(speed);
    }

    public void waterGun() {
        System.out.println(this.name + " use watergun!");
    }
    public void tackle() {
        System.out.println(this.name + "  use tackle!");
    {

    @Override
    public void levelUp() {
        this.xp += 10;
        System.out.println(this.name + " Has gained 10 xp!");

        if (this.xp >= 100) {
            this.xp = 0;
            this.level++;
            System.out.println(this.name + " Has leveled up to level " + this.level);
        }
    }
}