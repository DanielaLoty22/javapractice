package Polimorfism;



public class Animal {
    //Polimorfism = conceptul prin care o metoda poate avea implementari diferite
    //Doua feluri = Dinamic(overrride) si static(overload)
    //Polimorfism Dinamic= intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    //Polimorfism Static= conceptul pe baza careia o metoda are o structura diferita

    public String rasa;
    public String talie;
    public String culoareblana;

    public Animal(String rasa, String talie, String culoareblana) {
        this.rasa = rasa;
        this.talie = talie;
        this.culoareblana = culoareblana;
    }
    //Polimorfism Dinamic
    public void scoateSunet(){
        System.out.println( "Animalul scoate sunet");




    }
    public Integer getPret(){
        return 3;
    }
}
