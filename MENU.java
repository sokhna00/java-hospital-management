
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MENU {
    public static void main(String[] args) {
        //liste des patients
        patient p1 = new patient(213, "Sokhna Diarra");
        patient p2 = new patient(210, "Ndeye");
        patient p3 = new patient(209, "Fama");
        patient p4 = new patient(211, "Mouhamed");
        ArrayList<patient> mes_patients = new ArrayList<patient>();
        mes_patients.add(p1);
        mes_patients.add(p2);
        mes_patients.add(p3);
        mes_patients.add(p4);

        //liste des Medecins
        medecin m1 = new medecin("Dr Ndiaye", 100);
        medecin m2 = new medecin("Dr DIOP", 101);
        medecin m3 = new medecin("Dr GUEYE", 102);
        medecin m4 = new medecin("Dr SOW", 103);

        //liste des medicaments
        medicament medoc1 = new medicament(123, "Doliprane");
        medicament medoc2 = new medicament(120, "Paracetamol");
        medicament medoc3 = new medicament(115, "Ibuprofen");
        medicament medoc4 = new medicament(150, "Antalys");
        ArrayList<medicament> medocons = new ArrayList<medicament>();
        medocons.add(medoc1);
        medocons.add(medoc2);
        medocons.add(medoc3);
        medocons.add(medoc4);


        //creeons une liste de medicament pour chaque consultation d'abord
        ArrayList<medicament> medocons1 = new ArrayList<medicament>();
        medocons1.add(medoc1);
        medocons1.add(medoc2);

        ArrayList<medicament> medocons2 = new ArrayList<medicament>();
        medocons2.add(medoc1);
        medocons2.add(medoc3);
        medocons2.add(medoc2);

        ArrayList<medicament> medocons3 = new ArrayList<medicament>();
        medocons3.add(medoc1);
        medocons3.add(medoc4);

        ArrayList<medicament> medocons4 = new ArrayList<medicament>();
        medocons4.add(medoc1);
        medocons4.add(medoc4);
        medocons4.add(medoc2);
        medocons4.add(medoc3);


        //liste des consultations
        consultation cons1 = new consultation(1, "2020/03/20", m1, p2, medocons1);
        consultation cons2 = new consultation(2, "2020/03/20", m2, p1, medocons2);
        consultation cons3 = new consultation(3, "2020/03/22", m1, p4, medocons3);
        consultation cons4 = new consultation(4, "2020/03/23", m3, p1, medocons4);
        ArrayList<consultation> consults = new ArrayList<consultation>();
        consults.add(cons1);
        consults.add(cons2);
        consults.add(cons3);
        consults.add(cons4);

        System.out.println("Bienvenue dans votre application de gestion des consultations de l'hopital:");
        System.out.println("Veuillez choisir une commande:");
        System.out.println("1 - La liste des consultations pour un patient.");
        System.out.println("2 - La Liste des patients consultés à une date donnée.");
        System.out.println("3 - Pour une consultation afficher le médecin et son patient.");
        System.out.println("4 -La liste des consultations effectuées par un médecin..");
        System.out.println("5 - La liste des patients consultés par un médecin.");
        System.out.println("6 - La liste des médecins qui ont consulté un patient");
        System.out.println("7 - La liste des médecins qui ont effectué des consultations à une date donnée.");
        System.out.println("8 - Le nombre de consultations.");
        System.out.println("9 - Liste des médicaments prescrit lors d’une consultation");
        System.out.println("10 - La liste des médicaments prescrit par un médecin à un patient à une date donnée.");
        System.out.println("11- La liste des médicaments prescrit par un médecin à un patient");
        System.out.println("12-La liste des médicaments prescrit au moins par deux médecins ");
        System.out.println("13- Pour chaque médicament fournir le nombre total de prescription : Premiere solution d’implémentation.");
        System.out.println("14- Pour chaque médicament fournir le nombre total de prescription : Deuxieme  solution d’implémentation.");
        System.out.println("15- Sortir.");

        Scanner scanchoice = new Scanner(System.in);
        System.out.println();


        int choiceentry = -1;

        while (choiceentry < 1 || choiceentry > 14) {

            System.out.println("Entrez \"1\", \"2\", \"3\" ,\"4\" ,\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\" , \"13\" ou \"14\" ou \"15\"");
            if (scanchoice.hasNextInt())
                choiceentry = scanchoice.nextInt();

        }
        switch (choiceentry) {

            case 1:


                ArrayList<consultation> consultsp1 = new ArrayList<consultation>();
                Scanner input = new Scanner(System.in);
                System.out.println("liste des consultations pour un patient");
                System.out.println("Veuillez renseigner le nom du patient" + " " + " :");
                String name_ent = input.nextLine();
                System.out.println(" ");

                for (consultation cons : consults) {
                    if (cons.getPatient().getNom().equals(name_ent)) {
                        System.out.println("  ||" + cons.getNumero() + " ||" + cons.getDate() + " ||" + " " + cons.getMed().getNom());

                    }
                }


                break;
            case 2:
                //liste des patients consultes a une date donnee , exemple:2020/03/20
                ArrayList<patient> my_patients = new ArrayList<patient>();

                Scanner my_pat = new Scanner(System.in);
                System.out.println("liste des consultations a cette date");
                System.out.println("Veuillez renseigner la date" + " " + " :");
                String date_ent = my_pat.nextLine();
                System.out.println(" ");

                for (consultation cons : consults) {
                    if (cons.getDate().equals(date_ent)) {
                        System.out.println("  ||" + cons.getPatient().getNom() + " ||" + cons.getPatient().getNo_ss() + " ||" + " ");

                    }
                }

                break;
            case 3:
                // Pour une consultation afficher le médecin et son patient ,exemple :consultation numero 2
                Scanner my_paterns = new Scanner(System.in);
                System.out.println("Pour une consultation afficher le médecin et son patient");
                System.out.println("Veuillez renseigner le numero de la consultation" + " " + " :");
                int date_enter = my_paterns.nextInt();
                System.out.println(" ");

                for (consultation cons : consults) {
                    if (cons.getNumero()==date_enter) {
                        System.out.println("  ||"+ cons.getMed().getNom()+ " ||" +cons.getPatient().getNom()+ " ||"+ " ");

                    }
                }


                break;
            case 4:

                //liste des consultations effectuees par un medecin , exemple :Dr Ndiaye
                // ArrayList<consultation> consultsm1 = new ArrayList<consultation>();
                Scanner my_input = new Scanner(System.in);
                System.out.println("liste des consultations effectuees par un medecin");
                System.out.println("Veuillez renseigner le nom du medecin" + " " + " :");
                String name_med = my_input.nextLine();
                System.out.println(" ");

                for (consultation cons : consults) {
                    if (cons.getMed().getNom().equals(name_med)) {
                        System.out.println("  ||" + cons.getNumero() + " ||" + cons.getDate() + " ||" + " " + cons.getPatient().getNom());

                    }
                }


                break;
            case 5:
                //liste des patients consultes par un medecin


                Scanner my_pati = new Scanner(System.in);
                System.out.println("liste des patients consultes par un medecin");
                System.out.println("Veuillez renseigner le nom du medecin" + " " + " :");
                String date_en = my_pati.nextLine();
                System.out.println(" ");

                for (consultation cons : consults) {
                    if (cons.getMed().getNom().equals(date_en)) {
                        System.out.println("  ||"+ cons.getPatient().getNom()+ " ||" +cons.getPatient().getNo_ss()+ " ||"+ " ");

                    }
                }


                break;
            case 6:
                //liste des medecins qui ont consulte un patient donne
                Scanner input_medecin = new Scanner(System.in);
                System.out.println("liste des medecins qui ont consultes un patient donne ");
                System.out.println("Veuillez renseigner le nom du patient" + " " + " :");
                String name_patient = input_medecin.nextLine();
                System.out.println(" ");

                for (consultation cons : consults) {
                    if (cons.getPatient().getNom().equals(name_patient)) {
                        System.out.println("  ||" + cons.getMed().getNom() + " ||" + cons.getMed().getMatricule() + " ||");

                    }
                }

                break;
            case 7:
                //La liste des médecins qui ont effectué des consultations à une date donnée , exemple :2020/03/20
                Scanner input_mon_medecin = new Scanner(System.in);
                System.out.println("liste des medecins qui ont fait des consultations a une date donnee ");
                System.out.println("Veuillez renseigner la date" + " " + " :");
                String date_consult = input_mon_medecin.nextLine();
                System.out.println(" ");

                for (consultation cons : consults) {
                    if (cons.getDate().equals(date_consult)) {
                        System.out.println("  ||" + cons.getMed().getNom() + " ||" + cons.getMed().getMatricule() + " ||");

                    }
                }




                break;
            case 8:
                //Le nombre de consultations.
                System.out.println("Il y'a" + " " + consults.size() + " " + "consultations" + " " + "au total");



                break;
            case 9:
                ArrayList<consultation> cosa= new ArrayList<>();
                //Liste des médicaments prescrit lors d’une consultation
                Scanner input_mes_medocis = new Scanner(System.in);
                System.out.println("liste des medicaments prescrit lors d'une consultation ");
                System.out.println("Veuillez renseigner le numero de la consultation" + " " + " :");
                int list_medicis = input_mes_medocis.nextInt();
                System.out.println(" ");


                for (consultation cons : consults) {
                    if (cons.getNumero()==(list_medicis)){
                        cosa.add(cons);


                    }
                }
                for(consultation cons:cosa) {
                    for (medicament my_medics : cons.medoc) {
                        System.out.println("  ||"+ my_medics.getCode()+ " ||" +my_medics.getLibelle()+ " ||");
                    };

                }

                break;
            case 10:
                    ArrayList<consultation> consam= new ArrayList<>();
                    //La liste des médicaments prescrit par un médecin à un patient a une date donnee
                    Scanner input_mes_medoc1 = new Scanner(System.in);
                    System.out.println("liste des médicaments prescrit par un médecin à un patient a une date donnee ");
                    System.out.println("Veuillez renseigner le medecin" + " " + " :");
                    String list1_medic = input_mes_medoc1.nextLine();
                    System.out.println(" ");
                    Scanner input_mes_medoc2 = new Scanner(System.in);
                    System.out.println("Veuillez renseigner le patient" + " " + " :");
                    String list2_medic = input_mes_medoc2.nextLine();
                    System.out.println(" ");
                    Scanner input_mes_medoc3 = new Scanner(System.in);
                    System.out.println("Veuillez renseigner la date" + " " + " :");
                    String list3_medic = input_mes_medoc3.nextLine();
                    System.out.println(" ");

                    for (consultation cons : consults) {
                        if ((cons.getMed().getNom().equals(list1_medic)) && (cons.getPatient().getNom().equals(list2_medic)) &&(cons.getDate().equals((list3_medic)))) {
                            consam.add(cons);


                        }
                    }
                    for(consultation cons:consam) {
                        for (medicament my_medics : cons.medoc) {
                            System.out.println("  ||"+ my_medics.getCode()+ " ||" +my_medics.getLibelle()+ " ||");
                        };

                    }
                break;
            case 11:
                ArrayList<consultation> consa= new ArrayList<>();
                //La liste des médicaments prescrit par un médecin à un patient
                Scanner input_mes_medocs1 = new Scanner(System.in);
                System.out.println("liste des medicaments prescrit par un medecin a un patient ");
                System.out.println("Veuillez renseigner le medecin" + " " + " :");
                String list_medic = input_mes_medocs1.nextLine();
                System.out.println(" ");
                Scanner input_mes_medocs2 = new Scanner(System.in);
                System.out.println("Veuillez renseigner le patient" + " " + " :");
                String list_medics = input_mes_medocs2.nextLine();
                System.out.println(" ");

                for (consultation cons : consults) {
                    if ((cons.getMed().getNom().equals(list_medic)) && (cons.getPatient().getNom().equals(list_medics))) {
                        consa.add(cons);


                    }
                }
                for(consultation cons:consa) {
                    for (medicament my_medics : cons.medoc) {
                        System.out.println("  ||"+ my_medics.getCode()+ " ||" +my_medics.getLibelle()+ " ||");
                    };

                }
                break;
            case 12:
                ArrayList<consultation> my_const = new ArrayList<>();
                //La liste des médicaments prescrit au moins par deux médecins
                ArrayList<String> my_list = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);
                System.out.println("liste des médicaments prescrit par au moins deux medecins ");
                System.out.println("Veuillez renseigner les medecins" + " " + " :");
                while (!scanner.nextLine().equals("exit") && scanner.hasNextLine()) {

                    my_list.add(scanner.nextLine());

                }

                for (consultation cons : consults) {
                    for (String s : my_list) {
                        if ((cons.getMed().getNom().equals((s)))) {
                            my_const.add(cons);
                        }
                    }

                }
                for (consultation consq : my_const) {
                    for (medicament my_medics : consq.medoc) {
                        System.out.println("  ||" + my_medics.getCode() + " ||" + my_medics.getLibelle() + " ||");
                    }
                }
                break;
            case 13:
                //Pour chaque médicament fournir le nombre total de prescription: Présenter deux solutions d’implémentation.
                Scanner input_mon_medic = new Scanner(System.in);
                System.out.println("Veuillez renseigner le medicament" + " " + " :");
                String list6_medic = input_mon_medic.nextLine();
                System.out.println(" ");
                List<medicament> constotal = new ArrayList<>();
                for (consultation constt : consults) {
                    for (medicament medocpp : constt.medoc) {
                        if (medocpp.getLibelle().equals(list6_medic)) {
                            constotal.add(medocpp);
                        }
                    }

                }
                System.out.println(constotal.size());



                break;
            case 14:

                //Pour chaque médicament fournir le nombre total de prescription: Présenter deux solutions d’implémentation.
                Scanner input_mon_medicament = new Scanner(System.in);
                System.out.println("Veuillez renseigner le medicament" + " " + " :");
                String list7_medic = input_mon_medicament.nextLine();
                System.out.println(" ");
                List<medicament> constotals = new ArrayList<>();
                int mon_compteur=0;
                for (consultation constt : consults) {
                    for (medicament medocppp : constt.medoc) {
                        if (medocppp.getLibelle().equals(list7_medic)) {
                            constotals.add(medocppp);
                            mon_compteur++;

                        }

                    }

                   }

                System.out.println(mon_compteur);
                break;
            case 15:
                System.exit(0);
                break;

        }

    }

                        }
