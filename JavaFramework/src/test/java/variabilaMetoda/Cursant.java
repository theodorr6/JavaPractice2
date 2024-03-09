package variabilaMetoda;

import org.testng.annotations.Test;

public class Cursant {
    // acesta este un comentariu
    // clasa = sablon specific unui anumit obiect/ produs
    // o clasa trebuie sa contina un nume
    // recunoastem o clasa intr-un fisier java dupa cuvantul "class"
    // intr-un fisier java putem avea mai multe (nu este good practice)


    // variabila = proprietatea/atributul unei clase
    // intr-o clasa putem avea mai multe variabile
    // exista 2 tipuri de variabile: global si local
    // variabila globala = vizibila peste tot in acest fisier
    // variabila locala = vizibila doar in locul unde este definita
    // pentru inceput, toate variabilele globale sunt publice
    // diferenta intre global si local o face access control ("public")
    // tipuri de date: String, Integer, Double (64 bit), Float (32 bit), Char, Boolean
    // nu este obligatoriu ca o variabila sa primeasca o valoare cand o definim

    public String nume;
    public String prenume;
    public Integer varsta;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areRestante;

    // metoda = actiunea unei clase
    // intr-o clasa putem avea mai multe metode diferentiate prin nume
    // metodele sunt de 2 feluri: void si return
    // void = cea mai des folosita care are ca scop sa execute si sa afiseze informatii
    // return = are ca scop sa execute si sa returneze informatia
    // o metoda poate sau nu sa contina parametri
    // parametrii sa diferentiaza prin numar, nume sau tip

    @Test
    public void metodaTest(){
//        nume ="Virjoghe";
//        prenume = "Teodor";
//        varsta = 25;
//        inaltime = 1.80;
//        greutate = 90.0f; // f face conversia din double in float
//        sex = 'M';
//        areRestante = false;

        prezentareCursant("Virjoghe","Teodor",25,1.80,90.0f,'M', false);
    }


    public void prezentareCursant(String param1, String param2,
                                  Integer param3, Double param4,
                                  Float param5, Character param6,
                                  Boolean param7){

        System.out.println("Numele si prenumele tale: " + param1 +" "+ param2);
        System.out.println("Varsta ta este: " + param3);
        System.out.println("Inaltimea ta este: " + param4);
        System.out.println("Greutatea ta este: " + param5);
        System.out.println("Sexul tau este: " + param6);
        System.out.println("Ai restante? " + param7);

    }

}