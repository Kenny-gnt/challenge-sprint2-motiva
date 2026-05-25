package model;

public class TrechoRural extends TrechoRodovia {

    public TrechoRural(int km, double nivelVegetacao) {

        super(km, nivelVegetacao);
    }

    @Override
    public void crescerVegetacao() {

        nivelVegetacao += 3;
    }
}