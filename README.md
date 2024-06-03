# Gerenciador de Lojas de um Shopping Center

## Descrição do Projeto

Um dos locais mais visitados nos finais de semana, especialmente em épocas de festas, são os Shoppings. Além de climatizados e comumente seguros, são locais onde é possível encontrar uma grande variedade de lojas e atividades para todas as idades.

Neste contexto, o desafio de Laboratório I é o desenvolvimento de um gerenciador de lojas em um Shopping Center. Este sistema permitirá o gerenciamento das lojas presentes no shopping, bem como a realização de alterações nas lojas, emissões de relatórios e diversos outros aspectos relacionados.

## Estrutura do Shopping

O Shopping pode ter diversas lojas de diferentes segmentos, como vestuário, alimentação, lazer, cinema, serviços, etc. Cada "quadrado" representa um determinado espaço no Shopping, que poderá (ou não) ser alugado por alguma loja. No exemplo ilustrativo, temos um Shopping com 20 espaços para locação, nomeados de E0 a E19.

## Funcionalidades

O sistema deve gerenciar as lojas presentes no shopping, permitindo:

- Cadastro e remoção de lojas.
- Atualização das informações das lojas.
- Consulta das lojas por segmento.
- Emissão de relatórios sobre a ocupação dos espaços.
- Gerenciamento das locações de espaços.

## Requisitos

- Criar as classes, métodos, atributos e demais componentes exatamente como solicitado.
- Métodos auxiliares podem ser criados, desde que não fujam da lógica solicitada para o problema.
- O tipo das variáveis que não estiverem definidos no enunciado deve ser definido considerando a lógica e a necessidade de armazenamento de cada variável.
- Não é permitido criar mais atributos do que os solicitados nas classes.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- `Shopping`: Classe principal que gerencia os espaços e as lojas.
- `Loja`: Classe que representa uma loja no shopping.
- `Espaco`: Classe que representa um espaço no shopping que pode ser alugado.