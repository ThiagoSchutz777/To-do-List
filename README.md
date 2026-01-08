📝 Console Task Manager ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
Um gerenciador de tarefas simples e eficiente desenvolvido em Java, operando via terminal. Este projeto foi criado para praticar conceitos fundamentais de Orientação a Objetos, manipulação de Estruturas de Dados e tratamento de exceções.

🚀 Funcionalidades
O sistema permite ao usuário gerenciar suas tarefas diárias através de um menu interativo:

Adicionar Tarefa: Criação de novas tarefas com descrição e ID personalizado.

Listar Tarefas: Visualização de todas as tarefas cadastradas e seus status (pendente/concluída).

Concluir Tarefa: Atualização do status de uma tarefa específica para "Concluída".

Remover Tarefa: Exclusão de tarefas da lista através do ID.

Validação de Dados: O sistema trata entradas inválidas (ex: digitar letras onde se espera números) sem encerrar a execução.

🛠️ Tecnologias e Conceitos Aplicados
Java (JDK)

POO (Programação Orientada a Objetos): Encapsulamento, Classes e Objetos.

Java Collections Framework: Uso de ArrayList e interface List.

Expressões Lambda: Utilização de removeIf (Predicados) para remoção otimizada de itens.

Tratamento de Exceções: Uso de blocos try-catch para capturar InputMismatchException e RuntimeException.

Fluxo de Controle: Loops (while), condicionais (switch-case) e entrada de dados (Scanner).

📂 Estrutura do Projeto
O código segue uma arquitetura simples e organizada:

src
├── Application
│   └── Main.java       # Ponto de entrada e lógica de interação com o usuário (View/Controller)
└── entities
    └── Task.java       # Modelo de dados representando a tarefa (Model)
💻 Como Executar
Certifique-se de ter o Java instalado. No terminal, navegue até a pasta raiz do projeto:

Bash

# Compile os arquivos
javac -d bin src/Application/Main.java src/entities/Task.java

# Execute a aplicação
java -cp bin Application.Main
📌 Exemplo de Uso
Plaintext

-----------------------------------------
[1] Adicionar uma nova tarefa na lista!
[2] Remover uma tarefa da lista!
[3] Ver todas as tarefas da lista!
[4] Marcar uma tarefa como concluída!
[5] Sair
------------------------------------------
Digite uma opção: 1

Digite a descrição da tarefa: Estudar Java POO
Digite um numero de identificaçao para esta tarefa: 101
