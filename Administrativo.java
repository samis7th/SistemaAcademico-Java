public class Administrativo extends Funcionario {
    private int horasSemana;
    private String setor;
    private String situacao;

    public Administrativo(String nome, String CPF, int chapa, String setor) {
        super(nome, CPF, chapa);
        this.setor = setor;
    }

    public void admitirFun(int horasSemana, String setor) {
        this.horasSemana = horasSemana;
        this.setor = setor;
        this.situacao = "ATIVO";
    }

    public void demitirFun() {
        this.situacao = "DEMITIDO";
    }

    public void alterarSetor(String novoSetor) {
        if (this.situacao.equals("ATIVO")) {
            this.setor = novoSetor;
        }
    }

    public int getHorasSemana() { return horasSemana; }
    public void setHorasSemana(int horasSemana) { this.horasSemana = horasSemana; }

    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }

    public String getSituacao() { return situacao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }
}