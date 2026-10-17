# Java: lógica e algoritmos

Este repositório reúne exercícios que resolvi durante meus estudos de **lógica de programação e Java**. Estou construindo minha base na linguagem e registrando problemas que me ajudaram a aprender a pensar em algoritmos.

## Exercícios selecionados

| Exercício | Conceitos praticados | O que o programa faz |
| --- | --- | --- |
| [Sistema de estacionamento](exercicios/01-estacionamento/SistemaEstacionamento.java) | `Scanner`, `do-while`, condicionais e acumuladores | Calcula cobranças de veículos, aplica limite de preço e soma o faturamento. |
| [Monitor de temperaturas](exercicios/02-temperaturas/MonitorTemperaturas.java) | Arrays, `for`, médias, comparações e contadores | Analisa as temperaturas de sete dias e identifica padrões na semana. |
| [Soma das linhas de uma matriz](exercicios/03-matrizes/SomaLinhasMatriz.java) | Matrizes, `for` aninhado e acumuladores | Percorre cada linha de uma matriz e exibe sua soma separadamente. |

## O que aprendi até aqui

- Utilizar condições e laços para representar regras de um problema.
- Percorrer arrays para calcular médias, comparar valores e contar ocorrências.
- Percorrer matrizes com índices de linha e coluna.
- **Melhorar uma solução:** no exercício de matrizes, minha primeira tentativa usava um acumulador por linha. Depois, consegui generalizar usando um único acumulador, reinicializado a cada linha.

## Como executar

Cada exercício é um programa independente. Abra o arquivo `.java` no IntelliJ IDEA e execute seu método `main`.

Também é possível compilar e executar pelo terminal, com um JDK instalado. Por exemplo, para o exercício de matrizes, a partir da raiz do repositório:

```bash
javac exercicios/03-matrizes/SomaLinhasMatriz.java
java -cp exercicios/03-matrizes SomaLinhasMatriz
```

Os arquivos foram organizados e receberam nomes de classes e assinaturas de `main` convencionais para facilitar a execução. **A lógica dos exercícios é a que escrevi durante os estudos.**

## Próximos passos

Continuar praticando matrizes e avançar para métodos, orientação a objetos e projetos próprios.

> Este é um repositório de **aprendizado**, não uma coleção de aplicações prontas para produção.
