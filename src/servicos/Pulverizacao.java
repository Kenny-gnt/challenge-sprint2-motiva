package servicos;

public class Pulverizacao extends IntervencaoOperacional {

    public Pulverizacao(String equipeResponsavel) {
        super(equipeResponsavel);
    }

    @Override
    public void executarServico() {

        System.out.println(
                "Executando pulverização de vegetação."
        );
    }
}