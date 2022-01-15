package ClasaAbstracta;

public class PersoanaInginerItist extends PersoanaAbstract{
      public String nume;
      public String prenume;

    public PersoanaInginerItist(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public void proiecteaza() {
        System.out.println("InginerulItist proiecteaza");

    }

    @Override
    public void executie() {
        System.out.println("InginerulItist executa");

    }

    @Override
    public void scriecod() {
        System.out.println("InginerulItist scrie cod");

    }

    @Override
    public void ruleazateste() {

    }
}
