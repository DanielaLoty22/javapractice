package ClasaAbstracta;

import org.junit.Test;

public class AbstractTest {
    @Test
    public void testAutomat(){
        PersoanaInginerAbstract Florin=new PersoanaInginerAbstract("Florin", "Matei");
        Florin.proiecteaza();
        Florin.executie();
        Florin.afiseazavarsta(28);

        PersoanaItistAbstract Alex=new PersoanaItistAbstract("Dorha","Alex");
        Alex.scriecod();
        Alex.ruleazateste();
        Alex.afiseazavarsta(27);

        PersoanaInginerItist Superman=new PersoanaInginerItist("Super","Man");
        Superman.proiecteaza();
        Superman.executie();
        Superman.scriecod();
        Superman.ruleazateste();
        Superman.afiseazavarsta(1000);

    }
}
