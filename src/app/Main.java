package app;

import model.TrechoRodovia;
import model.TrechoRural;
import model.TrechoUmido;
import model.TrechoUrbano;

import servicos.RocadaMecanizada;
import servicos.Pulverizacao;

import util.RelatorioPrioridade;

public class Main {

    public static void main(String[] args) {

        TrechoRodovia trecho1 =
                new TrechoRodovia(12, 3);

        TrechoRodovia trecho2 =
                new TrechoRural(35, 5);

        TrechoRodovia trecho3 =
                new TrechoUmido(48, 7);

        TrechoUrbano trecho4 =
                new TrechoUrbano(72, 4);

        trecho1.crescerVegetacao();
        trecho2.crescerVegetacao();
        trecho3.crescerVegetacao();
        trecho4.crescerVegetacao();

        trecho4.transmitirDadosSensor();

        RocadaMecanizada rocada =
                new RocadaMecanizada(
                        "Equipe Alpha"
                );

        Pulverizacao pulverizacao =
                new Pulverizacao(
                        "Equipe Beta"
                );

        rocada.executarServico();
        pulverizacao.executarServico();

        TrechoRodovia[] trechos = {
                trecho1,
                trecho2,
                trecho3,
                trecho4
        };

        RelatorioPrioridade
                .gerarRelatorio(trechos);
    }
}