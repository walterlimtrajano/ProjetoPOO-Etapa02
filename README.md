# Sistema de Gestão de Clínica Vida Plena

## Integrantes

* Walter
* Juan
* Lucas
* Marcos

---

# Descrição do Projeto

O Sistema de Gestão de Clínica Vida Plena foi desenvolvido em Java utilizando os princípios da Programação Orientada a Objetos (POO). O sistema tem como objetivo informatizar os processos administrativos e operacionais de uma clínica, permitindo o gerenciamento de pacientes, profissionais de saúde, consultas, atendimentos, prontuários, pagamentos e relatórios.

Durante o desenvolvimento foram aplicados conceitos fundamentais de Engenharia de Software e POO, como herança, abstração, encapsulamento, polimorfismo, interfaces, tratamento de exceções e coleções da biblioteca Java.

---

# Funcionalidades

## Cadastro de Pacientes

* Cadastro de pacientes
* Atualização de informações
* Controle de pacientes ativos e inativos
  
---

## Cadastro de Profissionais

Cadastro de:

* Clínico Geral
* Psicólogo
* Nutricionista
* Fisioterapeuta

Cada profissional possui:

* Especialidade
* Registro profissional
* Valor da consulta
* Horários disponíveis

---

## Agendamento de Consultas

* Agendamento
* Cancelamento
* Remarcação
* Verificação de conflitos de horário
* Bloqueio para pacientes inativos

---

## Atendimento

* Registro do atendimento
* Diagnóstico
* Procedimentos realizados
* Prontuário do paciente

---

## Pagamentos

Suporte para:

* Pagamento em dinheiro
* Pagamento em cartão
* Pagamento por convênio

Recursos:

* Descontos
* Parcelamento
* Cobertura de convênio
* Cálculo automático do valor final

---

## Relatórios

* Relatório Geral
* Relatório por profissional
* Relatório por período
* Relatório financeiro
* Relatório unificado de cadastros

---

# Conceitos de Programação Orientada a Objetos Utilizados

## Herança

* Pessoa

  * Paciente
  * Profissional

    * Clínico Geral
    * Psicólogo
    * Nutricionista
    * Fisioterapeuta

---

## Abstração

Classes abstratas:

* Pessoa
* Profissional
* Pagamento

---

## Encapsulamento

Todos os atributos principais foram encapsulados utilizando modificadores de acesso privados, acompanhados de métodos getters e setters.

---

## Polimorfismo

Aplicado principalmente em:

* calcularValorFinal()
* exibirResumo()

Cada subclasse possui sua própria implementação.

---

## Interfaces

Foram utilizadas as interfaces:

* Agendavel
* Exportavel

---

## Coleções Java

O projeto utiliza:

* ArrayList
* HashMap
* HashSet
* List
* Map
* Set

---

## Tratamento de Exceções

Foram implementadas exceções personalizadas, como:

* DadoInvalidoException
* PacienteNaoEncontradoException
* HorarioIndisponivelException
* ConvenioNaoCobreException

Além do uso de blocos try, catch e finally.

---

# Estrutura do Projeto

```
Pessoa
│
├── Paciente
│
└── Profissional
     ├── ClinicoGeral
     ├── Psicologo
     ├── Nutricionista
     └── Fisioterapeuta

Consulta
Atendimento
Prontuario

Pagamento
├── PagamentoDinheiro
├── PagamentoCartao
└── PagamentoConvenio

ClinicaServico

Relatorio
RelatorioUnificadoCadastros

Agendavel
Exportavel
```

---

# Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos
* Coleções Java
* Git
* GitHub
* Draw.io

---

# Como Executar

1. Clone o repositório.

2. Abra o projeto em uma IDE Java (IntelliJ IDEA, Eclipse ou VS Code).

3. Compile todas as classes.

4. Execute a classe Main.java.

5. Utilize o menu interativo para acessar todas as funcionalidades.

---

# Funcionalidades Implementadas

* Cadastro de pacientes
* Cadastro de profissionais
* Agendamento
* Cancelamento
* Remarcação
* Atendimento
* Prontuário
* Pagamentos
* Relatórios
* Controle de horários
* Tratamento de exceções
* Validação de dados
* Relatório unificado de cadastros
* Exportação de dados
* Programação Orientada a Objetos completa

---

# Organização da Equipe

**Walter**

* Hierarquia de classes
* Especializações clínicas
* Encapsulamento
* Jornadas 16 e 17

**Juan**

* Interfaces
* Polimorfismo
* Sistema de pagamentos
* Jornadas 21, 22 e 23

**Lucas**

* Estruturas de dados
* Relacionamentos entre classes
* Jornadas 27, 28 e 29

**Marcos**

* Exceções
* Validações
* Tratamento de erros
* Jornadas 14, 18, 19 e 30

**Walter**

* Organização da camada de serviços
* Relatórios
* Documentação
* Diagrama UML
* README do projeto

---

# Drawio

* Link: https://drive.google.com/file/d/1WD1eHXaLeCy09EP8TkxA98KWx3fOHutD/view

# Considerações Finais

Este projeto foi desenvolvido como atividade acadêmica com o objetivo de aplicar, de forma integrada, os principais conceitos de Programação Orientada a Objetos, organização de software e boas práticas de desenvolvimento em Java.
