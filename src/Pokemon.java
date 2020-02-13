
import java.util.ArrayList;

public class Pokemon {
  
    private String pokemon_name;

    private String pokemon_type;
    
    private int damage_score;
    
    private String Id ;
    


    public Pokemon(String pokemon_name, String pokemon_type,int damage_score,String Id) {

        this.pokemon_name = pokemon_name;

        this.pokemon_type = pokemon_type;
        
        this.damage_score = damage_score;
        
        this.Id=Id;
    }

    public Pokemon(){
    
        
        
      
    
    }
    
    
    
    
    

    public String getPokemon_name() {
        return pokemon_name;
    }


    public void setPokemon_name(String pokemon_name) {
        this.pokemon_name = pokemon_name;
    }


    public String getPokemon_type() {
        return pokemon_type;
    }


    public void setPokemon_type(String pokemon_type) {
        this.pokemon_type = pokemon_type;
    }

    /**
     * @return the Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @return the damage_score
     */
    public int getDamage_score() {
        return damage_score;
    }

    /**
     * @param damage_score the damage_score to set
     */
    public void setDamage_score(int damage_score) {
        this.damage_score = damage_score;
    }



}