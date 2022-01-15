package Interfata;

public class PersoanaInginerItista extends PersoanaInterface implements Inginer,ItistT{


    public PersoanaInginerItista(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void proiecteaza() {
        System.out.println("Inginerul Itist proiecteaza");

    }

    @Override
    public void executie() {
        System.out.println("Inginerul Itist executa");

    }

    @Override
    public void scriecod() {
        System.out.println("Inginerul Itist scrie cod");

    }

    @Override
    public void ruleazateste() {
        System.out.println("Inginerul Itist testeaza cod");

    }
}
