package Polimorfism;

import org.junit.Test;

public class PolimorfismTest {
    @Test
    public void testAutomat(){
        Caine Akita=new Caine("Akita Inu Japonez","Mare", "Roscat cu alb");
        Akita.scoateSunet();
        Akita.apeleazametodaparinte();
        Akita.cumparaProduse();
        Akita.cumparaProduse("Lesa");
        Akita.cumparaProduse(2);
        System.out.println(Akita.culoareblana);


    }
}
