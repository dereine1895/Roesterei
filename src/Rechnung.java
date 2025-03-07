public class Rechnung {

    private int rechnungsnr;
    private int betrag;
    private String datum;

    public Rechnung(String pDatum, int pRechnungsnr, int pBetrag){
         this.datum = pDatum;
         this.betrag = pBetrag;
         this.rechnungsnr = pRechnungsnr;
    }
    public int getRechnungsnr(){
          return rechnungsnr;
    }
    public int getBetrag(){
        return betrag;

    }
    public String getDatum(){
        return datum;

    }

}
