    public class Voiture {
        private String marque;
        private String modele;
        private int année;
        
        public Voiture(){
            this.marque = " Toyota";
            this.modele = "Rav-4";
            this.année = 2019;
        } 

        Voiture(String marque, String modele, int année){
            this.marque = marque;
            this.modele = modele;
            this.année = année;
        }
        public void affi(){
            System.out.println("La marque est :" + this.marque + "\n Le modèle est : " + this.modele + "\n L'année: " + this.année);
        }
        public static void main(String[] args) {
            Voiture voi = new Voiture();
            voi.affi();
        }
    }

