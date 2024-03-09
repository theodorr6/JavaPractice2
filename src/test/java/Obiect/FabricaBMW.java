package Obiect;

import java.util.List;

public class FabricaBMW extends Masina {
    private List<String> dotariInterioare;
    private List<String> dotariExterioare;

    private Integer pretFinal;
    public FabricaBMW(String marca, String model, String culoare, String carburant, Integer an, Integer cc, Integer pret,
                      List<String> dotariInterioare, List<String> dotariExterioare) {
        super(marca, model, culoare, carburant, an, cc, pret);
        this.dotariInterioare = dotariInterioare;
        this.dotariExterioare = dotariExterioare;
    }
    public void prezentareBMW () {
        prezentareMasina();
        calculDotari();
        System.out.println("Dotarile exterioare sunt: " + dotariExterioare);
        System.out.println("Dotarile interoare sunt: " + dotariInterioare);
        System.out.println("Pretul final al masinii este: " + pretFinal);
    }
    public void calculDotari() {
        pretFinal = getPret();
        for(Integer index = 0; index < dotariExterioare.size(); index++){
            switch  (dotariExterioare.get(index)){
                case "Faruri LED":
                    pretFinal +=70;
                    break;
                case "Oglinzi electrice":
                    pretFinal += 100;
                    break;
                case "Jante Sport":
                    pretFinal += 180;
                    break;
            }
        }
        for(Integer index = 0; index < dotariInterioare.size(); index++){
            pretFinal = getPret();
            switch  (dotariInterioare.get(index)){
                case "Incalzire scaune":
                    pretFinal += 70;
                    break;
                case "Incalzire volan":
                    pretFinal += 100;
                    break;
                case "Scaune piele":
                    pretFinal += 180;
                    break;
            }
        }
    }
}
