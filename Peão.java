import java.util.Scanner;

//import java.util.Scanner; 

public class Peão{

    int tipo = 2;
    int movey,movex,moveanteriorx,moveanteriory;
    //private Peão peao;
    /*public Peão(int posx, int posy){
        movex = posx;
        movey = posy;
    }*/

    /*public void peaomovimento(Scanner ler, Peão peao){




        /*int movimento = ler.nextInt();
        switch (movimento) {
            case 1:

            peao.movex = peao.movex-1;
            peao.movey = peao.movey;
                
                break;
            case 2:
            peao.movex = peao.movex;
            peao.movey =peao.movey-1;                
                break;
            case 3:
            peao.movex = peao.movex;
            peao.movey =peao.movey +  1;                
                break;
            case 4:
            peao.movex =peao.movex + 1;
            peao.movey= peao.movey;
                break;
        }


    }*/

    public boolean LegalMovePeao(int linha, int coluna, int nextMovex, int nextMovey){
        if(nextMovex < 0 || nextMovex == linha || nextMovey < 0 || nextMovey == coluna)return false;
        return true;
    }

    public void peaoJogada(Peão peao, Scanner ler, Main objetom){

        String movimento = ler.nextLine();
        peao.movex= movimento.charAt(0) - 64;
        peao.movey = movimento.charAt(1);

        while(!peao.LegalMovePeao(8, 8, peao.movex, peao.movey)){
        peao.movex = movimento.charAt(0) - 64;
        peao.movey = movimento.charAt(1);
    }
        objetom.update(peao.tipo,peao.movex,peao.movey);
        //peao.peaomovimento(ler, peao);


    }
}