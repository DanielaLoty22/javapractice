package Obiectconstructor;

import org.junit.Test;

import java.util.List;

public class Cursant {

    //Obiect= instanta unei clase
    //Recunoastem un obiect dupa cuvantul cheie new
    //Putem face un infinit de obiecte
    //Structura unui obiect NumeClasa NumeObiect = new NumeClasa(se va apela constructorul clasei) (dam valori pentru variabile)
    //Exemplu obiect= Cursant MateiFlorin=new Cursant()
    //Constructor= Are rol sa initializeze variabilele unei clase
    //Intr-o clasa putem avea un infinit de constructori
    //Exista 2 tipuri de constructori= cu parametri sau fara parametri
    //Diferentirea intre constructori se face prin tipul parametrilor sau numarul parametrilor
    // Daca nu fac eu un constructor = exista unul by default fara parametri
    //Structura constructor=public numeclasa()


    public String nume;
    public String prenume;
    public Integer varsta;
    public Double taxa;
    public Character gen;
    public Boolean diplomabacaulareat;
    public List<String> cursuriinterese;
    public String cursinteres;
    // GENERATE-CONSTRUCTOR-SELECT ALL

    public Cursant(String nume, String prenume, Integer varsta, Double taxa, Character gen, Boolean diplomabacaulareat, List<String> cursuriinterese) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.taxa = taxa;
        this.gen = gen;
        this.diplomabacaulareat = diplomabacaulareat;
        this.cursuriinterese = cursuriinterese;
    }

    public Cursant(String nume, String prenume, Integer varsta, Character gen, Boolean diplomabacaulareat, List<String> cursuriinterese) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.gen = gen;
        this.diplomabacaulareat = diplomabacaulareat;
        this.cursuriinterese = cursuriinterese;
    }

    public Cursant(String nume, String prenume, Integer varsta, Double taxa, Character gen, Boolean diplomabacaulareat, String cursinteres) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.taxa = taxa;
        this.gen = gen;
        this.diplomabacaulareat = diplomabacaulareat;
        this.cursinteres = cursinteres;
    }

    public void dateCursant() {
        System.out.println("Datele despre cusrant sunt urmatoarele: ");
        System.out.println(nume);
        System.out.println(prenume);
        System.out.println(varsta);
        if (taxa !=null){
            System.out.println(taxa);
        }


        System.out.println(gen);
        System.out.println(diplomabacaulareat);
        System.out.println("Cursurile de interes sunt urmatoarele");
        if(cursuriinterese!=null) {
            for (Integer index = 0; index < cursuriinterese.size(); index++) {
                System.out.println(cursuriinterese.get(index));
            }
        }
        else {
            System.out.println(cursinteres);
        }
    }

    public void verificadiploma(){
        if(diplomabacaulareat){
            System.out.println("Cursantul"+ nume+" "+prenume+" "+"are diploma de bac");
        }
        else{
            System.out.println("Cursantul"+ nume+" "+prenume+" "+" nu are diploma de bac");

        }
    }
}
