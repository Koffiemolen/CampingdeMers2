package PackageCampings;

public class Wensenformulier {
    private int duur;
    private int reisgezeldschap;
    private boolean huisdier;
    private String typePlek;
    private boolean stroom;
    private double maxKosten;

    public Wensenformulier(int duur, int reisgezeldschap, boolean huisdier, String typePlek, boolean stroom, double maxKosten) {
        this.duur = duur;
        this.reisgezeldschap = reisgezeldschap;
        this.huisdier = huisdier;
        this.typePlek = typePlek;
        this.stroom = stroom;
        this.maxKosten = maxKosten;
    }


}
