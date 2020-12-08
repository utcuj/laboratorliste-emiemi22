import java.util.HashMap;
import java.util.Map;
/*
Implementati un Dictionar roman-englez pentru maxim 10 cuvinte la alegere folosind un java.util.Map
//        - afisati numarul de cuvinte salvate in dictionar (size)
//        - afisati toate cuvintele din dictionar impreuna cu traducerea lor (entrySet)
//        - afisati toate cuvintele in romana pentru care avem traducerea (chei)
//        - afisati toate cuvintele in engleza pentru care avem traducerea (valori)
//        - updatati valoarea unui cuvant din dictionar cu o noua traducere si afisati-o la consola
*/

public class Dictionar {
    private Map<String, String> dictionar = new HashMap<>();
    public void addCuvant (String cuvRom , String cuvEng)
    {
        dictionar.put(cuvRom,cuvEng);
    }
    public int dimnesiuneDictionar()
    {
        return dictionar.size();
    }
    /*
    *
    * HashMap<String, HashMap> selects = new HashMap<String, HashMap>();
for(Map.Entry<String, HashMap> entry : selects.entrySet()) {​​​​​
  String key = entry.getKey();
  HashMap value = entry.getValue();
  // do what you have to do here  // In your case, an other loop.}
    * */

    public void getKeys()
    {
        for(Map.Entry<String,String> entry : dictionar.entrySet())
        {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Cheia este " + key + " valoarea este " + value);
        }
    }
    public String getValues(String key)
    {
        return dictionar.get(key);
    }
    public void cuvInRomana()
    {
        for(String key : dictionar.keySet())
        {
            System.out.println(key);
        }
    }
    public void cuvInEngleza()
    {
        for(String key : dictionar.values())
        {
            System.out.println(key);
        }
    }
    public void setNewTranslate(String key , String value)
    {
        dictionar.put(key,value);
    }

}
