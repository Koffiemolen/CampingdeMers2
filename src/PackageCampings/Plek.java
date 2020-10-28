package PackageCampings;

import java.time.LocalDate;

public abstract class Plek {
    private int plekNummer;
    private boolean huisdierenToegestaan;
    private LocalDate reserveringBegin;
    private LocalDate reserveringEind;
    private int maxAantalPersonen;
    private double prijs;
    private boolean stroom;

    public Plek(int plekNummer, boolean huisdierenToegestaan) {
        this.plekNummer = plekNummer;
        this.huisdierenToegestaan = huisdierenToegestaan;
    }

    public int getMaxAantalPersonen() {
        return maxAantalPersonen;
    }

    public double getPrijs() {
        return prijs;
    }

    public int getPlekNummer() {
        return plekNummer;
    }

    public void setPlekNummer(int plekNummer) {
        this.plekNummer = plekNummer;
    }


    public void setHuisdierenToegestaan(boolean huisdierenToegestaan) {
        this.huisdierenToegestaan = huisdierenToegestaan;
    }

    public LocalDate getReserveringBegin() {
        return reserveringBegin;
    }

    public void setReserveringBegin(LocalDate reserveringBegin) {
        this.reserveringBegin = reserveringBegin;
    }

    public LocalDate getReserveringEind() {
        return reserveringEind;
    }

    public void setReserveringEind(LocalDate reserveringEind) {
        this.reserveringEind = reserveringEind;
    }

    public boolean setReserving(LocalDate startDatum, LocalDate eindDatum){
        if (this.reserveringBegin == null || startDatum != null && eindDatum != null) {
            this.reserveringBegin = startDatum;
            this.reserveringEind = eindDatum;
            return true;
        }
        return false;
    }

    abstract void berekenprijs();
}
