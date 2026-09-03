public class Item{
    private String nome;
    private int bonus;
    public Item(String nome, int bonus){
        this.nome = nome;
        this.bonus = bonus;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        if(nome == null || nome.isEmpty()){
            System.out.println("ERRO, nome vazio\n");
        }else{
            this.nome = nome;
        }
    }
    public int getBonus(){
            return this.bonus;
    }
    public void setBonus(int bonus){
        if(bonus >= 0){
            this.bonus = bonus;
        }else{
            System.out.println("ERRO, bonus negativo\n");
        }
    }
    public String Descricao(){
        return "Item: " + this.nome + ", bonus: " + this.bonus;
    }
}
