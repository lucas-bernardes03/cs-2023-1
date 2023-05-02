### Tarefa 006: Git Branching - 28/04/2023

1. Qual o nome do branch padrão do Git?  
   - "master"
<br><br>

2. O que o comando **<code>git branch nome</code>** realiza?  
   - Cria uma branch com o nome "nome"
<br><br>

3. Como criar um branch a partir de um commit específico?  
   - `git branch NOME_DA_BRANCH HASH_COMMIT`
<br><br>

4. Em um repositório, qual o efeito do comando **<code>git checkout -b bugfix/234</code>**?  
   - Cria uma branch com o nome "bugfix/234" e muda o HEAD para ela.
<br><br>

5. Qual o comando para se alternar para um branch de nome **experimento2**?  
   - `git checkout experimento2`
<br><br>

6. Em um repositório com dois branches, **b1** e **b2**, onde b1 é o corrente, qual o efeito do comando **<code>git branch</code>**?  
   - Lista todos os branches do repositório local, ou seja, b1 e b2.
<br><br>

7. O que o comando **<code>git checkout -b</code>** nome faz?  
   - Cria uma branch com o nome "nome" e muda o HEAD para ela.
<br><br>

8. Qual a função do <code>**comando git branch -d teste</code>**?  
   - Deleta a branch "teste"
<br><br>
   

9. Durante o desenvolvimento de um software é comum, por exemplo, utilizar um novo recurso por meio de experimentação. Talvez uma nova tecnologia, uma nova biblioteca que pode ser útil ao que está em desenvolvimento, ou até mesmo uma nova versão de um produto já empregado. Para que o uso deste novo recurso não interfira com o que é considerado pronto, um branch pode ser criado para a experimentação. Código que for criado para a experimentação existirá apenas no branch criado. Se eventualmente o experimento demonstrar um resultado satisfatório, as alterações realizadas no branch poderão ser incorporadas no que é considerado pronto, ou seja, no branch principal (master). Esta última ação é conhecida por merge. Neste item, crie uma sequência de comandos que simula um caso simples de criação e uso seguido de merge empregando um branch para ilustrar uma experimentação conforme acima. A sequência deve incluir, obrigatoriamente: (a) criação de um ou mais branches; (b) chaveamento para pelo menos dois branches e (c) merge.  
   - `git branch experimento`  
   - `git checkout experimento`  
   - (realizar a experimentação)  
   - `git add .`
   - `git commit -m "mensagem"`
   - `git checkout master`  
   - `git merge experimento`

