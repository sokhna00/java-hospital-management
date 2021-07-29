import java.util.ArrayList;
import java.util.List;

public class medicament {
     List<medecin> medecins=new ArrayList<>();
    List<patient> patients=new ArrayList<>();
    private Integer code;
    private String libelle;
    List<consultation> consults=new ArrayList<>();


    public medicament(Integer code, String libelle){
        this.code=code;
        this.libelle=libelle;
    }

    public medicament(Integer code, String libelle,List<consultation> consults,List<medecin> medecins,List<patient> patients){
        this.code=code;
        this.libelle=libelle;
        this.consults=consults;
        this.medecins=medecins;
        this.patients=patients;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
