# Soul API
## Nossa Proposta 
Nossa solução que permite a otimização do processo do atendimento ao cliente da empresa Plusoft, fornecendo um atendimento personalizado e eficiente, ajudando a melhorar a experiência e aumentar a satisfação do cliente. A solução será um chatbot personalizado com integração com a API OpenIA. O chatGPT irá gerar sugestões para os clientes baseado no histórico de pedidos e conversas.


## Lista de endpoints iniciais

-`/chat`
> METHOD: GET
> 
> HEADER:
> Content-Type: application/json
> Authorization: Bearer {chave de identificação do usuário da Soul API}
>
>---
>
>200 OK - caso exista chat ativo;
>204 No Content - caso não exista chat ativo;
>401 Unauthorized - caso não esteja logado;
>500 Internal Server Error - caso dê qualquer erro inesperado.
>
>---
>
>Descrição:
>Recupera um chat ativo, caso exista.

-`/chat`;
> METHOD: POST
> 
> HEADER:
> Content-Type: application/json
> Authorization: Bearer {chave de identificação do usuário da Soul API}
>
> BODY:
> {
> &nbsp; &nbsp;  "messages": [
> &nbsp; &nbsp; &nbsp; &nbsp;    { "role": {emissor da mensagem}, "content": {conteúdo} },
> &nbsp; &nbsp; &nbsp; &nbsp;    { "role": {emissor da mensagem}, "content": {conteúdo} },
> &nbsp; &nbsp; &nbsp; &nbsp;    { "role": {emissor da mensagem}, "content": {conteúdo} },
> &nbsp; &nbsp; &nbsp; &nbsp;    ...
> &nbsp; &nbsp;  ]
> }
>
>---
>
>200 OK - caso a mensagem tenha sido enviada e respondida;
>400 Bad Request - caso dê algum erro na emissão do cabeçalho ou do corpo da requisição;
>401 Unauthorized - caso não esteja logado;
>500 Internal Server Error - caso dê qualquer erro inesperado e quando a OpenAI API responder com um código 500.
>
>---
>
>Descrição:
>Servirá como intermediário entre o usuário e a OpenAI API.

-`/login`;
 > METHOD: POST
> 
> HEADER:
> Content-Type: application/json
>
> BODY:
>{
>&nbsp; &nbsp; "username": "exemplo",
>&nbsp; &nbsp; "password": "senha123"
> }
>
>---
>
>200 OK - caso exista um usuário com o nome e senha fornecidos;
>400 Bad Request - caso dê algum erro na emissão do cabeçalho ou do corpo da requisição e não exista um usuário com o nome e senha fornecidos;
>500 Internal Server Error - caso dê qualquer erro inesperado.
>
>---
>
> Descrição:
> Este endpoint permite que o usuário faça login em sua conta.

-`/recuperar-senha`
> METHOD: POST
> 
> HEADER:
> Content-Type: application/json
>
> BODY:
> {
> &nbsp; &nbsp;  "email": "exemplo@example.com"
> }
>
>---
>
>200 OK - caso o email de recuperação tenha sido enviado;
>400 Bad Request - caso dê algum erro na emissão do cabeçalho ou do corpo da requisição e o email de recuperação não tenha sido enviado;
>500 Internal Server Error - caso dê qualquer erro inesperado.
>
>---
>
>Descrição:
>Permite que um usuário solicite a recuperação de sua senha

-`/cadastro`;
> METHOD: POST
> 
> HEADER:
> Content-Type: application/json
>
> BODY:
> {
> &nbsp; &nbsp;  "name": "Fulano de Tal",
> &nbsp; &nbsp;  "username": "exemplo",
> &nbsp; &nbsp; "email": "exemplo@example.com",
> &nbsp; &nbsp; "password": "senha123",
> &nbsp; &nbsp; "phone": "+XX (XX) XXXXX-XXXX"
> }
>
>---
>
>200 OK - caso os dados sejam válidos e a conta tenha sido criada com sucesso;
>400 Bad Request - caso dê algum erro na emissão do cabeçalho ou do corpo da requisição e a conta não tenha sido criada;;
>500 Internal Server Error - caso dê qualquer erro inesperado.
>
>---
>
>Descrição:
>Permite que o usuário crie uma nova conta em sua plataforma.

-`/perfil/{id}`
> METHOD: GET
> 
> HEADER:
> Content-Type: application/json
> Authorization: Bearer &lt;chave de identificação do usuário da Soul API&gt;
>
>
>---
>
>200 OK - caso o usuário exista;
>400 Bad Request - caso o usuário não exista;
>401 Unauthorized - caso não esteja logado;
>500 Internal Server Error - caso dê qualquer erro inesperado.
>
>---
>
>Descrição:
>Mostra as informações pessoais do usuário em sua conta.


-`/perfil/{id}`
> METHOD: PUT
> 
> HEADER:
> Content-Type: application/json
> Authorization: Bearer &lt;chave de identificação do usuário da Soul API&gt;
>
> BODY:
> {
> &nbsp; &nbsp;  "name": "Beltrano de Tal",
> &nbsp; &nbsp;  "username": "novo_exemplo",
> &nbsp; &nbsp; "password": "nova_senha123",
> &nbsp; &nbsp; "phone": "+YY (YY) YYYYY-YYYY"
> }
>
>---
>
>200 OK - caso os dados sejam válidos e a conta tenha sido alterada com sucesso;
>400 Bad Request - caso dê algum erro na emissão do cabeçalho ou do corpo da requisição e a conta não tenha sido alterada;
>401 Unauthorized - caso não esteja logado;
>500 Internal Server Error - caso dê qualquer erro inesperado.
>
>---
>
>Descrição:
>Permite que o usuário edite as informações pessoais em sua conta.

-`/configuracao/{id do usuário}`
> METHOD: GET
> 
> HEADER:
> Content-Type: application/json
> Authorization: Bearer &lt;chave de identificação do usuário da Soul API&gt;
>
>---
>
>200 OK - caso as configurações tenham sido buscadas;
>400 Bad Request - caso dê algum erro na emissão do cabeçalho ou do corpo da requisição e as configurações não tenham sido buscadas;
>401 Unauthorized - caso não esteja logado;
>500 Internal Server Error - caso dê qualquer erro inesperado.
>
>---
>
>Descrição:
>Busca as configurações de usuário.

-`/configuracao/{id do usuário}`
> METHOD: PUT
> 
> HEADER:
> Content-Type: application/json
> Authorization: Bearer &lt;chave de identificação do usuário da Soul API&gt;
>
> BODY:
> {
> &nbsp; &nbsp;  "settings1": "valor1",
> &nbsp; &nbsp;  "settings2": "valor2"
> }
>
>---
>
>200 OK - caso as configurações tenham sido aplicadas;
>400 Bad Request - caso dê algum erro na emissão do cabeçalho ou do corpo da requisição e as configurações não tenham sido aplicadas;
>401 Unauthorized - caso não esteja logado;
>500 Internal Server Error - caso dê qualquer erro inesperado.
>
>---
>
>Descrição:
>Permite que o usuário edite as configurações de usuário.

-`/suporte`
> METHOD: GET
> 
> HEADER:
> Content-Type: application/json
> Authorization: Bearer &lt;chave de identificação do usuário da Soul API&gt;
>
>---
>
>200 OK - caso as solicitações de suporte tenha sido listadas com sucesso;
>204 No Content - caso não exista solicitações de suporte;
>400 Bad Request - caso dê algum erro na emissão do cabeçalho ou do corpo da requisição;
>401 Unauthorized - caso não esteja logado ou não tenha permissão para acessar o recurso;
>500 Internal Server Error - caso dê qualquer erro inesperado.
>
>---
>
>Descrição:
>Permite que o usuário crie solicitações de suporte.

-`/suporte`
> METHOD: POST
> 
> HEADER:
> Content-Type: application/json
> Authorization: Bearer &lt;chave de identificação do usuário da Soul API&gt;
>
> BODY:
> {
> &nbsp; &nbsp;  "name": "Fulano de Tal",
> &nbsp; &nbsp;  "email": "exemplo@example.com",
> &nbsp; &nbsp; "message": "Mensagem de solicitação",
> &nbsp; &nbsp; "solved": false,
> }
>
>---
>
>200 OK - caso a solicitação de suporte tenha sido criada com sucesso;
>400 Bad Request - caso dê algum erro na emissão do cabeçalho ou do corpo da requisição e a solicitação não tenha sido criada;
>401 Unauthorized - caso não esteja logado;
>500 Internal Server Error - caso dê qualquer erro inesperado.
>
>---
>
>Descrição:
>Permite que o usuário crie solicitações de suporte.

-`/feedback`
> METHOD: GET
> 
> HEADER:
> Content-Type: application/json
> Authorization: Bearer &lt;chave de identificação do usuário da Soul API&gt;
>
> BODY:
> {
> &nbsp; &nbsp;  "name": "Fulano de Tal",
> &nbsp; &nbsp;  "email": "exemplo@example.com",
> &nbsp; &nbsp; "message": "Mensagem de feedback"
> }
>
>---
>
>200 OK - caso a mensagem de feedback tenha sido enviada com sucesso;
>204 No Content - caso não exista mensagens de feedback;
>400 Bad Request - caso dê algum erro na emissão do cabeçalho ou do corpo da requisição;
>401 Unauthorized - caso não esteja logado ou não tenha acesso ao recurso;
>500 Internal Server Error - caso dê qualquer erro inesperado.
>
>---
>
>Descrição:
>Permite que o usuário envie feedbacks.

-`/feedback`
> METHOD: POST
> 
> HEADER:
> Content-Type: application/json
> Authorization: Bearer &lt;chave de identificação do usuário da Soul API&gt;
>
> BODY:
> {
> &nbsp; &nbsp;  "name": "Fulano de Tal",
> &nbsp; &nbsp;  "email": "exemplo@example.com",
> &nbsp; &nbsp; "message": "Mensagem de feedback"
> }
>
>---
>
>200 OK - caso a mensagem de feedback tenha sido enviada com sucesso;
>400 Bad Request - caso dê algum erro na emissão do cabeçalho ou do corpo da requisição e a mensagem não tenha sido enviada;
>401 Unauthorized - caso não esteja logado;
>500 Internal Server Error - caso dê qualquer erro inesperado.
>
>---
>
>Descrição:
>Permite que o usuário envie feedbacks.

-`/planos`
> METHOD: GET
> 
> HEADER:
> Content-Type: application/json
> Authorization: Bearer &lt;chave de identificação do usuário da Soul API&gt;
>
>---
>
>200 OK - caso os planos existentes tenham sido listados com sucesso;
>204 No Content - caso não exista algum plano existente;
>400 Bad Request - caso dê algum erro na emissão do cabeçalho ou do corpo da requisição;
>401 Unauthorized - caso não esteja logado ou não tenha permissão para acessar o recurso;
>500 Internal Server Error - caso dê qualquer erro inesperado.
>
>---
>
>Descrição:
>Retorna lista de planos disponíveis 


## OpenAI API

O único endpoint necessário para comunicar nossa API com a API da OpenAI no contexto de uma conversa por meio de mensagens de texto é:
 `https://api.openai.com/v1/chat/completions`
> Informações detalhadas:
> 
> METHOD: POST;
> 
> HEADER:
> "Content-Type: application/json"
> Authorization: Bearer &lt;chave de identificação do usuário da OpenAI&gt;
> 
> BODY:
> {
> &nbsp; &nbsp;  "model": &lt;modelo a ser usado&gt;,
> &nbsp; &nbsp;  "messages": [
> &nbsp; &nbsp; &nbsp; &nbsp;    { "role": &lt;emissor da mensagem&gt;, "content": &lt;conteúdo da mensagem&gt; },
> &nbsp; &nbsp; &nbsp; &nbsp;    { "role": &lt;emissor da mensagem&gt;, "content": &lt;conteúdo da mensagem&gt; },
> &nbsp; &nbsp; &nbsp; &nbsp;    { "role": &lt;emissor da mensagem&gt;, "content": &lt;conteúdo da mensagem&gt; },
> &nbsp; &nbsp; &nbsp; &nbsp;    ...
> &nbsp; &nbsp;  ]
> }
>
>200 OK - caso sucedido;
>500 Internal Server Error - caso dê qualquer erro.
