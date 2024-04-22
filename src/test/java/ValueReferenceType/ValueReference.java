package ValueReferenceType;

import org.testng.annotations.Test;

public class ValueReference {

    public int originalInt = 10;
    public String originalString = "Teo";
    public Fruct mar = new Fruct("mar", "primavara");
    public final int secondInt = 5;

    @Test
    public void testMethod(){
        System.out.println("1. VALUE TYPE");
        valueTypeEx(originalInt);
        System.out.println("Valoarea initiala este: " + originalInt);

        System.out.println("2. REFERNCE TYPE - String Object");
        referenceTypeStringEx(originalString);
        System.out.println("Valoarea initiala este: " + originalString);

        System.out.println("3. REFERENCE TYPE - Object");
        referenceTypeObjectEx(mar);
        mar.descriere();

        System.out.println("4. FINAL");
        // secondInt = secondInt + 10;
    }

    public void valueTypeEx(Integer value){
        value = value + 5;
        System.out.println("Valoarea noua este: " + value);
    }

    public void referenceTypeStringEx(String value){
        value = value + " Virjoghe";
        System.out.println("Valoarea noua este: " + value);
    }

    public void referenceTypeObjectEx(Fruct fruct){
        fruct.sezon = "Toamna";
        fruct.descriere();
    }
}
