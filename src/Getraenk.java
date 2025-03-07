public class Getraenk {

    private String name;
    private int preis;

    public Getraenk(String pName, int pPreis){
        this.name = pName;
        this.preis = pPreis;

    }
    public String getName(){
        return name;

    }
    public double getPreis(){
        return preis;

    }


}