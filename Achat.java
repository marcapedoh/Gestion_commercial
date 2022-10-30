
public class Achat extends Article{
    public int numero;
    public Article art;
    public int Qte_art;
    public Achat(int code,String designation,int prix,String categorie,int Qte_stock,int numero,Article art,int Qte_art){
        super(code, designation, prix, categorie, Qte_stock);
        this.numero=numero;
        this.art=art;
        this.Qte_art=Qte_art;
    }

    public int getNumero(){
        return numero;
    }
    public Article getArt(){
        return art;
    }
    public int getQte_stock(){
        return Qte_art;
    }
    public void setNumero(int a){
        numero=a;
    }
    public void setArticle(Article b){
        art=b;
    }
    public void setQte_art(int c){
        Qte_art=c;
    }
    public String ModifierQuantite(int qte){
        Qte_art=qte;
        return "Quantité d'article achété finalement "+Qte_art;
    }
}