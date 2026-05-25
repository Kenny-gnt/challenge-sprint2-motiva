package servicos;

public class RocadaMecanizada extends IntervencaoOperacional {

    public RocadaMecanizada(String equipeResponsavel) {
        super(equipeResponsavel);
    }

    @Override
    public void executarServico() {

        System.out.println(
                "Executando roçada mecanizada na rodovia."
        );
    }
}