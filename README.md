
# Maior número romano em uma palavra

Desafio técnico para vaga de desenvolvedor Backend.



## Rodando localmente

Clone o projeto

```bash
  git clone https://github.com/CleuJunior/Desafio-Numero-Romano.git
```

Entre no diretório do projeto

```bash
  cd Desafio-Numero-Romano
```

Localmente
```http
  http://localhost:8080/
```




## Rodando os testes

Para rodar os testes, rode o seguinte comando

```bash
  mvn test
```


## Documentação da API

#### Retorna toda lista de números e valores romanos.

```http
  GET /search
```


#### Faz insert no banco de dados

```http
  POST /search
```

| Body     | Descrição                                       |
|:---------|:------------------------------------------------|
| `string` | **(application / json)**. `{"text:" "EXEMPLE"}` |




## Stack utilizada

**Back-end:** Java, SpringBoot

**Ferramenta para testes HTTP:** Postman


