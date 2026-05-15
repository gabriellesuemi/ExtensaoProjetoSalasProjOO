# ExtensaoProjetoSalasProjOO

# Extensão – Sistema de Reserva de Salas de Estudo

## Integrantes
- Gabrielle Suemi Iquejiri Alencar
- Pedro Ernesto Duarte Pilchowski

## Descrição

Este projeto representa uma extensão do Sistema de Reserva de Salas de Estudo. Foi desenvolvida uma funcionalidade adicional de Histórico de Reservas por Usuário, permitindo armazenar e consultar alterações realizadas em reservas ao longo do tempo.

A implementação utiliza o padrão de projeto Memento para salvar estados anteriores das reservas sem expor diretamente os detalhes internos dos objetos.

---

## Funcionalidade Implementada

### Histórico de Reservas por Usuário

O sistema registra diferentes estados de uma reserva durante seu ciclo de vida.

Exemplos:
- Reserva criada
- Reserva alterada
- Reserva cancelada

Cada alteração gera um novo estado salvo no histórico do usuário.

---

## Padrão de Projeto Utilizado

### Memento

O padrão Memento foi escolhido por permitir armazenar estados anteriores de um objeto sem violar o encapsulamento.

No projeto:

- `Reserva` → Originator (objeto que gera estados)
- `ReservaMemento` → Memento (armazena o estado)
- `HistoricoReservas` → Caretaker (gerencia os históricos)

---

## Estrutura do Projeto

```text
src/
│
├── Usuario.java
├── Reserva.java
├── ReservaMemento.java
├── HistoricoReservas.java
└── Main.java

docs/
└── funcionalidade_adicional.md