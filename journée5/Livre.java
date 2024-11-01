public class Livre {
    private String titre;
    private String auteur;
    private String année;

    public Livre(){
        this.titre = "La maison des feuilles";
        this.auteur = "Florent BOUDZ";
        this.année = "24 Decembre 2074";
    }

    Livre(String titre, String auteur, String année){
        this.titre = titre;
        this.auteur = auteur;
        this.année = année;
    }
    public void Affich(){
        System.out.println("INFORMATION SUR LE LIVRE\n\nTitre: "+titre + "\nAuteur: "+auteur +"\nAnnée de publication: "+année);
    }
    public static void main(String[] args) {
        Livre li = new Livre();
        li.Affich();
    }
}
