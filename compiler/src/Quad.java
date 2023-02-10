import java.util.ArrayList;
import java.util.List;
public class Quad {
    private String Operateur;
    private String Opdroit;
    private String Opgauche;
    private String Containeur;
    private boolean isEffective;

    public Quad(boolean isEffective)
    {
        this.isEffective= isEffective;
    }

    public Quad(String op, String label, String param1, String param2) {

        this.setOperateur(op);
        this.setOpdroit(label);
        this.setOpgauche(param1);
        this.setContaineur(param2);
    }

    public boolean isEffective()
    {
        return isEffective;
    }
    public String getOperateur()
    {
        return Operateur;
    }
    public Quad setOperateur(String Operateur)
    {
        this.Operateur=Operateur;
        return this;
    }
    public String getOpgauche()
    {
        return Opgauche;
    }
    public Quad setOpgauche(String Opgauche)
    {
        this.Opgauche=Opgauche;
        return this;
    }
    public String getOpdroit()
    {
        return Opdroit;
    }
    public Quad setOpdroit(String Opdroit)
    {
        this.Opdroit=Opdroit;
        return this;
    }
    public String getContaineur()
    {
        return Containeur;
    }
    public Quad setContaineur(String Containeur)
    {
        this.Containeur=Containeur;
        return this;
    }
    public void permutOperateurs()
    {
        String temp = Opgauche;
        Opgauche=Opdroit;
        Opdroit=temp;
    }
   public String  affich(Quad quad)
   {
       return "( "+ quad.getOperateur()+" ," +quad.getOpdroit() +" ," +quad.getOpgauche()+" ,"+  quad.getContaineur()+" )";
   }

}
