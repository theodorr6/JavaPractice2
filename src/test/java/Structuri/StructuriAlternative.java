package Structuri;


import org.junit.Test;

public class StructuriAlternative {
    //structuri alternative = if...then...else sau switch...case

    @Test
    public void metodaTest(){
//    numarMaiMareCaX(11);
//    numarMaiMareCaX(10);
//    numarMaiMareCaX(9);
//        numarParPozitiv(0);
//        numarParPozitiv(1);
//        numarParPozitiv(2);
//        numarParPozitiv(-1);
//        numarParPozitiv(-2);
//        propozitie("Ana are mere", "Ana", "mere");
//        propozitie("Ana are mere", "Ana", "pere");
//        propozitie("Ana are mere", "ana", "pere");
        zileSapt(2);
    }

    //verificam daca un numar este mai mare decat 10
    public void numarMaiMareCaX(Integer input){
        if (input > 10){
            System.out.println("Numarul "+input+" este mai mare ca 10");
        } else if (input == 10) {
            System.out.println("Numarul "+input+" este egal cu 10");

        } else {
            System.out.println("Numarul "+input+" nu este mai mare ca 10");
        }
    }

    //verificam daca un numar este par si pozitiv
    public void numarParPozitiv(Integer x){
        if (x%2 == 0){
            if (x>=0){
                System.out.println("Numarul "+x+" este par si pozitiv");
            }
            else{
                System.out.println("Numarul "+x+" este par si negativ");
            }
        }
        else {
            if (x<0){
                System.out.println("Numarul "+x+" este impar si negativ");
            }
            else{
                System.out.println("Numarul "+x+" este impar si pozitiv");
            }
        }
    }

    //verificam ca o propozitie contine 2 cuvinte
    //Ana are mere => caut Ana si mere
    public void propozitie(String propozitie, String cuvant1, String cuvant2){
        if (!(propozitie.contains(cuvant1) && propozitie.contains(cuvant2))){ // ! = negatie
            System.out.println("Adevarat");
        }
        else{
            System.out.println("Fals");
        }
    }

    //reprezentam cazurile pentru zilele saptamanii
    public void zileSapt(Integer zi){
        switch (zi){
            case 1:
                System.out.println("Azi e Luni");
                break;
            case 2:
                System.out.println("Azi e Marti");
                break;
            case 3:
                System.out.println("Azi e Miercuri");
                break;
            default:
                System.out.println("Nu exista optiunea selectata");
        }
    }
}
