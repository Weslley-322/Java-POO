# ⚙️ Sistema de Gerenciamento de Oficina Mecânica (Java Console)

Um sistema de console desenvolvido em **Java** para simular e gerenciar as operações de uma oficina mecânica. O projeto é focado em demonstrar o domínio e a aplicação correta dos principais pilares da **Orientação a Objetos (OOP)**.

O sistema permite o cadastro, a manipulação e a consulta de todas as entidades cruciais para o funcionamento de uma oficina: clientes, veículos, mecânicos e ordens de serviço.

## ✨ Funcionalidades Principais

O sistema é operado via menu interativo (`Util.java`) no console e oferece funcionalidades essenciais para a gestão:

* **Gestão de Cadastros:** Permite o registro e listagem de **Clientes** e **Mecânicos** (com especialização definida por `EspecMecanico`).
* **Diversidade de Veículos:** Suporta o cadastro de dois tipos de veículos: **`Carro`** e **`Moto`**, que herdam de uma classe base **`Veiculo`**.
* **Controle de Serviço (Consertos):**
    * Início de novas ordens de serviço.
    * **Atualização de Status** (Ex: `PENDENTE`, `EM_ANDAMENTO`, `FINALIZADO`).
    * **Definição de Prioridade** (Ex: `BAIXA`, `MÉDIA`, `URGENTE`).
* **Relatórios:** Exibição detalhada de todos os clientes, mecânicos, veículos e ordens de serviço registradas.

## 🧱 Arquitetura e Conceitos OOP

A estrutura do código foi cuidadosamente projetada para demonstrar uma aplicação robusta dos conceitos de Orientação a Objetos:

* **Abstração e Herança:** As classes **`Pessoa`** e **`Veiculo`** são classes abstratas que definem a base para a herança de suas respectivas entidades concretas (`Cliente`, `Mecanico`, `Carro`, `Moto`).
* **Interfaces e Polimorfismo:** A interface **`IMecanico`** define o contrato `realizarConserto()`, implementado pela classe `Mecanico`, garantindo flexibilidade e aderência a contratos.
* **Estruturas de Dados Tipadas:** A classe **`ListaGenerica<T>`** utiliza **Generics** para criar listas seguras e reutilizáveis, gerenciando coleções de diferentes tipos de objetos.
* **Controle de Estado:** O uso extensivo de **Enumerações** (`StatusConserto`, `PrioriConserto`, etc.) garante que as propriedades do sistema usem valores válidos e controlados.

## 💻 Tecnologias Utilizadas

* **Linguagem:** Java (Standard Edition)
* **Estruturas de Dados:** `ArrayList` e Implementação de `ListaGenerica<T>`.

## 🚀 Como Instalar e Rodar o Projeto

Siga estes passos para configurar e executar o aplicativo no ambiente Java.

### Pré-requisitos
Certifique-se de ter o [Java Development Kit (JDK) 8 ou superior](https://www.oracle.com/java/technologies/javase-downloads.html) instalado e configurado em sua máquina.

### 1. Clonar o Repositório
```bash
git clone [SEU_LINK_DO_REPOSITORIO]
cd [NOME_DA_PASTA]
```

### 2. Compilar os Arquivos
O projeto deve ser compilado a partir da raiz, direcionando a saída para a pasta `bin`.
* Assumindo que os arquivos `.java` estão na pasta `src/oficina`:
```bash
javac -d bin src/oficina/*.java
```

### 3. Executar o Programa
Execute a aplicação principal (que contém o menu interativo) usando o classpath que aponta para a pasta de classes compiladas (`bin`):
```bash
java -cp bin oficina.Util
```
