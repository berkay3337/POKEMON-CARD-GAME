
import java.util.ArrayList;
import javax.swing.ImageIcon;

public abstract class Gamer {

     ArrayList<Pokemon> pics= new ArrayList<>();
     ArrayList<String> cmp=new ArrayList<>();
     ArrayList<String>usr=new ArrayList<>();
     ArrayList<String>yer=new ArrayList<>();
     ArrayList<Pokemon> dscont=new ArrayList<>();
     String[] puan = new String [6];
     
     int[] udamage=new int[5];
     int[] cdamage=new int[5];
    
  
     
     
     ImageIcon icons[];
   
    
    int a=(int)(Math.random()*9);
    private String user_name;
    private String user_id;
    private int score;
    String[] card_list= {"Pikachu","Balbasaur","Charmander","Squirtle","Zubat","Psyduck","Snorlax","Butterfree","Jigglypuff","Meowth"};



    public Gamer(String user_name, String user_id,int score) {

        this.user_name = user_name;
        this.user_id = user_id;
        this.score=score;

    }
    
    public Gamer(){
        
        pics.add(new Balbasaur());
        pics.add(new Butterfree());
        pics.add(new Charmander());
        pics.add(new Jigglypuff());
        pics.add(new Meowth());
        pics.add(new Pikachu());
        pics.add(new Psyduck());
        pics.add(new Snorlax());
        pics.add(new Squirtle());
        pics.add(new Zubat());
        
        dscont.add(new Balbasaur());
        dscont.add(new Butterfree());
        dscont.add(new Charmander());
        dscont.add(new Jigglypuff());
        dscont.add(new Meowth());
        dscont.add(new Pikachu());
        dscont.add(new Psyduck());
        dscont.add(new Snorlax());
        dscont.add(new Squirtle());
        dscont.add(new Zubat());
        int x=0,c=9;
        while(x<3){
            int a=(int)(Math.random()*c);
            
            cmp.add(pics.get(a).getId()); 
            pics.remove(a);
            c--;
            int b=(int)(Math.random()*c);
            
            usr.add(pics.get(b).getId());
            pics.remove(b);
            c--;
            
            
            
            x++;
        }
        int y=0;
        while(y<4){
            
            yer.add(pics.get(y).getId());
            y++;
            
            
            
        }
        
      icons=new ImageIcon[10];  
     
               
        
    }






    public String getUser_name() {
        return user_name;
    }



    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }



    public String getUser_id() {
        return user_id;
    }



    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }



    public int getScore() {
        return score;
    }



    public void setScore(int score) {
        this.score = score;
    }



    abstract void Choose_Card();


    public void show_score() {
        
        
        
     


    }

    /**
     * @return the pics
     */
    public ArrayList<Pokemon> getPics() {
        return pics;
    }

    /**
     * @param pics the pics to set
     */
    public void setPics(ArrayList<Pokemon> pics) {
        this.pics = pics;
    }

    /**
     * @return the cmp
     */
    public ArrayList<String> getCmp() {
        return cmp;
    }

    /**
     * @param cmp the cmp to set
     */
    public void setCmp(ArrayList<String> cmp) {
        this.cmp = cmp;
    }

    /**
     * @return the usr
     */
    public ArrayList<String> getUsr() {
        return usr;
    }

    /**
     * @param usr the usr to set
     */
    public void setUsr(ArrayList<String> usr) {
        this.usr = usr;
    }

    /**
     * @return the yer
     */
    public ArrayList<String> getYer() {
        return yer;
    }

    /**
     * @param yer the yer to set
     */
    public void setYer(ArrayList<String> yer) {
        this.yer = yer;
    }

    /**
     * @return the icons
     */
    

    





}