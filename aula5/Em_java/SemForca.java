public class SemForca extends Exception{
    private int forcaAtual;
    public SemForca(int forca){
        super("Forca insuficiente: " + forca);
        this.forcaAtual = forca;
    }
    public int getForca(){
        return this.forcaAtual;
    }
}