import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        FacebookAccount acc1 = new FacebookAccount("Dan" , "Cluj" , 21);
        Friend buri = new Friend("Buri" , "Bistrita");
        Friend buri2 = new Friend("Buri2" , "Bistrita2");
        Friend buri3 = new Friend("Buri3" , "Bistrita3");
        acc1.adaugaPrieten(buri);
        acc1.adaugaPrieten(buri2);
        acc1.adaugaPrieten(buri3);
        acc1.AfisarePrieteni();
        acc1.stergePrieten(buri2);
        acc1.AfisarePrieteni();

        Friend buri4 = new Friend("Buri4" , "Bistrita3");
        acc1.adaugaPrieten(buri4);
        List<Friend> prieteniLocation = acc1.getFriendsbyLocation("Bistrita3");
        for(Friend f : prieteniLocation)
            System.out.println(f.getNume() + " locatie:" + f.getLocatie());
    }
}
