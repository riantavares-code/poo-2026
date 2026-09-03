import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args){
        List<Livro> biblioteca = new ArrayList<>();

        biblioteca.add(new Literario("Mentirosos", 2014, "Cadence Sinclair"));
        biblioteca.add(new Cientifico("Calculo I, ed 9", 2021, "Matemática", "Cengage Learning"));

        for (Livro livro : biblioteca) {
            livro.ficha(); 
        }
    }
}
