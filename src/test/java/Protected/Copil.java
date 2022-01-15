package Protected;

public class Copil {
    //Public vizibil peste tot in proiect
    //Private vizibil doar in clasa in care l-ai declarat
    //Protected vizibil in clasa parinte plus clasa copil, indiferent daca se afla sau nu in acelasi pachet
    //Default vizibil in clasa parinte+clasa copil cu conditia sa fie in acelasi pachet
    //Protected = daca declaram un obiect este vizibil in orice clasa din pachet
    //Default = daca declaram un obiect este vizibil in orice clasa din pachet



    public void metodaPublica(){
        System.out.println("Public");
    }
    private void metodaPrivate(){
        System.out.println("Private");
    }
    public void metodaProtected(){
        System.out.println("Protected");
    }
    void metodaDefault(){
        System.out.println("Default");
    }
}
