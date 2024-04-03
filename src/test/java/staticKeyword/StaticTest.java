package staticKeyword;

import org.testng.annotations.Test;

public class StaticTest {
    @Test
    public void metodaTest(){
        Elev elev = new Elev("Teo", "Theo");
        elev.prezentare();
        System.out.println();
        Elev elev2 = new Elev("Teodor", "Theo");
        elev2.prezentare();
    }
}
