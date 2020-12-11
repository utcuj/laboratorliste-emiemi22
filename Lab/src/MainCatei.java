public class MainCatei {
    public static void main(String [] args)
    {
        Caine catel1 = new Caine("Azorel" , "Bichon" , 2);
        Caine catel2 = new Caine("Rex" , "Ciobanesc german" , 1);
        Caine catel3 = new Caine("Rebecca" , "Mops" , 4);
        Caine catel4 = new Caine("Latrau" , "Bichon" , 2);

        PetHotel hotel = new PetHotel("HiltonDogs");
        hotel.adaugaCaine(catel1 , 3);
        hotel.adaugaCaine(catel2 , 2);
        hotel.adaugaCaine(catel3 , 1);
        hotel.adaugaCaine(catel4 , 5);

        hotel.afisareCaini();
        hotel.afisareNume();
        Caine catelnou = new Caine("Latrau2" , "Bichon" , 3);
        hotel.updateCatel(3,catelnou);
        hotel.afisareCaini();
    }
}
