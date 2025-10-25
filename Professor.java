public class Professor extends Funcionario {
    private int cargaHorar;
    private String titulacao;
    private String situacao;

    public Professor(String nome, String CPF, int chapa, int cargaHorar, String titulacao) {
        super(nome, CPF, chapa);
        this.cargaHorar = cargaHorar;
        this.titulacao = titulacao;
    }

    public void admitirProf(int cargaHorar, String titulacao) {
        this.cargaHorar = cargaHorar;
        this.titulacao = titulacao;
        this.situacao = "ATIVO";
    }

    public void demitirProf() {
        this.situacao = "DEMITIDO";
    }

    public void alterarCH(int novaCH) {
        if (this.situacao.equals("ATIVO")) {
            this.cargaHorar = novaCH;
        }
    }

    public int getCargaHorar() { return cargaHorar; }
    public void setCargaHorar(int cargaHorar) { this.cargaHorar = cargaHorar; }

    public String getTitulacao() { return titulacao; }
    public void setTitulacao(String titulacao) { this.titulacao = titulacao; }

    public String getSituacao() { return situacao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }
}