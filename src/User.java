
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class User extends Gamer {

    
    int i;
    int j=0;
    int k=0;
    int[] u1score=new int[5];
     int[] c1score=new int[5];
     int uscore=0;
     int cscore=0;
     ArrayList<String>name=new ArrayList<>();
     int u3score=0;
     int c3score=0;
     int[] u2score=new int[5];
     int[] c2score=new int[5];
    
   

    public User(String user_name,String user_id,int score) {

        super(" "," ",0);


    }
    
    
    
    
    
    

   
arayüz01 arayüz01=new arayüz01();

    
    public User(){
      puan[0]="C:\\Users\\DELL\\Documents\\NetBeansProjects\\pokemon01\\src\\pokemon01\\Images01\\0.png";
      puan[1]="C:\\Users\\DELL\\Documents\\NetBeansProjects\\pokemon01\\src\\pokemon01\\Images01\\5.png";
      puan[2]="C:\\Users\\DELL\\Documents\\NetBeansProjects\\pokemon01\\src\\pokemon01\\Images01\\10.png";
      puan[3]="C:\\Users\\DELL\\Documents\\NetBeansProjects\\pokemon01\\src\\pokemon01\\Images01\\15.png";
      puan[4]="C:\\Users\\DELL\\Documents\\NetBeansProjects\\pokemon01\\src\\pokemon01\\Images01\\20.png";
      puan[5]="C:\\Users\\DELL\\Documents\\NetBeansProjects\\pokemon01\\src\\pokemon01\\Images01\\25.png";
      
            
        
        icons=new ImageIcon[10];  
        
        for(i=0;i<3;i++){
    
       icons[i]=new ImageIcon(usr.get(i));       
        
    }
        for(i=3;i<6;i++){
            
            
            icons[i]=new ImageIcon(cmp.get(j));
             j++;
                     
                     
            
            
        }
        
       for(i=6;i<10;i++){
            
            
            icons[i]=new ImageIcon(yer.get(k));
            k++;
             
            
        }
       
         for(int l=0;l<10;l++){
            
            String b=icons[0].toString();
           if(dscont.get(l).getId().equals(b)){
               
               cdamage[0]=dscont.get(l).getDamage_score();
    
         
            }
       }
        for(int l=0;l<10;l++){
            
            String b=icons[1].toString();
           if(dscont.get(l).getId().equals(b)){
               
               cdamage[1]=dscont.get(l).getDamage_score();
    
         
            }
       }
        for(int l=0;l<10;l++){
            
            String b=icons[2].toString();
           if(dscont.get(l).getId().equals(b)){
               
               udamage[0]=dscont.get(l).getDamage_score();
    
         
            }
       }
        for(int l=0;l<10;l++){
            
            String b=icons[3].toString();
           if(dscont.get(l).getId().equals(b)){
               
               cdamage[2]=dscont.get(l).getDamage_score();
    
         
            }
       }
        for(int l=0;l<10;l++){
            
            String b=icons[4].toString();
           if(dscont.get(l).getId().equals(b)){
               
               udamage[2]=dscont.get(l).getDamage_score();
    
         
            }
       }
        for(int l=0;l<10;l++){
            
            String b=icons[5].toString();
           if(dscont.get(l).getId().equals(b)){
               
               udamage[1]=dscont.get(l).getDamage_score();
    
         
            }
       }
        for(int l=0;l<10;l++){
            
            String b=icons[6].toString();
           if(dscont.get(l).getId().equals(b)){
               
               udamage[4]=dscont.get(l).getDamage_score();
    
         
            }
       }
        for(int l=0;l<10;l++){
            
            String b=icons[7].toString();
           if(dscont.get(l).getId().equals(b)){
               
               cdamage[3]=dscont.get(l).getDamage_score();
    
         
            }
       }
        for(int l=0;l<10;l++){
            
            String b=icons[8].toString();
           if(dscont.get(l).getId().equals(b)){
               
               cdamage[4]=dscont.get(l).getDamage_score();
    
         
            }
       }
        for(int l=0;l<10;l++){
            
            String b=icons[9].toString();
           if(dscont.get(l).getId().equals(b)){
               
               udamage[3]=dscont.get(l).getDamage_score();
    
         
            }
       }
        
        if(udamage[0]>cdamage[0]){
            
            uscore=uscore+5;
            
            
            
        }
        if(udamage[0]<cdamage[0]){
            
            cscore=cscore+5;
            
            
            
        }
        if(udamage[0]==cdamage[0]){
            
            
            
            
            
        }
        
        u1score[0]=uscore;
        c1score[0]=cscore;
            
        if(udamage[1]>cdamage[1]){
            
            uscore=uscore+5;
            
            
            
        }
        if(udamage[1]<cdamage[1]){
            
            cscore=cscore+5;
            
            
            
        }
        if(udamage[1]==cdamage[1]){
            
            
            
            
            
        }
        
        u1score[1]=uscore;
        c1score[1]=cscore;
            
        if(udamage[2]>cdamage[2]){
            
            uscore=uscore+5;
            
            
            
        }
        if(udamage[2]<cdamage[2]){
            
            cscore=cscore+5;
            
            
            
        }
        if(udamage[2]==cdamage[2]){
            
            
            
            
            
        }
        
        u1score[2]=uscore;
        c1score[2]=cscore;
            
        if(udamage[3]>cdamage[3]){
            
            uscore=uscore+5;
            
            
            
        }
        if(udamage[3]<cdamage[3]){
            
            cscore=cscore+5;
            
            
            
        }
        if(udamage[3]==cdamage[3]){
            
            
            
            
            
        }
        
        u1score[3]=uscore;
        c1score[3]=cscore;
            
        if(udamage[4]>cdamage[4]){
            
            uscore=uscore+5;
            
            
            
        }
        if(udamage[4]<cdamage[4]){
            
            cscore=cscore+5;
            
            
            
        }
        if(udamage[4]==cdamage[4]){
            
            
            
            
            
        }
        
        u1score[4]=uscore;
        c1score[4]=cscore;
        
         if(udamage[1]>cdamage[0]){
            
            u3score=u3score+5;
            
            
            
        }
        if(udamage[1]<cdamage[0]){
            
            c3score=c3score+5;
            
            
            
        }
        if(udamage[1]==cdamage[0]){
            
            
            
            
            
        }
        
        u2score[0]=u3score;
        c2score[0]=c3score;
            
        if(udamage[2]>cdamage[1]){
            
            u3score=u3score+5;
            
            
            
        }
        if(udamage[2]<cdamage[1]){
            
            c3score=c3score+5;
            
            
            
        }
        if(udamage[2]==cdamage[1]){
            
            
            
            
            
        }
        
        u2score[1]=u3score;
        c2score[1]=c3score;
            
        if(udamage[0]>cdamage[2]){
            
            c3score=c3score+5;
            
            
            
        }
        if(udamage[0]<cdamage[2]){
            
            u3score=u3score+5;
            
            
            
        }
        if(udamage[0]==cdamage[2]){
            
            
            
            
            
        }
        
        u2score[2]=u3score;
        c2score[2]=c3score;
            
        if(udamage[4]>cdamage[3]){
            
            u3score=u3score+5;
            
            
            
        }
        if(udamage[4]<cdamage[3]){
            
            c3score=c3score+5;
            
            
            
        }
        if(udamage[4]==cdamage[3]){
            
            
            
            
            
        }
        
        u2score[3]=u3score;
        c2score[3]=c3score;
            
        if(udamage[3]>cdamage[4]){
            
            c3score=c3score+5;
            
            
            
        }
        if(udamage[3]<cdamage[4]){
            
            u3score=u3score+5;
            
            
            
        }
        if(udamage[3]==cdamage[4]){
            
            
            
            
            
        }
        
        u2score[4]=u3score;
        c2score[4]=c3score;
        
        
        
   
    
    
    
    
    
}


    @Override
    void Choose_Card() {
        
         for(i=0;i<3;i++){
    
       icons[i]=new ImageIcon(usr.get(i));       
        
    }
        for(i=3;i<6;i++){
            
            
            icons[i]=new ImageIcon(cmp.get(j));
             j++;
                     
                     
            
            
        }
        
       for(i=6;i<10;i++){
            
            
            icons[i]=new ImageIcon(yer.get(k));
            k++;
             
            
        }
       
         for(int l=0;l<10;l++){
            
            String b=icons[0].toString();
           if(dscont.get(l).getId().equals(b)){
               
               cdamage[0]=dscont.get(l).getDamage_score();
    
         
            }
       }
        for(int l=0;l<10;l++){
            
            String b=icons[1].toString();
           if(dscont.get(l).getId().equals(b)){
               
               cdamage[1]=dscont.get(l).getDamage_score();
    
         
            }
       }
        for(int l=0;l<10;l++){
            
            String b=icons[2].toString();
           if(dscont.get(l).getId().equals(b)){
               
               udamage[0]=dscont.get(l).getDamage_score();
    
         
            }
       }
        for(int l=0;l<10;l++){
            
            String b=icons[3].toString();
           if(dscont.get(l).getId().equals(b)){
               
               cdamage[2]=dscont.get(l).getDamage_score();
    
         
            }
       }
        for(int l=0;l<10;l++){
            
            String b=icons[4].toString();
           if(dscont.get(l).getId().equals(b)){
               
               udamage[2]=dscont.get(l).getDamage_score();
    
         
            }
       }
        for(int l=0;l<10;l++){
            
            String b=icons[5].toString();
           if(dscont.get(l).getId().equals(b)){
               
               udamage[1]=dscont.get(l).getDamage_score();
    
         
            }
       }
        for(int l=0;l<10;l++){
            
            String b=icons[6].toString();
           if(dscont.get(l).getId().equals(b)){
               
               udamage[4]=dscont.get(l).getDamage_score();
    
         
            }
       }
        for(int l=0;l<10;l++){
            
            String b=icons[7].toString();
           if(dscont.get(l).getId().equals(b)){
               
               cdamage[3]=dscont.get(l).getDamage_score();
    
         
            }
       }
        for(int l=0;l<10;l++){
            
            String b=icons[8].toString();
           if(dscont.get(l).getId().equals(b)){
               
               cdamage[4]=dscont.get(l).getDamage_score();
    
         
            }
       }
        for(int l=0;l<10;l++){
            
            String b=icons[9].toString();
           if(dscont.get(l).getId().equals(b)){
               
               udamage[3]=dscont.get(l).getDamage_score();
    
         
            }
       }
        
        
        

    }



}