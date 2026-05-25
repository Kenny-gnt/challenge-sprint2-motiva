# Challenge Sprint 2 - Motiva

## 📌 Descrição do Projeto

Este projeto simula um sistema inteligente de monitoramento e priorização de roçada de vegetação em rodovias da Motiva, o sistema analisa diferentes tipos de trechos rodoviários, aplica regras de crescimento da vegetação e gera automaticamente um relatório operacional indicando prioridades de intervenção.

---
# Integrantes 👤

Ana Luiza Santos Bertão RM 563171

Gisleine Muñoz Ticona RM 563804

Larissa Machado Silva RM 564168

Raira de Teves Costa RM 564850

Sofia Bill Franken RM 562767
---
##  Tecnologias Utilizadas

- Java
- Eclipse IDE
- Programação Orientada a Objetos (POO)

---

##  Conceitos Aplicados

- Herança
- Polimorfismo
- Classes Abstratas
- Interfaces
- Encapsulamento
- Organização em Pacotes
- Clean Code

---
## Funcionalidades

Simulação de crescimento de vegetação
Monitoramento via IoT
Diferentes tipos de trechos
Relatório automático de prioridade
Intervenções operacionais automatizadas
---
## Tipos de Trecho

Trecho Urbano

Possui sensores IoT e transmite dados automaticamente para o sistema.

Trecho Rural

Apresenta crescimento moderado da vegetação.

Trecho Úmido

Possui crescimento acelerado da vegetação devido às condições climáticas.

---

## Intervenções Operacionais
Roçada Mecanizada

Utilizada em situações de alta prioridade com vegetação elevada.

Pulverização

Aplicada em situações moderadas para controle preventivo do crescimento.

---

## Relatório Inteligente

O sistema percorre todos os trechos cadastrados e define automaticamente:

prioridade baixa
prioridade média
prioridade alta

Além da intervenção recomendada para cada situação.

---

## Interface IoT

A interface MonitoravelViaIoT foi criada para representar trechos rodoviários que possuem sensores inteligentes instalados.

O TrechoUrbano implementa essa interface e consegue transmitir automaticamente os dados da vegetação para o sistema sem necessidade de inspeção visual.

---

## 🧠 Perguntas de Reflexão

### 📌 Por que não faz sentido para a Motiva que uma equipe execute apenas uma "Intervenção Operacional" genérica sem especificar qual é?

Não faz sentido porque cada intervenção possui uma finalidade diferente, a roçada mecanizada é utilizada para remover vegetação alta e densa, enquanto a pulverização é aplicada para controle preventivo do crescimento. Por isso, o sistema precisa identificar corretamente qual serviço deve ser executado em cada trecho da rodovia.

---

### 📌 Qual a diferença arquitetural entre fazer um Trecho herdar de uma classe abstrata vs. implementar uma Interface?

A classe abstrata foi utilizada para compartilhar características e comportamentos comuns entre os trechos da rodovia, como KM e nível de vegetação. Já a interface foi utilizada para adicionar funcionalidades específicas, como o monitoramento IoT, apenas aos trechos que possuem sensores inteligentes instalados.


## 📂 Estrutura do Projeto

```text
src/
│
├── app/
│   └── Main.java
│
├── model/
│   ├── TrechoRodovia.java
│   ├── TrechoUrbano.java
│   ├── TrechoRural.java
│   └── TrechoUmido.java
│
├── interfaces/
│   └── MonitoravelViaIoT.java
│
├── servicos/
│   ├── IntervencaoOperacional.java
│   ├── RocadaMecanizada.java
│   └── Pulverizacao.java
│
└── util/
    └── RelatorioPrioridade.java

