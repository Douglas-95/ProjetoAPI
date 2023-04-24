import java.time.LocalDate;

public class Nutricionista{
    private String nome;
    private LocalDate idade;
    private String codigoRegistro;
    private Long idPaciente;
    
    
    public Nutricionista(String nome, LocalDate idade, String codigoRegistro, Long idPaciente) {
        this.nome = nome;
        this.idade = idade;
        this.codigoRegistro = codigoRegistro;
        this.idPaciente = idPaciente;
    }

    @SuppressWarnings("unused")
    private Nutricionista(){

    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getIdade() {
        return idade;
    }
    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }
    public String getCodigoRegistro() {
        return codigoRegistro;
    }
    public void setCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }
    public Long getIdPaciente() {
        return idPaciente;
    }
    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }
}