import org.junit.Test;

public class Structurirepetitive{


            //cele mai intalnite structuri repetitive: for si while
     @Test
     public void testautomat(){
        //printamnumerefor();
        printamnumerecuwhile();



    }

    //aici printam primele 200 de numere
    public void printamnumerefor (){
        for (Integer index=1;index<=200;index++){
         System.out.println(index);

        }
    }

    public void printamnumerecuwhile(){
        Integer index=1;
        while (index<=200){
            System.out.println(index);
            index++;

        }


    }
}
