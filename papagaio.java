public class papagaio extends animal {
    private String bico;
    private String pena;
    private String asa;

    public papagaio(String Nome, String Especie, int Idade, String bico, String pena, String asa) {
        super(Nome, Especie, Idade);
        this.bico = bico;
        this.pena = pena;
        this.asa = asa;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(x:"====PAPAGAIO====");
        System.out.println("Nome: " + getNome());
        System.out.println("Especie: " + getEspecie());
        System.out.println("Idade: " + getIdade());
        System.out.println("Bico: " + bico);
        System.out.println("Pena: " + pena);
        System.out.println("Asa: " + asa);

    }
}
