package APLICACAOALURA;

public class FiltroRecomendacao {

    public void filtrar(Classificavel classificavel) {
        if (classificavel.getClassificavel() >= 4) {
            System.out.println("Está entre os preferidos no momento");
        } else if (classificavel.getClassificavel() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
        System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
