package util;

import model.TrechoRodovia;

public class RelatorioPrioridade {

    public static void gerarRelatorio(
            TrechoRodovia[] trechos
    ) {

        System.out.println(
                "RELATÓRIO DE PRIORIDADE "
        );

        for (TrechoRodovia trecho : trechos) {

            System.out.println(
                    "\nKM: " + trecho.getKm()
            );

            System.out.println(
                    "Vegetação: "
                    + trecho.getNivelVegetacao()
            );

            if (trecho.getNivelVegetacao() >= 8) {

                System.out.println(
                        "Prioridade: ALTA"
                );

                System.out.println(
                        "Intervenção: Roçada mecanizada"
                );

            } else if (
                    trecho.getNivelVegetacao() >= 5
            ) {

                System.out.println(
                        "Prioridade: MÉDIA"
                );

                System.out.println(
                        "Intervenção: Pulverização"
                );

            } else {

                System.out.println(
                        "Prioridade: BAIXA"
                );

                System.out.println(
                        "Sem necessidade imediata"
                );
            }

            System.out.println(
                    "-----------------------------"
            );
        }
    }
}