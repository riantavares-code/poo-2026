
public class Livro{
    protected String nome;
    protected int ano;
    public Livro(String nome, int ano){
        this.nome = nome;
        this.ano = ano;
    }
    public String getNome(){return this.nome;}
    public int getAno(){return this.ano;}
    public void setNome(String nome){
        if (nome == null || nome.isEmpty()){
            System.out.println("ERRO, nome vazio\n");
        }else{this.nome = nome;}
    }
    public void setAno(int ano){
        if (ano >= 0){
            this.ano = ano;
        }else{System.out.println("ERRO, ano negativo\n");}
    }
    public void ficha(){
        System.out.println("\nLivro");
        System.out.println("Nome: " + this.nome);
        System.out.println("Ano: " + this.ano);
    }
    
}
