package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multimi {
    // multimi = array, list, map

    @Test
    public void metodaTest(){
       // colegiCursList();
        //colegiCursArray();
       //diferiteGrupe();
        //tariOrase();
        retete();
    }

    // reprezentam multimea colegilor de la curs

    public void colegiCursArray(){
        String[] colegi = new String[5];
        colegi[0] = "Daniel";
        colegi[1] = "Alexandru";
        colegi[2] = "Doru";
        colegi[3] = "Carina";
        colegi[4] = "Robert";

        for (Integer i = 0; i < colegi.length; i++){
            System.out.println(colegi[i]);
        }
    }

    // exemplul de mai sus cu liste
    public void colegiCursList(){
        List<String> colegi = new ArrayList<>();
        colegi.add("Daniel");
        colegi.add("Alexandru");
        colegi.add("Doru");
        colegi.add("Carina");
        colegi.add("Robert");
        for (Integer i = 0; i < colegi.size(); i++){
            System.out.println(colegi.get(i));
    }
}

// map => key(ar fi fruct)-value(ar fi mar)
    // key este unic; value poate fi duplicate
    public void diferiteGrupe(){
        Map<String, String> obiecte = new HashMap<>();
        obiecte.put("Fruct", "Mar");
        obiecte.put("Haina", "Pantaloni");
        obiecte.put("Electronice", "Telefon");
        for (String key: obiecte.keySet()){
            System.out.println("Cheia este "+key);
            System.out.println("Valoarea este "+obiecte.get(key));
        }
    }
// reprezentam niste tari cu orasele lor
    public void tariOrase(){
        Map<String,Map<String,List<String>>> diverse2 = new HashMap<>();
        Map<String,List<String>> diverse = new HashMap<>();

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Targoviste");
        oraseRomania.add("Cluj");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Madrid");
        oraseSpania.add("Andalucia");

        List<String> oraseAnglia = new ArrayList<>();
        oraseAnglia.add("Londra");
        oraseAnglia.add("Manchester");
        oraseAnglia.add("Liverpool");

        diverse.put("Romania", oraseRomania);
        diverse.put("Spania", oraseSpania);
        diverse.put("Anglia", oraseAnglia);

        for (String key: diverse.keySet()){
                System.out.println("Tara este " + key);
                System.out.println("Orasele sunt " + diverse.get(key));
        }
        // TEMA - sa scriem lista ingrediente pentru mancaruri + for fun: tari, orase si cartiere


    }

    public void retete(){
        Map<String,List<String>> ingredienteMap = new HashMap<>();

        List<String> ingrediente = new ArrayList<>();
        ingrediente.add("Ingredient 1");
        ingrediente.add("Ingredient 2");
        ingrediente.add("Ingredient 3");

        List<String> ingrediente2 = new ArrayList<>();
        ingrediente2.add("Ingredient 4");
        ingrediente2.add("Ingredient 5");
        ingrediente2.add("Ingredient 6");

        List<String> ingrediente3 = new ArrayList<>();
        ingrediente3.add("Ingredient 7");
        ingrediente3.add("Ingredient 8");
        ingrediente3.add("Ingredient 9");

        ingredienteMap.put("Mancarea 1: ", ingrediente);
        ingredienteMap.put("Mancarea 2: ", ingrediente2);
        ingredienteMap.put("Mancarea 3: ", ingrediente3);

        for (String key: ingredienteMap.keySet()){
            System.out.println("Mancarea este: "+key);
            System.out.println("Ingredientele sunt: "+ingredienteMap.get(key));
        }
    }

    public void temaOrase(){
        Map<String,Map<String,List<String>>> listaTari = new HashMap<>();
        Map<String,List<String>> listaOraseRo = new HashMap<>();
        Map<String,List<String>> listaOraseUk = new HashMap<>();

    }
}
