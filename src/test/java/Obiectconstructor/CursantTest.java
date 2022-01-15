package Obiectconstructor;

import org.junit.Test;

import java.sql.Array;
import java.util.Arrays;

public class CursantTest {
    @Test
    public void testautomat(){
        System.out.println(" ---obiectul---");
        Cursant MateiFlorin=new Cursant("Matei","Florin", 28,2.550,'M',true, Arrays.asList("Automation","Manual","Database"));
        MateiFlorin.dateCursant();

        System.out.println("---obiectul1modificat---");
        MateiFlorin.prenume="Florin - Dorel";
        MateiFlorin.dateCursant();


        System.out.println(" ---obiectul2---");
        Cursant ManolacheMariCarmen =new Cursant("Manolache","Carmen", 23,2.550,'F',true, Arrays.asList("Automation","Manual","Database"));
        ManolacheMariCarmen.dateCursant();
        ManolacheMariCarmen.verificadiploma();

        System.out.println(" ---obiectul3---");
        Cursant DorhaAlex=new Cursant( "Dorha","Alex ", 23,'M',true, Arrays.asList("Prohod","Nunta"));
        DorhaAlex.dateCursant();

        System.out.println("Dorna Andrei");
        Cursant DornaAndrei=new Cursant("Dorna","Andrei", 27, 2.550, 'M',true,"Automation");
        DornaAndrei.dateCursant();


    }
}
