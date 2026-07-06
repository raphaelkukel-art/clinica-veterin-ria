public class animal {

    protected String nome;
    protected String especie;
    protected int idade;

    public animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("nome: " + nome);
        System.out.println("especie: " + especie);
        System.out.println("idade: " + idade);
    }
}
