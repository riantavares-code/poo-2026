
public class Aluno {
    private String nome;
    private int idade;
    private String matricula;
    public Aluno() {
        this("sem", 1, "sem");
    }
    public Aluno(String nome, int idade, String matricula) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setMatricula(matricula);
    }
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getMatricula() { return matricula; }
    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("ERRO, nome do Aluno vazio\n");
        } else {
            this.nome = nome;
        }
    }
    public void setIdade(int idade) {
        if (idade <= 0) {
            System.out.println("ERRO, idade do Aluno inválida\n");
        } else {
            this.idade = idade;
        }
    }
    public void setMatricula(String matricula) {
        if (matricula == null || matricula.isEmpty()) {
            System.out.println("ERRO, matrícula vazia\n");
        } else {
            this.matricula = matricula;
        }
    }
    public static void main(String[] args) {
        Aluno resValido = new Aluno("Juan", 20, "2023001");
        Professor p1 = new Professor("Zica", 25, "12345", resValido);
        System.out.println("Professor 1: " + p1.getNome() + " | Atendido por: " + p1.getAlunoResponsavel().getNome());
        Professor p2 = new Professor();
        System.out.println("Professor 2 (Padrão): " + p2.getNome() + " | Atendido por: " + p2.getAlunoResponsavel().getNome());
        p1.setNome("");
        p1.setIdade(0);
        p1.setAlunoResponsavel(null);
        Aluno resInvalido = new Aluno("", -5, "");
    }
}
class Professor {
    private String nome;
    private int idade;
    private String cod_Iden;
    public Professor() {
        this("sem", 1, "sem", new Aluno());
    }
    public Professor(String nome, int idade, String cod_Iden) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setCod_Iden(cod_Iden);
    }
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getCod_Iden() { return cod_Iden; }
    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("ERRO, nome do professor vazio\n");
        } else {
            this.nome = nome;
        }
    }
    public void setIdade(int idade) {
        if (idade <= 0) {
            System.out.println("ERRO, idade do Professor inválida\n");
        } else {
            this.idade = idade;
        }
    }
    public void setCod_Iden(String cod_Iden) {
        if (cod_Iden == null || cod_Iden.isEmpty()) {
            System.out.println("ERRO, código de identificação vazio\n");
        } else {
            this.cod_Iden = cod_Iden;
        }
    }
}
