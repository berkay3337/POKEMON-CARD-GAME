public class Meowth extends Pokemon {

    private int damage_score=40;
    private String Id = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\pokemon01\\src\\pokemon01\\Images01\\meowth.jpg";

    public Meowth(String pokemon_name, String pokemon_type,int damage_score,String Id) {
        super("Meowth","Normal",40,"C:\\Users\\DELL\\Documents\\NetBeansProjects\\pokemon01\\src\\pokemon01\\Images01\\meowth.jpg");
    } 
    public Meowth() {
        
    }

    public int getDamage_score() {
        return damage_score;
    }

    public void setDamage_score(int damage_score) {
        this.damage_score = damage_score;
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



}