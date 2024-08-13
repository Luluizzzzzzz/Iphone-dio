public interface AparelhoTelefonico {
    public void ligar(String numero);

    public void atender(String numero);

    public void iniciarCorreioVoz(String mensagem, String destinatario);

    public void salvarContato(String numero);

    public void buscarContato(String numero);
}