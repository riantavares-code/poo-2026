import java.util.ArrayList;
public class Personagem{
    protected  String nome;
    protected int vida;
    private int nivel;
    private ArrayList<Item> inventario;
    public Personagem(String nome, int vida, int nivel){
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
        this.inventario = new ArrayList<Item>();
    }
    public String getNome(){
        return this.nome;
    }
    public int getVida(){
        return this.vida;
    }
    public int getNivel(){
        return this.nivel;
    }
    public void pegar(Item item){
        if(item != null){
            this.inventario.add(item);
        }else{
            System.out.println("ERRO, item nulo\n");
        }
    }
    public void setNome(String nome){
        if (nome == null || nome.isEmpty()){
            System.out.println("ERRO, nome vazio\n");
        }else{
            this.nome = nome;
        }
    }
    public void setVida(int vida){
        if (vida >= 0 && vida <= 100){
        this.vida = vida;
        }else{
            System.out.println("ERRO, vida fora do limite definido\n");
        }
    }public void setNivel(int nivel){
        if (nivel >= 1){
        this.nivel = nivel;
        }else{
            System.out.println("ERRO, nivel abaixo do minimo\n");
        }
    }
    public void ficha(){
        System.out.println("\nPersonagem");
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida);
        System.out.println("Nivel: " + this.nivel);
        System.out.println("Inventario: ");
        if(inventario.isEmpty()){
            System.out.println("Inventario vazio");
        }else{
            for(Item item : inventario){
                System.out.println(item.Descricao());
            }
        }
    }
}