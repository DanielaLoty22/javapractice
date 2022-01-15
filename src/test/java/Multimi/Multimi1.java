package Multimi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi1 {
    @Test
    public void testautomat() {
        multiminumereArray();
         //multimiprenumeArray();
        //multimiprenumelist();
       //multimevaloriHashMap();
        //multimitariorase();


    }

    public void multiminumereArray() {

        Integer[] numere = new Integer[3];
        numere[0] = 5;
        numere[1] = 6;
        numere[2] = 7;
        for (Integer index = 0; index < numere.length; index++) {
            System.out.println(numere[index]);
        }
    }

    public void multimiprenumeArray() {
        String[] prenume = new String[4];
        prenume[0] = "Daniela";
        prenume[1] = "Alex";
        prenume[2] = "Florin";
        prenume[3] = "Dorin";
        for (Integer index = 0; index < prenume.length; index++) {
            System.out.println(prenume[index]);
        }
    }

    public void multimiprenumelist() {
        List<String> prenume = new ArrayList<>();
        prenume.add("Daniela");
        prenume.add("Alex");
        prenume.add("Florin");
        prenume.add("Dorin");
        prenume.add("Simona");
        prenume.add("Madalina");
        for (Integer index = 0; index < prenume.size(); index++) {
            System.out.println(prenume.get(index));
        }
    }

    public void multimevaloriHashMap() {

        //HashMap functioneaza dupa logica de key=value
        HashMap<String, String> obiectediferite = new HashMap<>();
        obiectediferite.put("fruct", "mar");
        obiectediferite.put("leguma", "morcov");
        obiectediferite.put("haina", "bluza");
        for (String key : obiectediferite.keySet()) {
            System.out.println("cheia este " + key);
            System.out.println("valoarea este " + obiectediferite.get(key));
        }
        Object firstkey = obiectediferite.keySet().toArray()[0];
        Object valueforfirstkey = obiectediferite.get(firstkey);
        System.out.println("prima cheie este " + firstkey.toString());
        System.out.println("prima valoare este " + valueforfirstkey.toString());
    }

    public void multimitariorase() {
        List<String> oraseromania = new ArrayList<>();
        oraseromania.add("Cluj");
        oraseromania.add("Bucuresti");
        oraseromania.add("Iasi");
        List<String> orasespania = new ArrayList<>();
        orasespania.add("Barcelona");
        orasespania.add("Madrid");
        orasespania.add("Valencia");
        orasespania.add("Bilbao");
        HashMap<String, List<String>> tariorase = new HashMap<>();
        tariorase.put("Romania", oraseromania);
        tariorase.put("Spania", orasespania);
        for (String key : tariorase.keySet()) {
            System.out.println("Tara este " + key);
            System.out.println("Orasele sunt " + tariorase.get(key));


        }
    }
}
