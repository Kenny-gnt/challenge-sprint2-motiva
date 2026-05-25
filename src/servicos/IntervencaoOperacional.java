package servicos;

public abstract class IntervencaoOperacional {

    protected String equipeResponsavel;

    public IntervencaoOperacional(String equipeResponsavel) {
        this.equipeResponsavel = equipeResponsavel;
    }

    public String getEquipeResponsavel() {
        return equipeResponsavel;
    }

    public abstract void executarServico();
}