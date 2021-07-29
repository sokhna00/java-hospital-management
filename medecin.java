import java.util.Collection;
import java.util.List;
import java.util.ArrayList;


public class medecin
{
    private Integer matricule;
    private String nom;
    List<consultation> consults=new ArrayList<>();

    public medecin(String nom, Integer matricule)
    {
        this.nom = nom;
        this.matricule=matricule;
        
    }
    public medecin(String nom, Integer matricule , List<consultation> consults)
    {
        this.nom = nom;
        this.matricule=matricule;
        this.consults=consults;

    }


    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public  Integer getMatricule()
    {
        return matricule;
    }

    public void setMatricule( Integer matricule)
    {
        this.nom = nom;
    }





}