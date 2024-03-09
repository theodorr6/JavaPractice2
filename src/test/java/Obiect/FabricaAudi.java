package Obiect;

import java.util.List;

public class FabricaAudi extends Masina {

    private List<String> dotariExterioare;
    private Integer pretFinal;
    public FabricaAudi(String marca, String model, String culoare, String carburant, Integer an, Integer cc, Integer pret,
                       List<String> dotariExterioare) {
        super(marca, model, culoare, carburant, an, cc, pret);
        this.dotariExterioare = dotariExterioare;


    }

    public void prezentareAudi (){
        prezentareMasina();
        calculDotari();
        System.out.println("Pretul final al masinii este: " + pretFinal);
        System.out.println("Dotarile exerioare sunt: " + dotariExterioare);
    }

    public void calculDotari() {
        pretFinal = getPret();
        for(Integer index = 0; index < dotariExterioare.size(); index++){
            switch  (dotariExterioare.get(index)){
                case "Faruri LED":
                    pretFinal += 100;
                    break;
                case "Oglinzi electrice":
                    pretFinal += 120;
                    break;
                case "Jante Sport":
                    pretFinal += 200;
                    break;
                default:
            }
        }
    }
}
