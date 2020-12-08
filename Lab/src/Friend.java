public class Friend {
    private String nume , locatie ;
    public Friend(String nume , String locatie)
    {
        this.nume = nume ;
        this.locatie = locatie ;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public boolean equals(Object o)
    {
        Friend prieten = (Friend)o;
        if (this.nume.equals(prieten.nume) && this.locatie.equals(prieten.locatie) )
            return true;
        return false;
    }
}
