public class Supportaire extends  Tunisien{
    private  int ticket ;
     private  String chonson ;
     private String drapeau ;
     public  void  supporter();
    public  Supportaire (String nom,String prenom,int age, int passport,int ticket, String chonson, String drapeau)
    {
        super(nom,,prenom,age,passport);
        this.ticket=ticket ;
        this.chonson =chonson;
        this.drapeau =drapeau;
        Supportaire d= new Supportaire("Ridha", "el phil", 52, 12576998,123976,"allez les aigles","tunisie");
    }

}
