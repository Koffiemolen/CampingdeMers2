package PackageCampings;

import java.util.ArrayList;

public class Camping {
    private String name;
    private String locatie;
    private ArrayList<Plek> plekken;

    public Camping(String name, String locatie) {
        this.name = name;
        this.locatie = locatie;
        this.plekken = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public ArrayList<Plek> getPlekken() {
        return plekken;
    }

    public void voegPlekToe(Plek plek) {
        this.plekken.add(plek);
    }

    public Plek geefPlekWeer (int i){
        return this.plekken.get(i);
    }
}
