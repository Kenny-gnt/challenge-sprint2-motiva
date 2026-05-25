package model;

public class TrechoRodovia {

    protected int km;
    protected double nivelVegetacao;

    public TrechoRodovia(int km, double nivelVegetacao) {

        this.km = km;
        this.nivelVegetacao = nivelVegetacao;
    }

    public int getKm() {
        return km;
    }

    public double getNivelVegetacao() {
        return nivelVegetacao;
    }

    public void crescerVegetacao() {

        nivelVegetacao += 2;
    }
}