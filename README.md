# 🔍 Search Algorithm Comparator

<div align="center">

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](https://opensource.org/licenses/MIT)

[English](#english) | [Português](#português)

</div>

---

## English

### 📖 Overview

A high-performance Java application that compares the execution time of four fundamental search algorithms: **Linear Search**, **Binary Search**, **Jump Search**, and **Interpolation Search**. The program generates random arrays, performs searches with existing and non-existing targets, and determines which algorithm performs best under different conditions.

### ✨ Features

- 🎲 **Random Array Generation** with customizable size
- ⚡ **Four Search Algorithms** implementation
- ⏱️ **Nanosecond Precision** timing measurements
- 📊 **Performance Comparison** with visual output
- 🏆 **Automatic Winner Detection** for each scenario
- 🎯 **Dual Target Testing** (existing and non-existing values)

### 🛠️ Technologies

- **Language:** Java
- **Paradigm:** Object-Oriented Programming (OOP)
- **Design Pattern:** Strategy Pattern (via `SearchPattern` interface)

### 📂 Project Structure

```
src/
├── main/
│   └── SearchComparator.java      # Main class with execution logic
├── algorithms/
│   ├── SearchPattern.java          # Interface for search algorithms
│   ├── LinearSearch.java           # Linear search implementation
│   ├── BinarySearch.java           # Binary search implementation
│   ├── JumpSearch.java             # Jump search implementation
│   └── InterpolationSearch.java   # Interpolation search implementation
├── data/
│   └── ArrayGenerator.java         # Array and target generation utilities
└── utils/
    └── Timer.java                  # High-precision timer utility
```

### 🚀 How to Run

1. **Clone the repository:**
```bash
git clone https://github.com/rickegss/search-algorithms-benchmark.git
cd search-algorithms-benchmark
```

2. **Compile the project:**
```bash
javac -d bin src/**/*.java
```

3. **Run the application:**
```bash
java -cp bin main.SearchComparator
```

4. **Enter the desired array size** when prompted

### 📊 Sample Output

```
═══════════════════════════════════════════════════════════════════════════════════════════════════
  📊 ARRAY & TARGET INFO
═══════════════════════════════════════════════════════════════════════════════════════════════════
• Array size........... 1000
• Random array......... [423, 891, 234, ...]
• Target (exists)...... 567
• Target (not exists).. 1523

═══════════════════════════════════════════════════════════════════════════════════════════════════
  🔍 LINEAR SEARCH
═══════════════════════════════════════════════════════════════════════════════════════════════════
▶▶ Running: LinearSearch
▶ Target : 567
✓ Found at index 342
⏱ Time: 8500 ns
⏱ Time: 0.008500 ms

[... more results ...]

═══════════════════════════════════════════════════════════════════════════════════════════════════
  🏆 FASTEST ALGORITHM [with inner target]
═══════════════════════════════════════════════════════════════════════════════════════════════════
• Winner: BinarySearch
• Time: 2300 ns
```

### 🧪 Algorithms Implemented

| Algorithm | Time Complexity | Space Complexity | Requirements |
|-----------|----------------|------------------|--------------|
| **Linear Search** | O(n) | O(1) | None |
| **Binary Search** | O(log n) | O(1) | Sorted array |
| **Jump Search** | O(√n) | O(1) | Sorted array |
| **Interpolation Search** | O(log log n)* | O(1) | Sorted array with uniform distribution |

*Best case scenario

### 🎯 Use Cases

- **Educational**: Understanding algorithm performance differences
- **Benchmarking**: Testing search algorithms on different data sizes
- **Algorithm Selection**: Choosing the right search method for your project

### 📚 Key Learnings

This project demonstrates:
- Implementation of classic search algorithms
- Strategy design pattern usage
- Performance measurement techniques
- Object-oriented programming principles
- Clean code architecture

### 🤝 Contributing

Contributions are welcome! Feel free to:
1. Fork the project
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

### 👤 Author

**Rickegss**
- GitHub: [@rickegss](https://github.com/rickegss)
- LinkedIn: [Ricardo Gomes da Silva](https://www.linkedin.com/in/ricardo-gomes-dev)

---

## Português

### 📖 Visão Geral

Uma aplicação Java de alta performance que compara o tempo de execução de quatro algoritmos fundamentais de busca: **Busca Linear**, **Busca Binária**, **Busca por Saltos** e **Busca por Interpolação**. O programa gera arrays aleatórios, realiza buscas com alvos existentes e inexistentes, e determina qual algoritmo performa melhor sob diferentes condições.

### ✨ Funcionalidades

- 🎲 **Geração de Array Aleatório** com tamanho customizável
- ⚡ **Implementação de Quatro Algoritmos** de busca
- ⏱️ **Medição de Tempo com Precisão** em nanossegundos
- 📊 **Comparação de Performance** com saída visual
- 🏆 **Detecção Automática do Vencedor** para cada cenário
- 🎯 **Teste Duplo de Alvos** (valores existentes e inexistentes)

### 🛠️ Tecnologias

- **Linguagem:** Java
- **Paradigma:** Programação Orientada a Objetos (POO)
- **Padrão de Projeto:** Strategy Pattern (via interface `SearchPattern`)

### 📂 Estrutura do Projeto

```
src/
├── main/
│   └── SearchComparator.java      # Classe principal com lógica de execução
├── algorithms/
│   ├── SearchPattern.java          # Interface para algoritmos de busca
│   ├── LinearSearch.java           # Implementação da busca linear
│   ├── BinarySearch.java           # Implementação da busca binária
│   ├── JumpSearch.java             # Implementação da busca por saltos
│   └── InterpolationSearch.java   # Implementação da busca por interpolação
├── data/
│   └── ArrayGenerator.java         # Utilitários de geração de array e alvos
└── utils/
    └── Timer.java                  # Utilitário de timer de alta precisão
```

### 🚀 Como Executar

1. **Clone o repositório:**
```bash
git clone https://github.com/rickegss/search-algorithms-benchmark.git
cd search-algorithms-benchmark
```

2. **Compile o projeto:**
```bash
javac -d bin src/**/*.java
```

3. **Execute a aplicação:**
```bash
java -cp bin main.SearchComparator
```

4. **Digite o tamanho do array desejado** quando solicitado

### 📊 Exemplo de Saída

```
═══════════════════════════════════════════════════════════════════════════════════════════════════
  📊 INFORMAÇÕES DO ARRAY & ALVO
═══════════════════════════════════════════════════════════════════════════════════════════════════
• Tamanho do array..... 1000
• Array aleatório...... [423, 891, 234, ...]
• Alvo (existe)........ 567
• Alvo (não existe).... 1523

═══════════════════════════════════════════════════════════════════════════════════════════════════
  🔍 BUSCA LINEAR
═══════════════════════════════════════════════════════════════════════════════════════════════════
▶▶ Executando: LinearSearch
▶ Alvo : 567
✓ Encontrado no índice 342
⏱ Tempo: 8500 ns
⏱ Tempo: 0.008500 ms

[... mais resultados ...]

═══════════════════════════════════════════════════════════════════════════════════════════════════
  🏆 ALGORITMO MAIS RÁPIDO [com alvo interno]
═══════════════════════════════════════════════════════════════════════════════════════════════════
• Vencedor: BinarySearch
• Tempo: 2300 ns
```

### 🧪 Algoritmos Implementados

| Algoritmo | Complexidade de Tempo | Complexidade de Espaço | Requisitos |
|-----------|----------------------|------------------------|------------|
| **Busca Linear** | O(n) | O(1) | Nenhum |
| **Busca Binária** | O(log n) | O(1) | Array ordenado |
| **Busca por Saltos** | O(√n) | O(1) | Array ordenado |
| **Busca por Interpolação** | O(log log n)* | O(1) | Array ordenado com distribuição uniforme |

*Melhor caso

### 🎯 Casos de Uso

- **Educacional**: Compreender diferenças de performance entre algoritmos
- **Benchmarking**: Testar algoritmos de busca em diferentes tamanhos de dados
- **Seleção de Algoritmos**: Escolher o método de busca ideal para seu projeto

### 📚 Principais Aprendizados

Este projeto demonstra:
- Implementação de algoritmos clássicos de busca
- Uso do padrão de projeto Strategy
- Técnicas de medição de performance
- Princípios de programação orientada a objetos
- Arquitetura de código limpo

### 🤝 Contribuindo

Contribuições são bem-vindas! Sinta-se livre para:
1. Fazer um fork do projeto
2. Criar uma branch de feature (`git checkout -b feature/FuncionalidadeIncrivel`)
3. Commitar suas mudanças (`git commit -m 'Adiciona alguma FuncionalidadeIncrivel'`)
4. Fazer push para a branch (`git push origin feature/FuncionalidadeIncrivel`)
5. Abrir um Pull Request

### 📄 Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

### 👤 Autor

**Rickegss**
- GitHub: [@rickegss](https://github.com/rickegss)
- LinkedIn: [Ricardo Gomes da Silva](https://www.linkedin.com/in/ricardo-gomes-dev)

---

<div align="center">

**⭐ Se este projeto foi útil para você, considere dar uma estrela!**

</div>
