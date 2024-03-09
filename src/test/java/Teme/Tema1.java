package Teme;

import org.testng.annotations.Test;

public class Tema1 {
    // am tema sa afisez 4 masini diferite

    public String marca;
    public String model;
    public String combustibil;
    public Integer cilindree;
    public Integer putere;
    public Double consum;
    public Boolean sport;



    @Test
    public void masina(){
        prezentareMasina("Toyota","Supra","Benzina",3000, 330, 14.6, true);
        prezentareMasina("Mitsubishi","Lancer Evo","Benzina",2000, 359, 14.2, true);
        prezentareMasina("Volvo","XC90","Motorina",2000, 310, 9.8, false);
        prezentareMasina("Honda","Civic Type R","Benzina",2000, 329, 8.2, true);
    }

    public void prezentareMasina(String param1, String param2, String param3, Integer param4, Integer param5, Double param6, Boolean param7){

        System.out.println("Marca masinii este: " + param1);
        System.out.println("Modelul masinii este: " + param2);
        System.out.println("Masina merge pe: " + param3);
        System.out.println("Capacitatea cilindrica este: " + param4);
        System.out.println("Masina are: " + param5 + " cai putere");
        System.out.println("Masina are un consum mixt de: " + param6);
        System.out.println("Este o masina sport?: " + param7+"\n");
    }
}

