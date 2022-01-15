package ClasaAbstracta;

public abstract class PersoanaAbstract {
    //Clasa Abstracta=poate sau nu sa contina metode abstracte
    //Clasa care extinde o clasa abstracta= implementeaza toate metodele abstracte
    //O clasa abstracta poate sa contina un constructor = tot nu putem declara un obiect
    //Metodele Abstracte folosesc cuvantul "abstract"
    //O clasa abstracta poate implementa o interfata
    //O interfata nu poate extindde o clasa abstracta
    //Metodele ar trebui sa fie publice


    public abstract void proiecteaza();
    public abstract void executie();
    public abstract void scriecod();
    public abstract void ruleazateste();
    public void afiseazavarsta(Integer varsta){
        System.out.println("Are varsta de "+varsta);
    }
}




