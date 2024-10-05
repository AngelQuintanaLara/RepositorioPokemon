import java.util.Scanner;

/**
 *               
 */
public class Pokemon{

    /**
     * 
     */
    private String especiePokemon;

    /**
     * 
     */
    private String namePokemon;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private double hp;

    public Pokemon(String especiePokemon, String type, double hp){
        this.especiePokemon = especiePokemon;
        namePokemon = especiePokemon;
        this.type = type;
        this.hp = hp;
    }
    
    //setters y getters

    public void setNamePokemon(String namePokemon){
        this.namePokemon = namePokemon;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setHp(double hp){
        this.hp = hp;
    }

    public String getNamePokemon(){
        return namePokemon;
    }

    public String getType(){
        return type;
    }

    public double getHp(){
        return hp;
    }

    public String toString(){

        StringBuilder pokemonInfo = new StringBuilder();
        pokemonInfo.append("------------------------------------\n");
        pokemonInfo.append("Datos\n:"); 
        pokemonInfo.append("Especie: " + especiePokemon + "\n"); 
        pokemonInfo.append("Nombre: "+ namePokemon +"\n"); 
        pokemonInfo.append("Tipo: "+ type + "\n"); 
        pokemonInfo.append("HP:" + hp + "/" + hp + "\n"); 
        pokemonInfo.append("------------------------------------\n"); 

        return pokemonInfo.toString();
    }
    
    
}