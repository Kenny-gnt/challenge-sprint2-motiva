package model;

public class TrechoUmido extends TrechoRodovia {

    public TrechoUmido(int km, double nivelVegetacao) {

        super(km, nivelVegetacao);
    }

    @Override
    public void crescerVegetacao() {

        nivelVegetacao += 5;
    }
}