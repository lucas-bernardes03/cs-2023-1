# Tarefa 002 - 17/04/2022 - Pesquisa Rest API

## 1. Elaborar uma pesquisa sobre o tema "_Rest API_".

## 2. Elaborar um texto **no formato markdown** de pelo menos uma página, descrito com suas próprias palavras, destacando:
- As definições dos conceitos envolvidos;
- As principais características deste conceito (pelo menos umas cinco).

<br>

# ***Pesquisa:***

## **O que é REST API?**
 - REST (Representational State Transfer) é um estilo de arquitetura WEB importante no desenvolvimento de sistemas na internet. No estilo REST, a implementação do cliente e do servidor pode ser feita de forma independente, sem que cada um conheça o outro. Isso significa que o código do lado do cliente pode ser alterado a qualquer momento, sem afetar a operação do servidor.

 - A utilização da arquitetura REST, portanto, permite a comunicação entre aplicações. Ao abrir o navegador, ele estabelece uma conexão TCP/IP com o servidor de destino e envia uma requisição GET HTTP, com o endereço buscado. O servidor, então, interpreta a requisição, retornando com uma resposta HTTP ao navegador. Essa resposta pode ser completa, com representações em formato HTML, ou apresentar erro, afirmando que o recurso solicitado não foi encontrado.

 - Nesta arquitetura ou modelo, cliente-servidor ajuda na separação de responsabilidades entre a interface do usuário e o armazenamento de dados. Ou seja, quando uma solicitação REST é realizada, o servidor envia uma representação dos estados que foram requeridos. Não há limite superior no número de clientes que podem ser atendidos por um único servidor. Também não é obrigatório que o cliente e o servidor residam em sistemas separados. 

 <br>

## **Como as requisições HTTP funcionam?**
 - A comunicação cliente-servidor é estabelecida através de requisições feitas pelo cliente com intuito de ler, enviar ou modificar dados. O servidor recebe a requisição e devolve uma resposta apropriada. **Uma requisição é constituída por:**
   
    - **Um método HTTP**: que define que tipo de operação o servidor vai realizar;
    - **Um header**: com o cabeçalho da requisição que passa informações sobre a requisição;
    - **Um path**: uma rota para o servidor, como por exemplo https://github.com/lucas-bernardes03
    - **Informação no corpo da requisição**: sendo esta informação opcional.
 
 <br>

 -  **Métodos HTTP:**
    - **GET:** é o método mais comum, geralmente é usado para solicitar que um servidor envie um recurso;
    - **POST:** foi projetado para enviar dados de entrada para o servidor. Na prática, é frequentemente usado para suportar formulários HTML;
    - **PUT:** edita e atualiza documentos em um servidor;
    - **DELETE:** que como o próprio nome já diz, deleta certo dado ou coleção do servidor.

 <br>

 - Cada resposta que a aplicação REST retorna, é enviado um código definindo o status da requisição. **Algumas respostas do servidor:**
    - **200** (OK), requisição atendida com sucesso;
    - **201** (CREATED), objeto ou recurso criado com sucesso;
    - **204** (NO CONTENT), objeto ou recurso deletado com sucesso;
    - **400** (BAD REQUEST), ocorreu algum erro na requisição (podem existir inumeras causas);
    - **404** (NOT FOUND), rota ou coleção não encontrada;
    - **500** (INTERNAL SERVER ERROR), ocorreu algum erro no servidor.

## **Principais características da arquitetura REST**
 - ## Stateless:
    -  Os sistemas que seguem o paradigma REST são stateless, o que pode ser traduzido livremente como “sem estado”. Isso significa que o servidor não precisa saber nada sobre o estado em que o cliente se encontra e vice-versa.

    - Dessa forma, tanto o servidor quanto o cliente podem compreender qualquer mensagem recebida, mesmo sem ver as anteriores. Isso acontece porque o sistema não utiliza comandos, mas os substantivos da Web, que descrevem qualquer arquivo que você precise armazenar ou utilizar.

    - Cada requisição do cliente para o servidor é uma transação independente, sem dependência de requisições anteriores. Isso permite que os servidores sejam facilmente escaláveis, já que não precisam armazenar informações de estado do cliente.

    <br>

 - ## Cacheable: 
    - As restrições de cache requerem que as informações contidas em uma resposta a uma solicitação sejam, diretamente ou não, definidas como cacheáveis ou não cacheáveis. Caso uma resposta for armazenável em cache, então, é dado ao cliente o direito de utilizar novamente esses dados para atividades similares no futuro.

    - A vantagem de acrescentar restrições de cache é que elas têm o potencial de eliminar parcial ou completamente algumas interações, melhorando a eficiência, a escalabilidade e o desempenho percebido pelo usuário. Isso torna a experiência muito mais fluida e eficiente. 

    <br>

 - ## Transferência de Dados:
    - As representações de estado dos recursos são transferidas entre o cliente e o servidor em formato representacional, como por exemplo JSON (JavaScript Object Notation) ou XML (eXtensible Markup Language), facilitando a interoperabilidade entre diferentes sistemas.

    <br>

 - ## Interfaces Uniforme:
    - Para interagirmos com os recursos que aprendemos no tópico anterior, o HTTP nos fornece uma interface de operações padronizadas, permitindo que possamos criar, atualizar, pesquisar, remover e executar operações sob um determinado recurso.

    - Além de operações padronizadas, o HTTP fornece um conjunto de respostas para que os clientes (navegadores, APIs, etc) possam saber, de forma adequada, como agir perante uma determinada resposta. A fim de obter uniformidade na interface, são necessárias múltiplas restrições para orientar o comportamento dos componentes. REST é definido por quatro fatores:

        - ***Identificação de recursos***
        - ***Gerenciamento de recursos por meio de representações***
        - ***Mensagens auto-descritivas***
        - ***Hipermídia***
 
    <br>

 - ## Sistema em Camadas:
    - Para melhorar ainda mais o desempenho para as atuais e crescentes exigências da Internet, é possível acrescentar restrições de sistema por camadas. Assim, a arquitetura é constituída por camadas que seguem uma ordem hierárquica. Isso restringe o comportamento dos elementos, de modo que cada um deles só possa “enxergar” a camada com que estão interagindo no momento, possibilitando a evolução e manutenção de sistemas complexos.

    <br>

 - ## Segurança:
    - A arquitetura REST permite a utilização de protocolos de segurança, como HTTPS (HTTP Secure), Autenticação HTTP basic, Autenticação HTTP Digest, Autenticação através de certificados, Token-based authorization, OAuth, entre outros.

    <br>

 - ## Padrão de URIs:
    - Os recursos da API REST são identificados por URIs (Uniform Resource Identifiers), que são URLs que representam de forma única cada recurso. Isso permite que os recursos sejam facilmente acessíveis e referenciados.