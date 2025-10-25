public class Funcionario extends Pessoa {
    private int chapa;
    private String dtAdm;
    private float salario;

    public Funcionario(String nome, String CPF, int chapa) {
        super(nome, CPF);
        this.chapa = chapa;
    }

    public void alterarSal(float novoSalario) {
        this.salario = novoSalario;
    }

    public int getChapa() { return chapa; }
    public void setChapa(int chapa) { this.chapa = chapa; }

    public String getDtAdm() { return dtAdm; }
    public void setDtAdm(String dtAdm) { this.dtAdm = dtAdm; }

    public float getSalario() { return salario; }
    public void setSalario(float salario) { this.salario = salario; }
}