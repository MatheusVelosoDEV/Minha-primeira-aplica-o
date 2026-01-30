package APLICACAOALURA;

public class filme extends Titulo implements Classificavel {
    private String director;

    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director = director;
    }
    @Override
    public int getClassificavel() {
        return(int) pegaMedia() / 2;
    }
}