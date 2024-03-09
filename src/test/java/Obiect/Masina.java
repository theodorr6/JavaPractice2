package Obiect;

public class Masina {
    // constructor = are ca rol sa initializeze variabilele unei clase
    // recunoastem un constructor dupa numele clasei
    // de cele mai multe ori, constructorul este public
    // exista 2 tipuri de constructori: cu parametri sau fara parametri
    // intr-o clasa Java exista un constructor default fara parametri
    // obiect = instanta unei clase
    // dintr-o clasa putem instantia n obiecte
    // obiectele se diferentiaza prin numele lor sau prin numarul de parametri pe care il primesc
    // in momentul in care un obiect primeste valori (se initializeaza), se apeleaza constructorul din clasa

    private String marca;
    private String model;
    private String culoare;
    private String carburant;
    private Integer an;
    private Integer cc;
    private Integer pret;



    // exista 4 concepte OOP = mostenire, incapsulare, abstractizare, polimorfism
    // MOSTENIREA = conceptul prin care o clasa este mostenita (extinsa) de o alta clasa
    // cand o clasa mosteneste o alta clasa, se formeaza o relatie de parinte-copil
    // in java, o clasa poate mosteni doar o singura clasa
    // cand se aplica mostenirea, copilul poate accesa toate variabilele / metodele din parinte daca sunt public / protected
    // in momentul in care copilul mosteneste parintele, copilul trebuie sa apeleze constructorul din parinte cu SUPER (this)

    // INCAPSULARE = conceptul prin care excludem posibilitatea ca unele informatii sa fie modificate din exteriorul clasei
    // ACCESS CONTROL IN JAVA = public, private, protected, default
    // PUBLIC = ofera vizibilitate in toate pachetele din proiect
    // PRIVATE = Restrange vizibilitatea doar in clasa in care este definit
    // Ca sa oferim vizibilitate proprietatilor in alte clase, apelam la conceptul getter / setter
    public Masina(String marca, String model, String culoare, String carburant, Integer an, Integer cc) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.carburant = carburant;
        this.an = an;
        this.cc = cc;


    }

    public Masina(String marca, String model, String culoare, String carburant, Integer an, Integer cc, Integer pret) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.carburant = carburant;
        this.an = an;
        this.cc = cc;
        this.pret = pret;
    }

    public void prezentareMasina(){
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Culoarea masinii este: " + culoare);
        System.out.println("Anul fabricarii este: " + an);
        System.out.println("Capacitatea cilindrica este: " + cc);


        if(pret != null){
            System.out.println("Pretul initial al masinii este: " + pret);
        }
        else{
            System.out.println("Masina nu are pret!");
        }

    }

    // daca >= 2023 => 5lei
    // 2020 - 2023 = 10lei
    // 2020 = 20lei
    public void definireImpozit(){
        if(an >= 2023){
            System.out.println("Impozitul este: 5RON");
        }
        else if(an > 2020 && an < 2023){
            System.out.println("Impozitul este: 10RON");
        }
        else if(an == 2020){
            System.out.println("Impozitul este: 20RON");
        }
        else{
            System.out.println("Nu mai platesc impozit!");
        }
    }

    // facem getter / setter

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getCarburant() {
        return carburant;
    }

    public Integer getAn() {
        return an;
    }

    public Integer getCc() {
        return cc;
    }

    public Integer getPret() {
        return pret;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }
}
