package PackageCampings;

public class Huis extends Plek{
        private int maxAantalPersonen;
        private double prijs;

    public Huis(int plekNummer, boolean huisdierenToegestaan, int maxAantalPersonen, double prijs) {
        super(plekNummer, huisdierenToegestaan);
        this.maxAantalPersonen = maxAantalPersonen;
        this.prijs = prijs;
    }
}
