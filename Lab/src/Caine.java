public class Caine
{
    private String nume ;
    private String rasa ;
    private int varsta ;

    public Caine (String nume , String rasa , int varsta)
    {
        this.nume = nume ;
        this.rasa = rasa ;
        this. varsta = varsta ;
    }
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Caine{" +
                "nume='" + nume + '\'' +
                ", rasa='" + rasa + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
