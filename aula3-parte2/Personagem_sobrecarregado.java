class Personagem_correcao{
    private String nome;
    private int vida;
    private int nivel;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if(nome == null || nome.isEmpty()){
            System.out.println("O nome não pode estar vazio.");
        } else {
            this.nome = nome;
        }
    }

    public int getVida(){
        return vida;  
    }
    public void setVida(int vida){
        if(vida >= 0 && vida <= 100){
            this.vida = vida;
        } else {
            System.out.println("Valor da vida inválido, deve estar entre 0 e 100.");
        }
    }

    public int getNivel(){
        return nivel;
    }
    public void setNivel(int nivel){
        if(nivel >= 1){
            this.nivel = nivel;
         }else{
            System.out.println("O nivel tem que ser maior ou igual a 1.");
         }
    }
    public static void main(String[] args) {
        Persona_correcao p = new Persona_correcao();

        
                System.out.println("\nNome: " + p.getNome());
                System.out.println("\nVida:" + p.getVida());
                System.out.println("\nNivel: " + p.getNivel());
        p.setVida(-50);  // Valor inválido rejeitado diretamente
        p.setNome("");   // Nome vazio nao aceito
    }
}
