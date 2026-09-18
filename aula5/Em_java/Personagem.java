public abstract class Personagem{
    public abstract String habilidade();
    protected  String nome;
    protected int vida;
    protected int nivel;
    protected int forca;
    private Item[] inventario;
    private int quantidade_item;
    public Personagem(String nome, int vida, int nivel, int forca){
        this.nome = nome;
        this.nivel = nivel;
        this.setVida(vida);
        this.setForca(forca);
        inventario = new Item[10];
        quantidade_item = 0;
    }
    public String getNome(){return this.nome;}
    public int getVida(){return this.vida;}
    public int getNivel(){return this.nivel;}
    public int getForca(){return this.forca;}

    public void pegar(Item item){
        if(item == null){ 
            System.out.println("ERRO, item nulo\n");
            return;
        }
        if(quantidade_item < inventario.length){
            inventario[quantidade_item] = item;
            quantidade_item++;
        }else System.out.println("Inventario cheio");
    }
    public void setNome(String nome){
        if (nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Nome inválido: " + nome);
        }
        this.nome = nome;
    }
    public void setNivel(int nivel){
        if (nivel < 1){
            System.out.println("Nivel nao pode ser menor que 1");
        }else{
            this.nivel = nivel;
        }
    }
    public void setVida(int vida){
        if (vida > 200)throw new IllegalArgumentException("Vida nao pode ser negativa: " + vida);
        if (vida < 0) this.vida = 0;
        this.vida = vida;
    }
    public void setForca(int forca){
        if (forca < 0)throw new IllegalArgumentException("Forca nao pode ser negativa: " + forca);
        this.forca = forca;
    }
    public void atacar(Personagem alvo) throws SemMana{
        if (alvo != null) {
            int danoTotal = this.forca;
            for (int i = 0; i < quantidade_item; i++){
                danoTotal += this.inventario[i].getBonus();
            }
            alvo.setVida(alvo.getVida() - danoTotal);
            System.out.println(this.nome + " atacou " + alvo.getNome() + " causando " + danoTotal + " de dano total!");
            } else {
                System.out.println("ERRO: Nao ha alvo para atacar.\n");
        }
    }
    public void GolpeEspecial(String habilidade, int custoForca) throws SemForca {
        if (this.forca < custoForca) {
            throw new SemForca(this.forca);
        }
        this.forca -= custoForca; // Consome a força do personagem
        System.out.println(this.nome + " usou o golpe especial '" + habilidade + "' gastando " + custoForca + " de força!");
    }
    public void ficha(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida);
        System.out.println("Nivel: " + this.nivel);
        System.out.println("Forca: " + this.forca);
        System.out.println("Habilidade: " + habilidade());
        System.out.println("Inventario: ");
        if(this.quantidade_item == 0){
            System.out.println("Inventario vazio");
        }else{
            for(int i = 0; i < quantidade_item; i++){
                System.out.println(inventario[i].Descricao());
            }
        }
    }
}