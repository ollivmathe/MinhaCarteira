# Projeto MinhaCarteira - Gestão Financeira Pessoal

## Sobre o Projeto
Este repositório abriga o desenvolvimento do núcleo de um sistema de gestão financeira pessoal. O projeto foi construído para a disciplina de Programação de Sistemas II do curso de Análise e Desenvolvimento de Sistemas da Universidade Presbiteriana Mackenzie. Esta entrega contempla a evolução arquitetural da segunda etapa de um total de oito fases planejadas, consolidando o controle de integridade dos dados e o tratamento robusto de erros.

## Conceitos e Tecnologias Aplicadas
O desenvolvimento do código foi guiado pelos pilares fundamentais da Orientação a Objetos na linguagem Java. O ecossistema foi estruturado utilizando abstração, herança, polimorfismo, encapsulamento rigoroso e propagação de exceções checadas e não checadas, garantindo que o motor de processamento opere apenas com estados válidos.

## Arquitetura e Organização de Pacotes
A base de código segue as convenções canônicas de nomenclatura do Java, distribuída em pacotes especializados para manter uma separação clara de responsabilidades.

O pacote de entidades armazena a classe abstrata Transacao, que encapsula os atributos essenciais de qualquer movimentação: descrição, valor e data. Ela dita a obrigatoriedade da implementação do método de exibição de detalhes por parte de suas classes derivadas e assegura a consistência dos dados recebidos através de validações centralizadas.

Para lidar com regras fiscais, a interface Tributavel estabelece um contrato explícito para o cálculo de tributos sobre operações financeiras específicas.

As entidades concretas assumem os papéis funcionais do sistema:
A classe Despesa herda a estrutura base para representar a saída de capital.
A classe Receita representa o fluxo de entrada e assina o contrato da interface de tributação, aplicando a regra de negócio que calcula automaticamente o imposto correspondente a dez por cento do seu valor total.

## Mecanismo de Validações e Exceções
O pacote de exceções introduz a classe ValorInvalidoException, uma exceção verificada que obriga o tratamento explícito no fluxo da aplicação caso uma transação seja instanciada ou alterada com valor menor ou igual a zero. Complementarmente, restrições de negócio para campos textuais impedem descrições nulas ou vazias por meio do lançamento da exceção IllegalArgumentException.

## Fluxo de Execução
A integração de todas as peças acontece na classe executável Sistema. Nela, o processamento ocorre através de uma coleção genérica, utilizando validação dinâmica de tipos em tempo de execução para verificar a tributação e disparar os comportamentos polimórficos de cada entidade. A rotina principal implementa blocos estruturados de captura de erros, garantindo que operações com dados inconsistentes sejam tratadas de forma resiliente, exibindo mensagens amigáveis no console sem interromper abruptamente o ciclo de vida do programa.

## Próximos Passos
Sendo parte de uma série contínua de atividades acadêmicas, o repositório será gradativamente atualizado. As etapas posteriores expandirão os casos de uso de negócio, introduzirão persistência de dados e aprofundarão práticas avançadas de engenharia de software ao longo do andamento do curso.

## Autor
Desenvolvido por Matheus Oliveira (ollivmathe).
