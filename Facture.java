import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Facture extends Achat{
    public int numero_fact;
    public String date_fact;
    public Achat collect_achat;

    public Facture(int code,String designation,int prix,String categorie,int Qte_stock,int numero,Article art,int Qte_art,int numero_fact,String date_fact,Achat collect_achat){
        super(code,designation, prix, categorie, Qte_stock, numero_fact, art, Qte_art);
        this.numero_fact=numero_fact;
        this.date_fact=date_fact;
        this.collect_achat=collect_achat;
    }
    public int getNumero_fact(){
        return numero_fact;
    }
    public String getDate_fact(){
        return date_fact;
    }
    public Achat getCollect_achat(){
        return collect_achat;
    }
    public void setNumero_fact(int a){
        numero_fact=a;
    }
    public void setDate_fact(String b){
        date_fact=b;
    }
    public void setCollect_achat(Achat c){
        collect_achat=c;
    }
    public void AjouterAchat(Achat numero){
        List<Achat> tab=new ArrayList<Achat>();
        boolean bool=false;
        for(int i=0;i<tab.size();i++){
            if(numero!=tab.get(i)){
                tab.add(numero);
                bool=true;
                System.out.println("cet achat n'existe pas encore");
            }
        }
        if(bool==false){
            System.out.println("Erreur cet article existe déjà");
        }
    }
    public void MontantTotalFacture(){
        int prixTTC;
        int s=0;
        List<Achat> tab1=new ArrayList<Achat>();
        for(int i=0;i<tab1.size();i++){
            prixTTC=(prix*Qte_art);
            s+=prixTTC;
        }
        System.out.println("le montant total de la facture: "+s);
    }
    public void DetailsFacture(double remise){
        Scanner sc=new Scanner(System.in);
        String rep;
        System.out.println("il y a t'il une remise O:oui N:non ");
        rep=sc.next();
        if(rep=="O"){
            System.out.println("Entrez la remise ");
            remise=sc.nextDouble();
            System.out.println("Numero facture "+numero_fact+" date facture "+date_fact);
            System.out.println("                     Liste des achats                  ");
            System.out.println("Désignation   remise   Prix(en DH)   Quantité   prix Total");
            List<Achat> tab2=new ArrayList<Achat>();
            for(int i=0;i<tab2.size();i++){
                System.out.println(designation+"   "+remise+"   "+prix+"   "+Qte_art+"  "+((prix*Qte_art)-((prix*Qte_art)*remise)));
            }
        }
        else{
            System.out.println("Numero facture "+numero_fact+" date facture "+date_fact);
            System.out.println("                     Liste des achats                  ");
            System.out.println("Désignation   remise   Prix(en DH)   Quantité   prix Total");
            List<Achat> tab2=new ArrayList<Achat>();
            for(int i=0;i<tab2.size();i++){
                System.out.println(designation+"   "+null+"   "+prix+"   "+Qte_art+"   "+(prix*Qte_art));
            }
        }
        }
}
