# 🧠 Projeto Quiz Junino Verbos em Java

### 🎓 Curso Técnico em Desenvolvimento de Sistemas  
### 🏫 CETI Raldir Cavalcante Bastos  
### 📅 2025

---

## 📌 Descrição

Este projeto é um **Quiz interativo em Java**, desenvolvido com o objetivo de exercitar conceitos de programação orientada a objetos, estruturas de repetição, vetores e entrada de dados com `Scanner`. O programa apresenta perguntas de múltipla escolha ao usuário, calcula a pontuação final e exibe o desempenho ao final do jogo.

---

## 🚀 Funcionalidades

- 📋 Apresentação de perguntas com alternativas.
- 👨‍🎓 Verificação automática de resposta correta.
- 📊 Cálculo de desempenho final (porcentagem de acertos).
- 💬 Saída formatada com mensagens ao usuário.

---

## 🛠️ Tecnologias Utilizadas

- ![Java](https://img.shields.io/badge/Java-%23ED8B00?style=for-the-badge&logo=java&logoColor=white)
- Console / Terminal

---

## 📂 Estrutura do Código

O projeto possui duas classes principais:

### ✅ `Quiz.java`
Responsável por:
- Criar as questões
- Exibir perguntas e alternativas
- Coletar respostas do usuário
- Calcular e mostrar o resultado final

### ✅ `Questao.java`
Classe auxiliar que define a estrutura de uma questão:
- `String enunciado`
- `String[] alternativas`
- `char alternativaCorreta`

---

## 🧪 Como Executar

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) instalado.
2. Compile o programa:
   ```bash
   javac Quiz.java
