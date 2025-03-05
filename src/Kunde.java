public class Kunde
{
    private String name;
    private boolean getraenkeErhalten;
    private int Geld;
    private String wunschGetraenk;



    public Kunde(){

    }

    public Kunde(String pName, String pWunschGetraenk){
        this.name = pName;
    }

    public void setName(String pName){
        name= pName;
    }

    public String getName(){
        return name;
    }
    public Getraenk getGetraenk(){

    }
    public Rechnung getRechnung(){

    }
    public void setGetraenk(Getraenk pGetraenk){

    }
    public void setRechnung(Rechnung pRechnung){

    }
    public void setGetraenkeErhalten(boolean pErhalten){

    }
    public boolean getGetraenkErhalten(){

    }
    public void setGeld(int pGeld){

    }
    public int getGeld(){

    }
    public String getWunschGetraenk(){

    }
}