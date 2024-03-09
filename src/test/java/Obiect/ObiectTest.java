package Obiect;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ObiectTest {
    @Test
    public void metodaTest(){
        List<String> dotariExterioareAudi = Arrays.asList("Faruri LED", "Oglinzi Electrice", "Jante Sport");
        FabricaAudi AudiRs6 = new FabricaAudi("Audi", "RS6", "Alb",
                "benzina", 2020, 3000, 1000, dotariExterioareAudi );
        AudiRs6.setCuloare("Gri");
        AudiRs6.prezentareAudi();
        AudiRs6.definireImpozit();

//        List<String> dotariExterioareBMW = Arrays.asList("Faruri LED", "Oglinzi Electrice", "Jante Sport");
//        List<String> dotariInterioareBMW = Arrays.asList("Incalzire scaune", "Incalzire volan", "Scaune piele");
//        FabricaBMW BMWM8 = new FabricaBMW("BMW", "M8", "Negru",
//                "Benzina", 2021, 3000, 1000, dotariInterioareBMW, dotariExterioareBMW);
//        BMWM8.setCuloare("Gri");
//        BMWM8.prezentareBMW();
//        BMWM8.definireImpozit();
//
//        Masina Nissan = new Masina("Nissan", "GTR", "Alb", "Benzina", 2018, 3600, 50000);
//        Nissan.prezentareMasina();
//        Nissan.definireImpozit();
    }
}
