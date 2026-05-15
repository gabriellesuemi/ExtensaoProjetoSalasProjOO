public class Reserva {

    private Usuario usuario;
    private String sala;
    private String horario;
    private String status;

    public Reserva(
            Usuario usuario,
            String sala,
            String horario) {

        this.usuario = usuario;
        this.sala = sala;
        this.horario = horario;
        this.status="Criada";
    }

    public void cancelar() {
        status="Cancelada";
    }

    public void alterarHorario(String novoHorario){
        horario=novoHorario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public ReservaMemento salvar(){

        return new ReservaMemento(
                "Sala: " + sala
                + " | Horário: "
                + horario
                + " | Status: "
                + status
        );
    }
}