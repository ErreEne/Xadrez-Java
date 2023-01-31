import java.util.Scanner; 

public class Main{

    int linha = 10, coluna = 10,entradax,entraday;
    //private Peão peao;
    private Tabuleiro tabela;
    private Scanner input;

    public Main(Peão peao, Tabuleiro tabela, Scanner input){
        //this.peao = peao;
        this.tabela = tabela;
        this.input = input;
    }

    public void update(int tipo, int movex, int movey){       
        
        tabela.tabela[movex][movey] = tipo;
        tabela.tabela[entradax][entraday] = 0;
        
        for(int i = 0; i<linha; i++){
            for(int l = 0;l<coluna;l++)System.out.print(" "+tabela.tabela[i][l]);
            System.out.println();
        }
 

    }

    public void comecar(int coluna, int linha){
        for(int i = 0; i<linha; i++){
            for(int l = 0;l<coluna;l++)System.out.print(" "+tabela.tabela[i][l]);
            System.out.println();
        }
    }

    public int checkTipo(){

        String verpeca = input.nextLine();
        entradax = verpeca.charAt(0) - 64;
        entraday = verpeca.charAt(1);

        if(tabela.tabela[entradax][entraday] == 1){
            
            return 1;}

        if(tabela.tabela[entradax][entraday] == 2)return 2;

        return 0;

    }


    public static void main(String[] args){

        //Main objeto1 = new Main();
        Scanner ler = new Scanner(System.in);
        Peão peao = new Peão();
        Tabuleiro objeto = new Tabuleiro(8,8);
        Main objetom = new Main(peao, objeto, ler);
        //objetom.comecar(10,10);
        int jogada = 0;

        while(true){
            
            switch(jogada){
                case 0:

                    objetom.comecar(8,8);

                    jogada = 1;

                case 1:

                
                    switch(objetom.checkTipo()){
                        case 1:
                            peao.peaoJogada(peao, ler, objetom);


                        case 2:

            }
                    jogada = 2;


                case 2:
                
                    
                    jogada = 1;
        }
            //int nextMovex=0,nextMovey=0;
            /*if(peao.LegalMovePeao(10, 10, peao.movex, peao.movey))objetom.update();
            peao.peaomovimento(ler, peao);*/
        }

    }
}