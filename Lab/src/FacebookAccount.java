import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FacebookAccount {
    private String nume, locatie;
    private int varsta;
    private List<Friend> listaPrieteni = new ArrayList<>();

    public FacebookAccount(String nume , String locatie , int varsta )
    {
        this.nume = nume ;
        this.locatie= locatie;
        this.varsta=varsta;
    }
    public void adaugaPrieten(Friend prieten) {
        listaPrieteni.add(prieten);
    }

    public void stergePrieten(Friend prieten) {
        listaPrieteni.remove(prieten);
    }

    public List<Friend> getFriend() {
        return listaPrieteni;
    }

    public List<Friend> getFriendsbyLocation(String loc)
    {

        return (List<Friend>) listaPrieteni.stream().filter(friend -> friend.getLocatie().equals(loc)).collect(Collectors.toList());
    }
    public void AfisarePrieteni()
    {
        for(Friend f : listaPrieteni)
            System.out.println(f.getNume() + " locatie:" + f.getLocatie());
    }
}