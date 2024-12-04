public class Main {
    public static void main(String[] args) {

        int[] basestats = {10, 10, 10 , 10, 10};
        WaterPokemon squirtle = new WaterPokemon("squirtle", basestats);
        FirePokemon charmander = new FirePokemon("charmander", basestats);

        squirtle.speak();
        squirtle.healPokemon();
        squirtle.waterGun();
        squirtle.tackle();
        squirtle.levelUp();
        squirtle.levelUp();

        charmander.speak();
        charmander.healPokemon();
        charmander.scratch();
        charmander.ember();
        charmander.levelUp();
        charmander.levelUp();

    }
}
