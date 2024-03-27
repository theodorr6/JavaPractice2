package AbstractizareInterfata;

public class PersoanaAngajat extends Persoana implements Angajat{
    public PersoanaAngajat(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }


    @Override
    public void munceste() {
        System.out.println("Merge la munca");
    }

    @Override
    public void prezentaBirou() {
        System.out.println("Merge la birou");
    }

    @Override
    public void pauzaMasa() {
        System.out.println("Pauza de masa");
    }

    @Override
    public void incasareSalariu() {
        System.out.println("Incaseaza salariu");
    }
}
