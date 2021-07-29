import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class consultation {
    private int numero;
    private String date;
    private medecin Med;

    private patient patient;
    List<medicament> medoc= new ArrayList<>();


    public consultation(int numero, String date,medecin Med ,patient patient,List<medicament> medoc){
        this.numero=numero;
        this.date=date;
        this.Med=Med;
        this.patient=patient;
        this.medoc=medoc;


    }
    public consultation(char numero,String date,medecin Med,List<medicament> medoc){
        this.numero=numero;
        this.date=date;
        this.Med=Med;
        this.medoc=medoc;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(char numero) {
        this.numero = numero;
    }




    public patient getPatient() {
        return patient;
    }

    public void setPatient(patient patient) {
        this.patient = patient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public medecin getMed() {
        return Med;
    }

    public void setMed(medecin med) {
        Med = med;
    }


}

