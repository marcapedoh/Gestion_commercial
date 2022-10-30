public class TestGedtion {

    public static void main(String[] args){
        Article A1=new Article(1, "Tomate", 500, "legume", 15000);
        Article A2=new Article(2, "Corn flakes", 2400, "petit dejeuner", 75);
        System.out.println(A1.afficher()+'\n');
        System.out.println(A2.afficher()+'\n');
        Achat Ac1=new Achat(2, "corn flakes", 2400, "petit dejeuner", 75, 10, A2, 2);
        Achat Ac2 =new Achat(1, "Tomate", 500, "légume", 15000, 11, Ac1, 15);
        System.out.println(Ac1.ModifierQuantite(150)+'\n');
        Facture F1=new Facture(2, "Corn flakes", 2400, "petit dejeuner", 75, 11, Ac1, 15, 20, "27/08/2021", Ac2);
        F1.AjouterAchat(Ac2);
        F1.AjouterAchat(Ac1);
        F1.MontantTotalFacture();
        F1.DetailsFacture(4.15);
    }
}
