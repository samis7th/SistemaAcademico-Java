public class Pessoa {
    private String nome;
    private String RG;
    private String CPF;
    protected int idade;
    private String sexo;
    private boolean exaluno;

    public Pessoa(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public void fazerAniversario() {
        idade++;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getRG() { return RG; }
    public void setRG(String RG) { this.RG = RG; }

    public String getCPF() { return CPF; }
    public void setCPF(String CPF) { this.CPF = CPF; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public boolean isExaluno() { return exaluno; }
    public void setExaluno(boolean exaluno) { this.exaluno = exaluno; }
}