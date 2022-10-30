public class Article{
    public int code;
    public String designation;
    public int prix;
    public String categorie;
    public int Qte_stock;
    public Article(int code,String designation,int prix,String categorie,int Qte_stock){
        this.code=code;
        this.designation=designation;
        this.prix=prix;
        this.categorie=categorie;
        this.Qte_stock=Qte_stock;
    }
    public int getCode(){
        return code;
    }
    public String getDesignation(){
        return designation;
    }
    public int getprix(){
        return prix;
    }
    public String getcategorie(){
        return categorie;
    }
    public int getQte_stock(){
        return Qte_stock;
    }
    public String afficher(){
        return "article "+code+" Designation "+designation+" prix "+prix+" Qte_stock "+Qte_stock;
    }
    public void comparer(String nom,String nom1,int prix,int prix1){
        if(nom!=nom1 && prix!=prix1){
            System.out.println("ces articles sont differentes");
        }else{
            System.out.println("oui ils sont bien identique");
        }
    }
}