package model;

import interfaces.MonitoravelViaIoT;

public class TrechoUrbano extends TrechoRodovia
        implements MonitoravelViaIoT {

    public TrechoUrbano(int km, double nivelVegetacao) {

        super(km, nivelVegetacao);
    }

    @Override
    public void transmitirDadosSensor() {

        System.out.println(
                "Transmitindo dados do sensor no KM " + km
        );
    }

    @Override
    public void crescerVegetacao() {

        nivelVegetacao += 1.5;
    }
}