public class Bankrekening {
    private double bedrag;

    public Bankrekening(){
        this.bedrag = 0;
    }

    public Bankrekening(double bedrag) {
        if(bedrag < 0){
            this.bedrag = 0;
        }else this.bedrag = bedrag;

    }

    public void storten(double bedrag) {
        if (bedrag <= 0) {
            System.out.println("Jij kan niet negatief saldo storten");
        } else this.bedrag += bedrag;
    }
    public void afhalen (double bedrag) {
        if (bedrag > 1000) {
            System.out.println("Sorry, jij kan niet meer de 1000€ afhalen.");
        }else this.bedrag -= bedrag;
    }

    public double getBedrag() {
        return bedrag;
    }

    public void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }

    @Override
    public String toString() {
        return "Jouw bedrag is " + this.bedrag;
    }
}