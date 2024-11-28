public class Candidato extends Eleicao{
    private String nome;

    public Candidato(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    @Override
    public String toString(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void realizarVotacao(Candidato candidato) {

    }

    @Override
    public void CandidatoCalcularResultado() {

    }
}
