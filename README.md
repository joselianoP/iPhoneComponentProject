# iPhone Component Project

## Descrição

Este projeto Java simula as funcionalidades básicas de um iPhone, divididas em três componentes principais:

1. **Reprodutor Musical**
    - `tocar()`: Inicia a reprodução de uma música.
    - `pausar()`: Pausa a música que está tocando.
    - `selecionarMusica(String musica)`: Seleciona uma música específica para tocar.

2. **Aparelho Telefônico**
    - `ligar(String numero)`: Realiza uma chamada telefônica para o número informado.
    - `atender()`: Atende uma chamada telefônica.
    - `iniciarCorreioVoz()`: Inicia o correio de voz.

3. **Navegador na Internet**
    - `exibirPagina(String url)`: Exibe a página web correspondente ao URL informado.
    - `adicionarNovaAba()`: Abre uma nova aba no navegador.
    - `atualizarPagina()`: Atualiza a página atual.

## Estrutura do Projeto

- **src/com/iphonecomponent**: Contém as classes Java implementadas para cada componente.

## Como Executar

1. Clone o repositório.
2. Importe o projeto em sua IDE de preferência (como IntelliJ IDEA ou Eclipse).
3. Crie uma classe principal (main) para instanciar e utilizar os componentes conforme necessário.
4. Execute o projeto.

## Exemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        ReprodutorMusical player = new ReprodutorMusical();
        player.selecionarMusica("Minha Música Favorita");
        player.tocar();
        player.pausar();

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar("123456789");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina("http://example.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}