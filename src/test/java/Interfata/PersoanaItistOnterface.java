package Interfata;

public class PersoanaItistInterface extends PersoanaInterface implements ItistT{


    public PersoanaItistInterface(String nume, String prenume) {
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

