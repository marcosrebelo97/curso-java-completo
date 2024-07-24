# Projeto Web com Spring Boot e JPA/Hibernate

Este é um projeto de exemplo que demonstra a criação de uma aplicação web utilizando Spring Boot, JPA/Hibernate, Spring Data JPA e Maven. 

## Estrutura do Projeto

O projeto segue a arquitetura padrão com os seguintes pacotes principais:

- **Entities**: Contém as classes de entidade que representam as tabelas do banco de dados.
- **Repositories**: Contém as interfaces que estendem o `JpaRepository` para acesso aos dados.
- **Resources (Controllers)**: Contém as classes de controladores que expõem os endpoints REST.
- **Services**: Contém as classes de serviço que implementam a lógica de negócios.

## Como Executar o Projeto

Para executar o projeto, siga os passos abaixo:

**Configure o banco de dados**:
    
  - Certifique-se de que você tem um banco de dados configurado e atualizado.
  - Altere as configurações de conexão com o banco de dados no arquivo `application.properties` ou `application.yml`.
  - Utilizei o banco de dados em memória H2.

**Compile e execute o projeto usando Maven**:
  ```bash
  mvn spring-boot:run
  ```

**Testando os Endpoints**:
  - Utilizei o Postman para testar os endpoints da aplicação.
