# Funcionalidade adicional

Funcionalidade: Histórico de Reservas por Usuário

Descrição:
O sistema permite registrar e consultar o histórico das reservas realizadas pelos usuários.

Padrão utilizado: Memento

Justificativa:
O padrão Memento foi escolhido porque permite salvar estados anteriores de uma reserva sem expor detalhes internos do objeto. Dessa forma, o histórico pode armazenar diferentes versões da reserva (criada, alterada ou cancelada).