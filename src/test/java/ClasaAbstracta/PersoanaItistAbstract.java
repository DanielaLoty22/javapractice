package ClasaAbstracta;

public class PersoanaItistAbstract extends PersoanaAbstract{
    public String nume;
    public String prenume;

    public PersoanaItistAbstract(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public void proiecteaza() {

    }

    @Override
    public void executie() {

    }

    @Override
    public void scriecod() {
        System.out.println("Itistul scrie cod");

    }

    @Override
    public void ruleazateste() {

    }
}
