public class Literario extends Livro {
    private String prota;
    public Literario(String nome, int Ano, String prota) {
        super(nome, Ano);
        this.prota = prota;
    }
    public String getProta(){return prota;}
    public void setProta(String prota){
        if (prota == null || prota.isEmpty()){
            System.out.println("ERRO, protagonista vazio\n");
        }else{this.prota = prota;}
    }
    @Override
    public void ficha(){
        System.out.println("Livro Literário");
        super.ficha();
        System.out.println("Protagonista: " + this.prota);
    }
}
