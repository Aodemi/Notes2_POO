package JeuVideo;

public class Arc extends Arme{
    String typeDeCorde = "Sèche";
    public Arc(short dpc) {
        super(dpc);
        this.nom = "Arc";
    }
}
//         System.out.println(((Arc)arme).typeDeCorde); Appel la méthode de arc
