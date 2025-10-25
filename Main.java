public class Main {
    public static void main(String[] args) {
      
        Aluno aluno = new Aluno("João", "12345678900", 1001, "Engenharia");
        System.out.println("Aluno: " + aluno.getNome() + ", Curso: " + aluno.getCurso() + ", Situação: " + aluno.getSituacao());

        aluno.alterarCurso("Computação");
        aluno.cancelarCurso();
        System.out.println("Curso alterado: " + aluno.getCurso() + ", Situação: " + aluno.getSituacao());

        
        Professor prof = new Professor("Maria", "98765432100", 2001, 40, "Doutorado");
        prof.admitirProf(40, "Doutorado");
        prof.alterarCH(20);
        System.out.println("Professor: " + prof.getNome() + ", CH: " + prof.getCargaHorar() + ", Situação: " + prof.getSituacao());

        Administrativo adm = new Administrativo("Carlos", "11122233344", 3001, "RH");
        adm.admitirFun(40, "RH");
        adm.alterarSetor("Financeiro");
        adm.demitirFun();
        System.out.println("Administrativo: " + adm.getNome() + ", Setor: " + adm.getSetor() + ", Situação: " + adm.getSituacao());
    }
}