package exercicios.atv2;

public class Contatos {

    private String nome;
    private String email;
    private String sexo;
    private Long telefone;
    private int contatoId;

    public Contatos(String nome, String email, String sexo, long telefone,int contatoId) {
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.telefone = telefone;
        this.contatoId = contatoId;
    }

    public static String getContato(Contatos contato){
        return String.format("Contato ID %d {Nome: %S, Email: %S, Sexo: %S, Telefone: %d}",contato.contatoId,contato.nome,contato.email,contato.sexo,contato.telefone);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }
    public void setContatoId(int contatoId) {
        this.contatoId = contatoId;
    }

}
