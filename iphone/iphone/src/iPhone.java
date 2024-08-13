
public class iPhone implements Music, AparelhoTelefonico, NavegadorNet {

    // métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender(String numero) {
        System.out.println("Recebendo ligação de: " + numero);
    }

    @Override
    public void iniciarCorreioVoz(String mensagem, String destinatario) {
        System.out.println("Iniciando correio de voz para " + destinatario + ". Mensagem: " + mensagem);
    }

    @Override
    public void salvarContato(String numero) {
        System.out.println("Salvando contato com o número: " + numero);
    }

    @Override
    public void buscarContato(String numero) {
        System.out.println("Buscando contato com o número: " + numero);
    }

    // métodos da interface NavegadorNet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Abrindo nova aba com a página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página atual.");
    }

    // métodos da interface Music
    @Override
    public void tocar() {
        System.out.println("A música está tocando.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Você selecionou a música.");
    }

    @Override
    public void buscarMusica() {
        System.out.println("Buscando músicas.");
    }

    // Método principal para testar a implementação
    public static void main(String[] args) {
        // instância da classe iPhone
        iPhone meuIphone = new iPhone();

        // dados para os testes
        meuIphone.ligar("424-654-7645");
        meuIphone.atender("098-765-4321");
        meuIphone.iniciarCorreioVoz("Olá, por favor deixe sua mensagem.", "Luiz");
        meuIphone.salvarContato("312-434-2454");
        meuIphone.buscarContato("345-543-4321");

        meuIphone.exibirPagina("www.dfoasifsdj.com");
        meuIphone.adicionarNovaAba("www.sadfosfdj.com");
        meuIphone.atualizarPagina();

        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica();
        meuIphone.buscarMusica();
    }
}
