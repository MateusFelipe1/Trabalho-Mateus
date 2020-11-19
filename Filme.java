public class Filme {
   private int duracao;
   private String idiomaAudio;
   private String idiomaLegenda;
   private boolean estaPausado;
   private String nome;
   private int ano;


    public Filme(String nomeFilme, int duracaoFilme, int anoLancamento) {
        this.nome = nomeFilme;
        this.duracao = duracaoFilme;
        this.ano = anoLancamento;
        this.idiomaAudio = "Português(Brasil)";
        this.idiomaLegenda = "Português(Brasil)";
        this.estaPausado = false;
	}


   public void executar(){
    if(estaPausado == false){
        System.out.println("Iniciou o filme: "+ getNome());
    }else{
        System.out.println("O filme está reproduzido ");
    }
    }
     
   public void pausar(){
    estaPausado = true; 
    System.out.println("O filme está pausado.");
    }
    
    public void mudarAudio(){
        if(idiomaAudio == "Inglês(Original)"){
            idiomaAudio = "Português(Brasil)";
        }else{
            idiomaAudio = "Inglês(Original)";
        }    
        
        System.out.println("Idioma alterado para: " + idiomaAudio);
    
    }
      
    public void mudarLegenda(){
        if(idiomaLegenda == "Sem legenda"){
            idiomaLegenda = "Português(Brasil)";
        }else{
            idiomaLegenda = "Filme sem legenda";
        }
        System.out.println("Legenda alterada para: "+ idiomaLegenda);
    }
      
    public void exibirDetalhes(){
     System.out.println("Nome do filme: " + getNome() + " Ano Lancamento do Filme: " + getAno() + " Duracao do Filme: " + getDuracao() + " Minutos" );
    }



    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracaoFilme) {
        this.duracao = duracaoFilme;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nomeFilme) {
        this.nome = nomeFilme;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int anoLancamento) {
        this.ano = anoLancamento;
    }




}
