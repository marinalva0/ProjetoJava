import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<Candidato> candidato = new ArrayList<>();
        candidato.add(new Candidato("Luiz Fernando"));
        candidato.add(new Candidato("Maria Alice"));
        candidato.add(new Candidato("João Henrique"));
        Urna u = new Urna(candidato);

        u.realizarVotacao(candidato.get(0));
        u.realizarVotacao(candidato.get(0));
        u.realizarVotacao(candidato.get(1));
        u.realizarVotacao(candidato.get(2));
        u.realizarVotacao(candidato.get(2));
        u.realizarVotacao(candidato.get(2));
        u.realizarVotacao(candidato.get(1));

        Candidato vencedor = u.calcularResultado();
        System.out.println("Candidado vencedor: " + vencedor.getNome());
        //estatistica de vitoria e derrotas
        Eleito eleitoLuizFernando = new Eleito(candidato.get(0));
        Eleito eleitomariaAlice = new Eleito(candidato.get(1));
        Eleito eleitoJoaoHenrique = new Eleito(candidato.get(2));


            if (vencedor == candidato.get(0)) ;
            eleitoLuizFernando.adicionarVitoria ();
            eleitomariaAlice.adicionarDerrota ();
            eleitoJoaoHenrique.adicionarDerrota ();

          if (vencedor == candidato.get(1)) ;
          eleitomariaAlice.adicionarVitoria ();
          eleitoLuizFernando.adicionarDerrota ();
          eleitoJoaoHenrique.adicionarDerrota ();


          if (vencedor == candidato.get(2)) ;
          eleitoJoaoHenrique.adicionarVitoria ();
          eleitomariaAlice.adicionarDerrota ();
          eleitoLuizFernando.adicionarDerrota ();

          System.out.println(eleitoJoaoHenrique.obterEstatisticas());
          System.out.println(eleitomariaAlice.obterEstatisticas());
          System.out.println(eleitoLuizFernando.obterEstatisticas());
    }

    }
