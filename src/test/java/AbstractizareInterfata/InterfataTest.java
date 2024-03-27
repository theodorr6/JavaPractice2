package AbstractizareInterfata;

import org.testng.annotations.Test;

public class InterfataTest {

    @Test
    public void testMethod(){

        PersoanaStudent Teo = new PersoanaStudent("Teo", "Virjoghe", 25);
        PersoanaAngajat Teo2 = new PersoanaAngajat("Teo", "Virjoghe", 25);
        StudentAngajat Teo3 = new StudentAngajat("Teo", "Virjoghe", 25);

    }
}
