# Introdução (9h ~ 10h)

## Apresentação e Boas Vindas (5min)

## Dinâmica em Grupo (30min)

> Incluir instrutores e monitores

- Formem uma linha ordenados por nome alfabeticamente
- Formem duplas e descubram uma curiosidade de sua dupla
- Apresentem o colega da dupla

## Setup das Máquinas (15min)

- Login e senha dos notes emprestados
- SSID e senha do WIFI dedicado
- Validação de usuário admin de todos

## Apresentação do Cronograma (5min)

## Sobre o Treinamento (5min)

1. **Como serão as aulas?**

   <p>Todas presenciais. Focaremos sempre no processo em 3 etapas: explicação teórica, com exemplo prático; exercício em aula, com apoio de instrutores e monitores; e por último, exercício para ser feito fora do horário de aula.</p>

1. **Como serão as exercícios?**

   <p>Parte em aula, parte em casa. A parte dos exercícios destinada a fazer em casa não deverá seguir um cronograma rígido de entrega, devendo o participante gerenciar o seu tempo da forma que julgar pertinente. Todos exercícios terão como data limite de entrega, a próxima quinta-feira até às 23h59. O participante ainda poderá submeter os trabalhos após esse período, mas não é garantido que será avaliado</p>

1. **Como serão as avaliações?**

   <p>Não há testes. Não há provas. Não há trabalhos. Não há notas. Apenas serão avaliados os exercícios entregues e o comportamento em sala de aula aderente à cultura da empresa. Após o último dia de aula, os participantes serão desafiados com uma entrega maior, que será explicada em detalhes no dia.</p>

1. **O conteúdo das aulas ficará disponível?**

   <p>Sim, durante todo o treinamento. Porém, o conteúdo de cada aula só ficará disponível após o dia da respectiva aula, ou seja, no primeiro dia apenas a aula 01 estará disponível</p>

1. **Como devo submeter os exercícios?**
   <p>Usaremos o GitHub durante todo o treinamento. Se você não possui uma conta ainda, crie agora mesmo. O candidato deverá criar um repositório com o nome `cwi-reset-2020-01`, pessoal e público (criaremos juntos na primeira aula).</p>

> Antes de mais nada pedir para enviarem pro instrutor do dia, pelo Slack, até onde estudaram no guia que fora enviado no e-mail com as dicas de estudos.

# Conteúdo

## Setup Ambiente

- Instalar JDK 8
- Instalar Maven
- Instalar Intellij Community Edition
- Instalar Git
- Criar repositório do GitHub
- Clonar repositório local

## Git Básico

### O que é

Ferramenta de versionamento distribuído de código. Permite salvar o código produzido e integrar o trabalho de diferentes colaboradores, permitindo criar diferentes versões do mesmo código e uni-las quando necessário.

### Remoto vs Local

O código fica salvo tanto no servidor central quanto distribuído na máquina de cada desenvolvedor. Todo mundo tem uma cópia do código em sua máquina. Existem comandos que permitem atualizar a versão local trazendo as novidades do servidor ou ainda atualizar o servidor com as novas alterações feitas na máquina do desenvolvedor.

### Comandos básicos

- `git clone <url-repositório>` => `git clone https://github.com/robsonrosa/meu-projeto.git`

  > Faz uma cópia do repositório remoto para a máquina do desenvolvedor

- `git add <caminho>` => `git add .`

  > Seleciona quais arquivos alterados o desenvolvedor devem ser considerados para enviar ao servidor. O ponto indica "todos alterados"

- `git commit -m "<mensagem>"` => `git commit -m "Cria a nova tela de cadastro de produtos"`

  > Empacota as alterações selecionadas com o `git add` e cria um "checkpoint", ou seja, um conjunto de alterações que desempenham uma função

- `git push`

  > Submete todos os commits feitos anteriormentes, enviando-os ao servidor remoto para que fique disponível para os demais desenvolvedores

- `git pull`
  > Atualiza o código local, trazendo as alterações feitas no servidor remoto por outros desenvolvedores

### Dica

Quem usa notebook emprestado durante o treinamento deverá seguir um processo simples toda vez que for iniciar algum trabalho. Como terá um computador em casa e outro no treinamento, ambos deverão estar atualizados. Então, assim que iniciar os trabalhos em uma das máquinas, deverá realizar o `git pull` pra baixar as alterações feitas na outra máquina e submetidas pro servidor remoto. Isso significa que ao terminar as atividades, deverá realizar o `git push` para que as alterações fiquem online no servidor. Caso esqueça do push, as alterações ficarão apenas na máquina em que foram desenvolvidas.

## Programação Básica

### Hello World

Vamos construir juntos nossa primeira aplicação Java Console

### Variáveis

- Como o nome já diz, são símbolos cujo o valor pode variar
- No Java as variáveis são tipadas, ou seja, trabalham com dados do tipo especificado em sua declaração

### Comentários

- Adicionar alguma informação que não será interpretada pelo compilador

```java
// comentário em uma linha
// comentário em outra linha
/*
  bloco de comentário
  nada aqui será considerado
*/
```

### Tipos de Dados

#### Tipos Primitivos

- int => 1
- float => 1.23
- boolean => true | false
- void => nada

#### Outros Tipos de Dados

- String
- Integer
- Double
- Boolean
- BigDecimal
- LocalDate
- LocalTime

### Operadores

#### Operadores Aritméticos

| Operador | Descrição     |  Cenário | Resultado |
| :------: | ------------- | -------: | :-------- |
|   `+`    | Soma          | `10 + 2` | `12`      |
|   `-`    | Subtração     | `10 - 2` | `8`       |
|   `*`    | Multiplicação | `10 * 2` | `20`      |
|   `/`    | Divisão       | `10 / 2` | `5`       |
|   `%`    | Módulo        | `10 % 2` | `0`       |

#### Operadores de Atribuição

| Operador | Descrição |         Cenário | Resultado                            |
| :------: | --------- | --------------: | :----------------------------------- |
|   `=`    | Simples   | `contador = 10` | `contador` agora possui o valor `10` |

#### Operadores de Incremento

| Operador | Descrição     |          Cenário | Resultado                              |
| :------: | ------------- | ---------------: | :------------------------------------- |
|   `++`   | Incremento    |     `contador++` | o mesmo que `contador = contador + 1`  |
|   `--`   | Decremento    |     `contador--` | o mesmo que `contador = contador - 1`  |
|   `+=`   | Soma          | `contador += 10` | o mesmo que `contador = contador + 10` |
|   `-=`   | Subtração     | `contador -= 10` | o mesmo que `contador = contador - 10` |
|   `*=`   | Multiplicação | `contador *= 10` | o mesmo que `contador = contador * 10` |
|   `/=`   | Divisão       | `contador /= 10` | o mesmo que `contador = contador / 10` |
|   `%=`   | Módulo        | `contador %= 10` | o mesmo que `contador = contador % 10` |

#### Operadores de Igualdade

| Operador | Descrição    | Cenário 1 | Resultado 1 |  Cenário 2 | Resultado 2 |  Cenário 3 | Resultado 3 |
| :------: | ------------ | --------: | :---------- | ---------: | :---------- | ---------: | :---------- |
|   `==`   | Igual a      | `9 == 10` | `false`     | `10 == 10` | `true`      | `11 == 10` | `false`     |
|   `!=`   | Diferente de | `9 != 10` | `true`      | `10 != 10` | `false`     | `11 != 10` | `true`      |

#### Operadores Relacionais

| Operador | Descrição        | Cenário 1 | Resultado 1 |  Cenário 2 | Resultado 2 |  Cenário 3 | Resultado 3 |
| :------: | ---------------- | --------: | :---------- | ---------: | :---------- | ---------: | :---------- |
|   `>`    | Maior que        |  `9 > 10` | `false`     |  `10 > 10` | `false`     |  `11 > 10` | `true`      |
|   `<`    | Menor que        |  `9 < 10` | `true`      |  `10 < 10` | `false`     |  `11 < 10` | `false`     |
|   `>=`   | Maior ou igual a | `9 >= 10` | `false`     | `10 >= 10` | `true`      | `11 >= 10` | `true`      |
|   `<=`   | Menor ou igual a | `9 <= 10` | `true`      | `10 <= 10` | `true`      | `11 <= 10` | `false`     |

#### Operadores Lógicos

|         Operador          | Descrição                                      |                           Cenário 1 | Resultado 1 |                            Cenário 2 | Resultado 2 |                             Cenário 3 | Resultado 3 |
| :-----------------------: | ---------------------------------------------- | ----------------------------------: | :---------- | -----------------------------------: | :---------- | ------------------------------------: | :---------- |
|            `!`            | Negação - inverte o valor booleano             |                            `!false` | `true`      |                              `!true` | `false`     |                         `!(10 == 10)` | `false`     |
|           `&&`            | E lógico - true se ambos argumentos forem true |                      `true && true` | `true`      |                      `true && false` | `false`     |                      `false && false` | `false`     |
| <code>&#124;&#124;</code> | OU lógico - true se um dos argumentos for true | <code>true &#124;&#124; true</code> | `true`      | <code>true &#124;&#124; false</code> | `true`      | <code>false &#124;&#124; false</code> | `false`     |

## Orientação a Objetos

### Conceito

- Representar elementos em termos de um objeto
- Aproximar o sistema que está sendo criado ao mundo real
- Objetos têm características e ações (assim como na vida real)
- Melhor legibilidade
- Consequentemente, maior manutenibilidade
- Maior reaproveitamento dos componentes do sistema

### Classes

> Uma espécie de “planta baixa” para a criação de objetos

- Possui a definição de atributos que um objeto deverá possuir
- Possui a definição de métodos que um objeto deverá possuir
- Padrão de nomenclatura `UpperCamelCase`

```java
class Mago {

}
```

#### Atributos

- As caracterísitcas de um objeto
- Cada atributo possui um tipo de dado
- Padrão de nomenclatura `lowerCamelCase`
- Nomes claros e objetivos, sem abreviações

```java
class Mago {

  String nome;

  int nivel;

  int vida;

  int mana;

  float poder;

  boolean descansando;

}
```

#### Métodos

- As ações de um objeto
- Um método pode possuir argumentos (parâmetros de entrada)
- Um método pode possuir um resultado
- Um método deve possuir um corpo, ou seja, o trecho de código que será executado quando o método for invocado
- Tanto o retorno quanto os argumentos devem ter tipos definidos

```java
class Mago {

  int prepararMagias() {
    ...
    return numeroMagiasPreparadas;
  }

  void lancarMagia(String nomeMagia) {
    ...
  }

  void descansar() {
    this.descansando = true;
  }

}
```

#### Construtor

- É um tipo especial de método
- Uma classe pode ter vários construtores diferentes
- Construtores podem ter argumentos
- Construtores não tem um retorno
- Ele é invocado automaticamente sempre que um objeto for criado (instanciado)
- Quando nenhum construtor é declarado, um `construtor padrão` será utilizado (não possui argumentos nem corpo)

```java
class Mago {

  String nome;

  int nivel;

  int vida;

  int mana;

  float poder;

  boolean descansando;

  /*
  construtor default (não precisa ser declarado)
  Mago() {
  }
  */

  Mago(String nome, int vida, int mana, float poder) {
    this.nome = nome;
    this.vida = vida;
    this.mana = mana;
    this.poder = poder;
    this.nivel = 1;
  }

}
```

#### Instanciando um objeto

```java
// Mago é o nome da classe | gandalf é o nome do objeto
Mago gandalf = new Mago("Gandalf", 100, 150, 200f);
// Mago é o nome da classe | presto é o nome do objeto
Mago presto = new Mago("Presto", 50, 20, 1000f);
// Nesse ponto, existe uma classe e dois objetos
```

## Tipo Valor vs Tipo Referência

### Tipo Valor

- Tipos valor existem por si só e são únicos, gerando cópias quando atribuídos à novas variáveis. Tipos valor são tipos primitivos
- Os tipos primitivos são boolean, byte, char, short, int, long, float e double
- As variáveis de instância de tipo primitivo são inicializadas por padrão, as variáveis dos tipos byte, char, short, int, long, float e double são inicializadas como 0, e as variáveis do tipo boolean são inicializadas como false.

```java
int a = 1;
int b = a;

a = 2;

// a vale {2}
// b vale {1}
```

### Tipo Referência

- Ao ser criado, ele aponta para uma referência de memória onde está o conteúdo da variável
- Assinar esta variável à outra do mesmo tipo apenas cria mais um ponteiro para o mesmo conteúdo

```java
Mago gandalf = new Mago("Gandalf", 100, 150, 200f);
Mago outroGandalf = gandalf;

// gandalf.descansando é {false}
// outroGandalf.descansando é {false}

gandalf.descansar();

// gandalf.descansando é {true}
// outroGandalf.descansando é {true}
```

### Nulo

Variáveis do tipo referência podem não possuir uma referência (ponteiro), nesse caso elas apontam para o nada. Nesse caso dizemos que o valor dela é nulo (`null`).

```java
Mago gandalf = new Mago("Gandalf", 100, 150, 200f);
Mago outroMago; // se nenhuma referência foi atribuída a essa variável, ela é nula

gandalf.descansar(); // ok
outroMago.descansar(); // nok - não podemos executar uma ação em uma variável nula - isso irá gerar o erro NullPointerException (vão ver muito disso)
outroMago.descansando; // nok - também não podemos acessar um atributo de um objeto nulo pelo mesmo motivo

```

## Modificadores de Fluxo de Execução

### Condicionais

Permite que alteremos o fluxo de execução baseado em uma determinada condição. Ou seja, podemos definir que um trecho do código só será executado se determinada variável possui um valor específico. Essa condição sempre retorna um valor booleano (ou verdadeiro ou falso). Os condicionais `if` possuem uma condição e um corpo.

```java
// a condicao sempre será booleana
if (mana > 0) {
  lancarMagia();
}

boolean possuiMana = mana > 0 // guardo o resultado da comparação (true ou false) na variável "possuiMana"
// esse if possui o mesmo comportamento do anterior, porem uma melhor legibilidade (lê-se "se possui mana, então lançar magia")
if (possuiMana) {
  lancarMagia();
}
```

### Decisores

Permite dividir o fluxo de execução em várias opções de acordo com o valor de uma variável. Funciona como vários `if` encadeados. Para isso usamos o `switch` que recebe um argumento e possui n fluxos possíveis de acordo com o valor do argumento. Cada fluxo deve ser definido usando `case <valor>:` terminando com `break`. Existe ainda um fluxo padrão para o caso do valor da variável não coincidir com nenhum cenário planejado, nesse caso usamos o `default`.

```java
switch(magia) {
  case "dardos místicos":
    dano = 20;
    mana -= 10;
    break;

  case "flecha ácida de Melf":
    dano = 80;
    mana -= 30;
    break;

  case "relâmpagos":
    dano = 50;
    mana -= 20;
    break;

  default:
    dano = 0;
}
```

> Lembrando que em OO tudo deve ser representado por objetos, logo, a magia também deveria ser um objeto.

### Enum

TODO: conteúdo

### Coleções

TODO: conteúdo

### Data e Hora

TODO: conteúdo

### Tratamento de exceções

TODO: conteúdo

## Mais Sobre Orientação a Objetos

> Achou que o assunto havia acabado? Achou errado.

### Herança

- Mecanismo da orientação a objetos que permite classes já existentes (superclasses), serem estendidas por classe filhas (subclasses).
- As subclasses herdam todas características da superclasse, podem alterar comportamentos existentes e são mais específicas que ela, tendo características mais especializadas que a superclasse.
- Herança faz com que exista um nível muito maior de acoplamento entre as classes, uma classe passa a depender da outra. Faz com que o programador precise conhecer todo o código da classe mãe e das classes filhas.

> Regra básica: usa-se herança quando se pode dizer que a subclasse É UM TIPO DE superclasse. Exemplo: Druida é um tipo de Sacerdote.
> Dica importante: nunca use herança apenas para reaproveitar atributos. Isso pode não fazer muito sentido agora, mas um dia vai ficar mais claro.

```java
// superclasse
class Sacerdote {

  int mana;
  float poder;

  Sacerdote(int mana, float poder) {
    this.mana = mana;
    this.poder = poder;
  }

  void usarPoderDivino(String poderDivino) {
    ...
  }

}

// subclasse
class Druida extends Sacerdote {

  // método específico do Druida
  void metamorfosear(String animal) {
    ...
  }

  // possui também o método usarPoderDivino e o construtor do Sacerdote
}

// outra subclasse
class Clerigo extends Sacerdote {

  // método específico do Clerigo
  void poderDaFe() {
    ...
  }

  // possui também o método usarPoderDivino e o construtor do Sacerdote
}

Druida druida = new Druida(100, 150f);
Clerigo clerigo = new Clerigo(100, 150f);

druida.usarPoderDivino("invocar animais"); // ok - método herdado do Sacerdote
druida.metamorfosear("águia"); // ok - método específico do Druida
druida.poderDaFe(); // nok - esse método só existe para clérigo

clerigo.usarPoderDivino("curar ferimentos"); // ok - método herdado do Sacerdote
clerigo.poderDaFe(); // ok - método específico do Clerigo
clerigo.metamorfosear("águia"); // nok - esse método só existe para druida

```

### Polimorfismo

> Do dicionário: qualidade ou estado de ser capaz de assumir diferentes formas.

```java

Sacerdote sacerdoteDruida = new Druida(100, 150f);
Sacerdote sacerdoteClerigo = new Clerigo(100, 150f);

sacerdoteDruida.usarPoderDivino("invocar animais"); // ok - método herdado do Sacerdote
sacerdoteDruida.metamorfosear("águia"); // nok - a variável sacerdoteDruida é do tipo Sacerdote, então mesmo instanciando um Druida não podemos usar as habilidades dele

sacerdoteClerigo.usarPoderDivino("invocar animais"); // ok - método herdado do Sacerdote
sacerdoteClerigo.poderDaFe(); // nok - a variável sacerdoteClerigo é do tipo Sacerdote, então mesmo instanciando um Clerigo não podemos usar as habilidades dele
```

### Modificadores de Acesso

## Arquitetura Cliente-Servidor

### Conceito

### HTTP

### REST

### JSON

### PokéAPI

### Postman

## Tinder Evolution

Vamos construir uma aplicação como o Tinder, porém baseada em gostos em comum, incluindo músicas, filmes, séries, jogos, esportes, entre outros.

## Frameworks Java

A plataforma Java é extremamente rica e poderosa. Mas para que tenhamos produtividade, é necessário fazer uso de Frameworks que **abstraem** a maior parte das configurações e funcionalidades necessárias para a grande maioria das aplicações corporativas que desenvolvemos.

Dentro do ecossistema Java, para criação de aplicações WEB, alguns dos frameworks mais conhecidos e amplamente utilizados são:

- [Struts](https://struts.apache.org/)
- [JSF](https://javaee.github.io/javaserverfaces-spec/)
- [Spring](https://spring.io)
- [Play](https://www.playframework.com/)
- [jHipster](https://www.jhipster.tech/)

## [Spring](https://spring.io)

- Open source
- Criado em 2002
- Oferece diversos módulos que se acoplam ao framework principal
  - Aplicação Web (JSP / JSF)
  - Integração com bancos de dados relacionais e não relacionais
  - Integração com sistemas de Cache
  - Serviços de Mensageria
  - Logging
- Faz uso de Servlets para prover o conteúdo Web.

### Principais Características

- Inversão de Controle / Injeção de Dependências nativo
- **Convenção sobre configuração**
- Possui implementação para as necessidades mais comuns de uma aplicação Web, como:
  - Internacionalização
  - Validação
  - Parametrização
  - Segurança
  - Web Services REST e SOAP
  - Testes Unitários e de Integração

#### Material complementar

- [Spring Framework Versions](https://github.com/spring-projects/spring-framework/wiki/Spring-Framework-Versions)
- [Spring x JavaEE](http://blog.caelum.com.br/revisitando-a-batalha-spring-x-java-ee-em-detalhes/)
- [Spring Tutorial](https://www.edureka.co/blog/spring-tutorial/)

### [Spring Boot](https://spring.io/projects/spring-boot)

- Projetado para ter uma aplicação em execução o mais rápido possível
- Exige o mínimo de configurações
- Possui módulos chamados _Starter_ que fazem a configuração para que a aplicação possua as mais diversas funcionalidades:
  - Servidor Web
  - Jobs (agendamento de tarefas)
  - Conexão e acesso à bancos de dados relacionais e não relacionais
  - Segurança (Autenticação e Autorização)

#### Principais Características

- [Starters](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#using-boot-starter) que ajudam à integrar funcionalidades com o mínimo de configuração
  - **AutoConfiguration** com scan automático a partir da Main Class (pacote atual e sub pacotes)
- _Fat Jar_: Geração de apenas 1 binário auto executável, contendo toda a aplicação
- [Spring Initializr](https://start.spring.io/) para geração rápida de um projeto.

#### Material Complementar

- [Documentação da versão 2.2.0](https://docs.spring.io/spring-boot/docs/2.2.0.RELEASE/reference/htmlsingle/)
- [Configurações automáticas do Spring Boot](https://domineospring.wordpress.com/2015/11/16/configuracoes-automaticas-do-spring-boot/)

#### Frameworks alternativos ao Spring Boot

- [vertx.io](https://vertx.io/)
- [Kumuluz EE](https://ee.kumuluz.com/)
- [Oracle Helidon](https://helidon.io/#/)
- [Micronaut](https://micronaut.io/)
- [Dropwizard](https://www.dropwizard.io/)
- [Quarkus](https://quarkus.io/)
- [Microprofile](https://microprofile.io/)
- [Lagom](https://www.lagomframework.com/)

### Setup

### Packages

### Controller

### Service

### Repository

## Banco de Dados

### Select

### Insert

### Update

### Delete

## Spring Data

### Entity

### Relacionamentos

### Repositories pt.2

# Encerramento
