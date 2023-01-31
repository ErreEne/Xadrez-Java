public class Tabuleiro{

    int[][] tabela;

    public Tabuleiro(int linha, int coluna){

        tabela = new int[linha][coluna];
        for(int i = 0; i<linha; i++){
            for(int l = 0;l<coluna;l++)tabela[i][l] = 0;
        }
    }


}