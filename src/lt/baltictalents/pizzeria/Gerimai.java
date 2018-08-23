package lt.baltictalents.pizzeria;

public class Gerimai  {
    public String pavadinimas;
    public double kaina;
    public double alkoholioProcentas;

    public Gerimai(String pavadinimas, double kaina, double alkoholioProcentas) {
        this.pavadinimas = pavadinimas;
        this.kaina = kaina;
        this.alkoholioProcentas = alkoholioProcentas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    public void setAlkoholioProcentas(double alkoholioProcentas) {
        this.alkoholioProcentas = alkoholioProcentas;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public double getKaina() {
        return kaina;
    }

    public double getAlkoholioProcentas() {
        return alkoholioProcentas;
    }
}
