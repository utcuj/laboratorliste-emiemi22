public class Main2 {
    public static void main (String [] args)
    {
        Dictionar dictionar1 = new Dictionar();
        dictionar1.addCuvant("mar" , "apple");
        dictionar1.addCuvant("masina" , "car");
        dictionar1.addCuvant("banana" , "banana");
        dictionar1.addCuvant("casa" , "house");
        dictionar1.addCuvant("muzica" , "music");
        System.out.println();
        dictionar1.getKeys();
        System.out.println(dictionar1.getValues("mar"));
        System.out.println();
        dictionar1.cuvInEngleza();
        System.out.println();
        dictionar1.cuvInRomana();
        System.out.println();
        dictionar1.setNewTranslate("casa" , "home");
        dictionar1.getKeys();
    }
}
