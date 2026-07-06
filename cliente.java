public class Cliente extends Pessoa {
    private String cpf;
    private String endereco;

    public Cliente() {
    }

    public Cliente(int id, String nome, String telefone, String email,
                   String cpf, String endereco) {
        super(id, nome, telefone, email);
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
