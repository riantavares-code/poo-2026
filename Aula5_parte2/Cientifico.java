public class Cientifico extends Livro{
    private String area;
    private String editora;
    public Cientifico(String nome, int Ano, String area, String editora){
        super(nome, Ano);
        this.area = area;
        this.editora = editora;
        }
    public String getArea(){return area;}
    public String getEditora(){return editora;}
    public void setArea(String area){
        if(area != null && !area.isEmpty()){
            this.area = area;
        }else{System.out.println("Area nao pode estar em branco.");}
    }
    public void setEditora(String editora){
        if(editora != null && !editora.isEmpty()){
            this.editora = editora;
        }else{System.out.println("Editora nao pode estar em branco.");}
    }
    @Override
    public void ficha(){
        System.out.println("Livro cientifico");
        super.ficha();
        System.out.println("Area: " + area);
        System.out.println("Editora: " + editora);
    }
}
