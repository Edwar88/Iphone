package iPhone;

import iPhone.AparelhoTelefonico.AparelhoTelefonico;
import iPhone.NavegadorInternet.NavegadorInternet;
import iPhone.ReprodutorMusical.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) {
        
        AparelhoTelefonico telefone = new AparelhoTelefonico();

        telefone.contatos();
        telefone.discar(0);
        telefone.desligarChamada();
        telefone.receberChamada();


        NavegadorInternet internet = new NavegadorInternet();
        
        internet.internet();


        ReprodutorMusical musica = new ReprodutorMusical();

        musica.play();
        musica.pausa();
        musica.desligarMusica();











    }
}
