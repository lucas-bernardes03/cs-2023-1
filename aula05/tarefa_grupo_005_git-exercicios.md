### Tarefa Grupo 005: Git Exercícios - 28/04/2023.

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.

1. Qual o comando para obter a versão instalada do Git?  
   - git --version
<br><br>

2. Qual o efeito da execução de cada um dos comandos abaixo?  
- a. git help  
    - abre o manual do git  
- b. git help checkout  
    - abre o manual do comando checkout  
- c. git help merge  
    - abre o manual do comando merge  
- d. git init  
    - cria um repositório local  
- e. git add --all  
    - adiciona todos os arquivos na área de stage  
- f. git add -u  
    - adciona todoas as mudanças menos arquivos novos  
- g. git config -l  
    - lista as configurações do git  
- h. git mv a.txt b.txt  
    - renomei o arquivo a.txt para b.txt e adiciona na área de stage  
- i. git reset --hard  
    - deleta qualquer alteração feita tanto na área de stage quanto fora dela, voltando o- respositório para o estado do último commit  
- j. git log -27  
    - mostra os últimos 27 commits
<br><br>

3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?  
   - `git add NOME_DO_ARQUIVO_CONTEMPLADO`
   - `git commit -m "MENSAGEM_DE_COMMIT"`
<br><br>

4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?  
   - `git diff`
<br><br>

5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?  
   - `git status`
<br><br>

6. Qual o comando para efetuar um _commit_?  
   - `git commit -m "MENSAGEM_DE_COMMIT"`
<br><br>

7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?  
   - `git checkout -- NOME_DO_ARQUIVO`, caso as alterações não tenham sido adicionadas na área de stage, caso contrário o comando `git reset HEAD NOME_DO_ARQUIVO` deve ser executado antes.
<br><br>

8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.  
   - Criar um arquivo .gitignore e adicionar o nome do diretório que deve ser ignorado.
<br><br>

9. O que acontece se o seu repositório local for acidentalmente removido?  
   - Você perdera as alterações não salvas, mas é possível recuperar o diretório a partir do último commit adicionado no repositorio remoto.
<br><br>

10. Como clonar um repositório remoto?  
    - `git clone URL_DO_REPOSITORIO`
<br><br>

11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?
    - `git log --oneline`
<br><br>

12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?  
    - `.gitconfig`
<br><br>

13. Qual o comando para criar um repositório local?  
    - `git init`
<br><br>

14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?  
    - `.git`
<br><br>

15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)  
    - `git add --all`
<br><br>

16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?  
    - SHA1 é um algoritmo de hash criptográfico que gera um valor de 160 bits. O propósito é gerar um identificador único para cada commit e garantir a integridade dos dados.
<br><br>

17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?  
    - `HEAD`
<br><br>

18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?  
    - Não, apenas os arquivos que já existiam e foram modificados passam para _new file_.
<br><br>

19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?  
    **git reset --soft HEAD~1**
    **git reset --hard**  
    - O primeiro comando desfaz o último commit, mas mantém as alterações feitas no repositório
    - O segundo comando restaura o estado do repositório para o último commit.
<br><br>

20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?  
    - `git clean -f`
<br><br>

21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?  
    - `.gitignore`
<br><br>

22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?  
    - Adicionar a extensão .class no arquivo .gitignore.
<br><br>

23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.  
    - ok
<br><br>

24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
    **git shortlog -sne**?  
    - Lista os autores dos commits, ordenados pelo número de commits.
<br><br>

25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?  
    - Lista os repositórios remotos.
<br><br>

26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?  
    - `git tag`
<br><br>

27. Caso um dado repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?  
    - `git tag -l "2.0*"`
<br><br>

28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?  
    - Cria uma tag anotada com a mensagem "minha versão ouro".
<br><br>

29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?  
    - Mostra as informações da tag.
<br><br>

30. O que o comando **git push origin 3.4-gold** teria como efeito?  
    - Envia a tag para o repositório remoto.
<br><br>

31. Após executar um commit, qual o efeito de **git commit --amend**?  
    - Altera o último commit.
<br><br>

32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?  
    - Remove o arquivo x.txt do stage.
<br><br>

33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?  
    - Desfaz as alterações feitas no arquivo a.txt, restaurando o conteúdo do último commit.
<br><br>

34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?  
    - O primeiro remove o arquivo do stage, o segundo desfaz as alterações feitas no arquivo, restaurando o conteúdo do último commit.
<br><br>

35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.  
    - Entendi


