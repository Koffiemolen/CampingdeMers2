package PackageCampings;

public class Staplaats extends Plek{
        private int grootte;
        private double prijsPerM2;
        private boolean stroom;
        private double prijs;

    public Staplaats(int plekNummer, boolean huisdierenToegestaan, int grootte, double prijsPerM2, boolean stroom) {
        super(plekNummer, huisdierenToegestaan);
        this.grootte = grootte;
        this.prijsPerM2 = prijsPerM2;
        this.stroom = stroom;
    }

    public int getGrootte() {
        return grootte;
    }

    public void setGrootte(int grootte) {
        this.grootte = grootte;
    }

    public double getPrijsPerM2() {
        return prijsPerM2;
    }

    public void setPrijsPerM2(double prijsPerM2) {
        this.prijsPerM2 = prijsPerM2;
    }

    public boolean isStroom() {
        return stroom;
    }

    public void setStroom(boolean stroom) {
        this.stroom = stroom;
    }

    @Override
    public void berekenprijs() {
        this.prijs = this.grootte * this.prijsPerM2;
    }
}
