package Interfata;

public class PersoanaItistOnterface extends PersoanaInterface implements ItistT{


    public PersoanaItistOnterface(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void scriecod() {
        System.out.println("Itistul scrie cod");

    }

    @Override
    public void ruleazateste( ){
        System.out.println("Itistul ruleaza cod");

    }

    }

