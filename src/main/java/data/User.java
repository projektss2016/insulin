package data;
//TODO check Model
/**
 * Created by nata on 06.09.2016.
 */
public class User {

    private String name;
    private double personFaktor;
    private double morgenDose;
    private double abendDose;
    private double gewicht;


    public User(String name, double personFaktor,double morgenDose,double abendDose,double gewicht) {
        this.name = name;
        this.personFaktor = personFaktor;
        this.morgenDose = morgenDose;
        this.abendDose = abendDose;
        this.gewicht = gewicht;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public double getPersonFaktor() {
        return personFaktor;
    }
    public void setPersonFaktor(double personFaktor) {
        this.personFaktor = personFaktor;
    }


    public double getMorgendose() {
        return morgenDose;
    }
    public void setMorgenDose(double morgenDose) {
        this.morgenDose = morgenDose;
    }

    public double getAbendDose() {
        return abendDose;
    }
    public void setAbendDose(double abendDose) {  this.abendDose = abendDose;  }

    public double getGewicht() {
        return gewicht;
    }
    public void setGewicht(double gewicht) {  this.gewicht = gewicht;  }
}


