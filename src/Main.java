public class Main {
    public static void main(String[] args) {
        // Criar uma usuária
        Usuario usuaria = new Usuario("Maria");
        
        // Criar uma reserva
        Reserva reserva = new Reserva(usuaria, "Sala A", "10:00");
        
        // Criar o histórico
        HistoricoReservas historico = new HistoricoReservas();
        
        // Salvar no histórico
        historico.adicionarEstado(usuaria, reserva.salvar());
        
        // Alterar o horário
        reserva.alterarHorario("14:00");
        
        // Salvar de novo
        historico.adicionarEstado(usuaria, reserva.salvar());
        
        // Cancelar a reserva
        reserva.cancelar();
        
        // Salvar novamente
        historico.adicionarEstado(usuaria, reserva.salvar());
        
        // Verificar se aparece o histórico completo, mostrando a reserva criada, depois alterada e depois cancelada
        historico.listarHistorico(usuaria);
    }
}
