package data;
//TODO check Model
/**
 * Created by nata on 06.09.2016.
 */
public class User {

    private String name;
    private int personFaktor;
    private int morgenDose;
    private int abendDose;


    public User(String name, int personFaktor,int morgenDose,int abendDose) {
        this.name = name;
        this.personFaktor = personFaktor;
        this.morgenDose = morgenDose;
        this.abendDose = abendDose;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getPersonFaktor() {
        return personFaktor;
    }
    public void setPersonFaktor(int personFaktor) {
        this.personFaktor = personFaktor;
    }


    public int getMorgendose() {
        return morgenDose;
    }
    public void setMorgenDose(int morgenDose) {
        this.morgenDose = morgenDose;
    }

    public int getAbendDose() {
        return abendDose;
    }
    public void setAbendDose(int abendDose) {

    }

}
