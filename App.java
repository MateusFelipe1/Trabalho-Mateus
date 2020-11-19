public class App {
    public static void main(String[] args) throws Exception {
        Filme primeiroFilme = new Filme ("Superaçao", 70, 2019);
        primeiroFilme.exibirDetalhes();
        primeiroFilme.executar();
        primeiroFilme.pausar();
        primeiroFilme.executar();
        primeiroFilme.mudarAudio();
        primeiroFilme.mudarAudio();
        primeiroFilme.mudarLegenda();
        primeiroFilme.mudarLegenda();
        System.out.println();

        
        
        Filme segundoFilme = new Filme ("Minha mãe é uma peça",77, 2019);
        System.out.println();
        segundoFilme.exibirDetalhes();
        segundoFilme.executar();
        segundoFilme.pausar();
        segundoFilme.executar();
        segundoFilme.mudarAudio();
        segundoFilme.mudarAudio();
        segundoFilme.mudarLegenda();
        segundoFilme.mudarLegenda();
        System.out.println();

      
        Serie primeiraSerie = new Serie ("Supernatural", 15, 22, 50, 2005);
        System.out.println();
        primeiraSerie.exibirDetalhes();
        primeiraSerie.executar();
        primeiraSerie.pausar();
        primeiraSerie.executar();
        primeiraSerie.mudarAudio();
        primeiraSerie.mudarAudio();
        primeiraSerie.mudarLegenda();
        primeiraSerie.mudarLegenda();
        System.out.println();


        Serie segundaSerie = new Serie ("Ragnarok", 1, 10, 40, 2020);
        System.out.println();
        segundaSerie.exibirDetalhes();
        segundaSerie.executar();
        segundaSerie.pausar();
        segundaSerie.executar();
        segundaSerie.mudarAudio();
        segundaSerie.mudarAudio();
        segundaSerie.mudarLegenda();
        segundaSerie.mudarLegenda();
    }
}
