public class Eleito {
    private Candidato candidato;
    private int vitorias;
    private int derrotas;

    public Eleito(Candidato candidato){
        this.candidato = candidato;
        this.vitorias = 0;
        this.derrotas = 0;
    }
    public void adicionarVitoria(){
        vitorias++;
    }
    public void adicionarDerrota(){
        derrotas++;
    }
    public String obterEstatisticas(){
        return "Candidato" + candidato + ", vitorias: " + vitorias + "Derrotas:" + derrotas;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
}
