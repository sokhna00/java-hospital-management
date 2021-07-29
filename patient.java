import java.util.ArrayList;
import java.util.List;

public class patient {
    private Integer no_ss;
    private String nom;
    List<consultation> consults =new ArrayList<>();

    public patient(Integer no_ss,String nom,List<consultation> consults){
        this.no_ss=no_ss;
        this.nom=nom;
        this.consults=consults;
    }

    public patient(Integer no_ss,String nom){
        this.no_ss=no_ss;
        this.nom=nom;

    }

    public Integer getNo_ss() {
        return no_ss;
    }

    public void setNo_ss(Integer no_ss) {
        this.no_ss = no_ss;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
