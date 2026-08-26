public class Personagem{
    private String nome;
    private int vida;
    private int nivel;
    Personagem p = new Personagem();
        p.setNome("Miguel");
        p.setVida(100);
        p.setNivel(1);
        
    public String getNome(){
        return this.nome;
    }
    public int getVida(){
        return this.vida;
    }
    public int getNivel(){
        return this.nivel;
    }
    public void setNome(String nome){
        if (nome == null || nome.isEmpty()){
            System.out.println("ERRO, nome vazio");
        }else{
            this.nome = nome;
        }
    }
    public void setVida(int vida){
        if (vida >= 0 && vida <= 100){
        this.vida = vida;
        }else{
            System.out.println("ERRO, vida fora do limite definido");
        }
    }public void setNivel(int nivel){
        if (nivel >= 1){
        this.nivel = nivel;
        }else{
            System.out.println("ERRO, nivel abaixo do minimo");
        }
        
    }
    public static void main(String[] args){
        Personagem p = new Personagem();
        p.setNome("Miguel");
        p.setVida(100);
        p.setNivel(1);

        System.out.println("\nNome: " + p.getNome());
        System.out.println("\nVida:" + p.getVida());
        System.out.println("\nNivel: " + p.getNivel());
        
        p.setNome("");
        p.setVida(101);
        p.setNivel(0);
    }
}
