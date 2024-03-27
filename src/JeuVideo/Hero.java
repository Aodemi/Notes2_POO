package JeuVideo;

public class Hero extends Personnage{
    private int xp;

    public Hero(String nom, short niveau, Arme arme, short pdv, int xp) {
        super(nom, niveau, arme, pdv);
        this.xp = xp;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
        if(xp > 1000 * Math.pow(1.05, getNiveau())){
            this.setNiveau((short)(this.getNiveau() + 1));
            setXp(xp - (int)(1000 * Math.pow(1.05, getNiveau())));
            System.out.println("Vous êtes montez au niveau : " + getNiveau());
        }
    }
}
