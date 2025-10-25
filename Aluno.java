public class Aluno extends Pessoa {
    private int RA;
    private String curso;
    private String situacao;

    public Aluno(String nome, String CPF, int RA, String curso) {
        super(nome, CPF);
        this.RA = RA;
        this.curso = curso;
        this.situacao = "MATRICULADO";
    }

    public void cancelarCurso() {
        this.situacao = "CANCELADO";
    }

    public void alterarCurso(String novoCurso) {
        if (this.situacao.equals("MATRICULADO")) {
            this.curso = novoCurso;
        }
    }

    public int getRA() { return RA; }
    public void setRA(int RA) { this.RA = RA; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public String getSituacao() { return situacao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }
}