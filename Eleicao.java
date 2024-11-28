import java.util.HashMap;
import java.util.Map;

public abstract class Eleicao {
    protected Map<Candidato, Integer>
    votos = new HashMap<>();

    public abstract void realizarVotacao(Candidato candidato);

    public void registraVotacao(Candidato candidato){
        votos.put(candidato, votos.getOrDefault(candidato, 0) + 1);

    }

    public abstract void CandidatoCalcularResultado();

}
