package Polimorfism;


public class Caine extends Animal {

    public Caine(String rasa, String talie, String culoareblana) {
        super(rasa, talie, culoareblana);
    }

    //Polimorfism Dinamic
    //Metoda return = putem aplica polimorfism dianmic
    //Metoda return=putem aplica polimorfismul static doar la nivel de nr de parametri

    @Override
    public void scoateSunet() {
        System.out.println("Cainele latra");
    }
    public void apeleazametodaparinte(){
        super.scoateSunet();
    }



    //Polimorfism Static
    public void cumparaProduse(){
        System.out.println("Nu am cumparat nici un produs");
    }
    public void cumparaProduse(String Produs1){
        System.out.println("Am cumparat un produs:"+ Produs1);
    }
    public void cumparaProduse(Integer Produs2){
        System.out.println("Am cumparat un produs:"+ Produs2);
    }
    // Polimorfism se poate aplica se poate aplica in metoda return doar
    public Integer getCaine(){
        return 1;
    }
    public Integer  getCaine(String numar){
        return 1;
    }
    @Override
    public Integer getPret(){
        return 10;
    }
}
