package Interfata;

import org.junit.Test;

public class InterfataTest {
    @Test
    public void testAutomat(){
        PersoanaInginerInterface Daniela=new PersoanaInginerInterface("Daniela","Lotys");
        Daniela.executie();
        Daniela.proiecteaza();

        PersoanaItistOnterface Alex=new PersoanaItistOnterface("Dorha","Alex");
        Alex.scriecod();
        Alex.ruleazateste();

        PersoanaInginerItista Florin=new PersoanaInginerItista("Florin","Matei");
        Florin.executie();
        Florin.proiecteaza();
        Florin.scriecod();
        Florin.ruleazateste();

        //OP-4 concepte - Inheritance,Encapsulation,Polymorphism and Data Abstract


    }
}
