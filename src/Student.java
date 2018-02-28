public class Student {

    //Instansvariabler
    private String navn;
    private int aargang;

    //Constructor med 2 parametre
    Student(String navn, int aargang){
        this.navn = navn;
        this.aargang = aargang;
    }

    //Metoder
    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAargang() {
        return aargang;
    }

    public void setAargang(int aargang) {
        this.aargang = aargang;
    }

}