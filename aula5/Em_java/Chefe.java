public class Chefe extends Personagem{
    public Chefe(String nome){
        super(nome, 200, 99, 20);
    }
    @Override
    public String habilidade(){
        return "Bafo de fogo";
    }
    @Override
    public void ficha(){
        System.out.println("Chefe");
        super.ficha();
    }
}