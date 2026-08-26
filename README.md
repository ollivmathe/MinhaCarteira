# Projeto MinhaCarteira - Gestão Financeira Pessoal

## Sobre o Projeto
Este repositório abriga o desenvolvimento do núcleo de um sistema de gestão financeira pessoal. O projeto foi construído para a disciplina de Programação de Sistemas II do curso de Análise e Desenvolvimento de Sistemas da Universidade Presbiteriana Mackenzie. Esta entrega representa a primeira etapa de um total de oito fases planejadas, servindo como o alicerce arquitetural da aplicação.

## Conceitos e Tecnologias Aplicadas
O desenvolvimento do código foi guiado pelos pilares fundamentais da Orientação a Objetos na linguagem Java. O ecossistema foi estruturado utilizando abstração, herança e polimorfismo, permitindo o tratamento unificado de diferentes tipos de movimentações financeiras no motor de processamento do sistema.

## Arquitetura das Classes
A estrutura primária é baseada na classe abstrata Transacao, que encapsula os dados essenciais de qualquer movimentação, como descrição, valor e data. Ela dita a obrigatoriedade da implementação do método de exibição de detalhes por parte de suas classes filhas.

Para lidar com regras fiscais, foi introduzida a interface Tributavel, estabelecendo um contrato claro para o cálculo de impostos sobre operações específicas.

As entidades concretas assumem os papéis funcionais do sistema. A classe Despesa herda a estrutura base para representar a saída de capital. A classe Receita representa o fluxo de entrada e assina o contrato da interface de tributação, aplicando a regra de negócio que calcula automaticamente o imposto correspondente a dez por cento do seu valor total.

A integração de todas as peças acontece na classe executável Sistema. Nela, o processamento ocorre através de uma coleção genérica, utilizando validação dinâmica de tipos em tempo de execução para verificar a tributação e disparar os comportamentos polimórficos de cada entidade.

## Próximos Passos
Sendo a parte inicial de uma série de atividades acadêmicas, o repositório será gradativamente atualizado. As próximas atualizações expandirão a lógica de negócios, trarão novas funcionalidades e aprofundarão as práticas de engenharia de software ao longo do andamento do curso.

## Autor
Desenvolvido por Matheus Oliveira (ollivmathe).