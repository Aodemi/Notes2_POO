package JeuVideo;

public class Personnage {
    private String nom;
    private short niveau;
    private Arme arme;
    private short pdv;

    public Personnage(String nom, short niveau, Arme arme, short pdv) {
        this.nom = nom;
        this.niveau = niveau;
        this.arme = arme;
        this.pdv = pdv;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public short getNiveau() {
        return niveau;
    }

    public void setNiveau(short niveau) {
        this.niveau = niveau;
    }

    public Arme getArme() {
        return arme;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }

    public short getPdv() {
        return pdv;
    }

    public void setPdv(short pdv) {
        if(pdv < 0){
            pdv = 0;
        }
        this.pdv = pdv;
    }

    public void attaquer(Personnage victime){
        //degats infligés = puissance arme = 1.1 exposant le niveau du perso
        short degats = ((short)(this.arme.getDpc() * Math.pow(1.1, this.getNiveau())));
        victime.setPdv((short)(victime.getPdv() - degats));
    }

    @Override
    public String toString(){
        return (this.nom + "(" + this.niveau + ") avec l'arme : " + this.arme + " pdv restants : " + this.pdv);
    }
}
