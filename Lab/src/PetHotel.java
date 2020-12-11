import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetHotel {
    private String nume ;
    private HashMap<Integer , Caine> registru = new HashMap<Integer, Caine>();

    public PetHotel(String nume)
    {
        this.nume = nume ;
    }
    public void adaugaCaine(Caine c , int key)
    {
        registru.put(key, c);
    }
    public void afisareCaini()
    {
        for(Map.Entry<Integer,Caine> entry : registru.entrySet())
        {
            System.out.println("Camera: " + entry.getKey() + " il are ca oaspete pe Catelul: " + entry.getValue().getNume() + " rasa: " +entry.getValue().getRasa() +" varsta: "+ entry.getValue().getVarsta());
        }
    }
    public void afisareNume()
    {
        for(Caine c : registru.values())
        {
            System.out.println("Cainele: " + c.getNume());
        }
    }
    public void updateCatel(int index , Caine catelNou){
        registru.replace(index , catelNou);
    }



}
