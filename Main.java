public class Main {
    public static void main(String[] args) {

        int[] baseStats = {10, 10, 10 , 10, 10};
        WaterPokemon squirtle = new WaterPokemon("squirtle", baseStats);
        FirePokemon charmander = new FirePokemon("charmander", baseStats);
        GrassPokemon bulbasaur = new GrassPokemon("bulbasaur", baseStats);
        ElectricPokemon pikachu = new ElectricPokemon("pikachu", baseStats);

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

        bulbasaur.speak();
        bulbasaur.healPokemon();
        bulbasaur.vineWhip();
        bulbasaur.tackle();
        bulbasaur.levelUp();
        bulbasaur.levelUp();

        pikachu.speak();
        pikachu.healPokemon();
        pikachu.thunderShock();
        pikachu.ironTail();
        pikachu.levelUp();
        pikachu.levelUp();
    }
}
//