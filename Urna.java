import java.util.List;
import java.util.Map;

public class Urna extends Eleicao {

    private List<Candidato> candidato;


    public Urna(List<Candidato> candidato) {
        this.candidato = candidato;
        for (Candidato c : candidato) {
            votos.put(c, 0);
        }
    }
    @Override
    public void realizarVotacao(Candidato candidato){
        if (votos.containsKey(candidato)){
            registraVotacao(candidato);
            System.out.println("Voto Registrado para " + candidato.getNome());
        }else {
            System.out.println("Candidato não encontrado! ");
        }

    }

    @Override
    public void CandidatoCalcularResultado() {

    }

    public Candidato calcularResultado(){
        Candidato vencendor = null;
        int maxVotos = -1;
        for (Map.Entry<Candidato, Integer> entry: votos.entrySet()) {
            if (entry.getValue()>maxVotos){
                maxVotos = entry.getValue();
                vencendor = entry.getKey();
            }

        }
        return vencendor;
    }
}