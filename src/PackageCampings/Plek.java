package PackageCampings;

import java.time.LocalDate;

public class Plek {
    private int plekNummer;
    private boolean huisdierenToegestaan;
    private LocalDate reserveringBegin;
    private LocalDate reserveringEind;
    private double prijs;
    private boolean stroom;

    public Plek(int plekNummer, boolean huisdierenToegestaan) {
        this.plekNummer = plekNummer;
        this.huisdierenToegestaan = huisdierenToegestaan;
    }

    public int getPlekNummer() {
        return plekNummer;
    }

    public void setPlekNummer(int plekNummer) {
        this.plekNummer = plekNummer;
    }

    public boolean isHuisdierenToegestaan() {
        return huisdierenToegestaan;
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

    public void setReserving(){

    }
}
