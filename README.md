# Trabalho-API
Trabalho Avaliativo de API

# Trabalho em Grupo de API REST

## 👥 Equipe
* Almir Acacio - [GitHub](https://github.com/seu-usuario)
* Elisa Barbosa Kappaun - [GitHub](https://github.com/seu-usuario)
* Maicon Muniz - [GitHub](https://github.com/seu-usuario)
* Rafael Couto - [GitHub](https://github.com/seu-usuario)
* Rebeka Cardoso - [GitHub](https://github.com/seu-usuario)

---

## 📄 Enunciado do Trabalho
**Pontuação: 10 pontos**

Criar um novo projeto maven usando o Spring com as seguintes dependências:
* Spring Web
* Spring Data JPA
* Validation
* H2
* Dev Tools

**application.properties**
Configurar o arquivo de propriedades application.properties para o banco de dados h2, salvando o banco em um arquivo.

**Classes**
Criar as classes (entidades) abaixo com os seguintes atributos:

**Paciente**
* codigo – Long - serial
* nome – não pode ser nulo, tamanho máximo 60
* email – String - validar
* telefone – não pode ser nulo, tamanho máximo 11 e não pode ter letra - validar

**Medico**
* codigo - serial
* crm – Long
* especialidade - String
* nome – não pode ser nulo tamanho máximo 60
* email – String - validar
* telefone – não pode ser nulo, tamanho máximo 11 e não pode ter letra - validar
* *Obs: Analisar se vale a pena criar uma classe Pessoa e usar anotações de herança.*

**Consulta**
* dataConsulta – LocalDate
* horaConsulta – LocalTime
* status – (Aguardando, Em Atendimento, Atendido)
* paciente – Paciente
* medico – Medico
* *Obs: Analisar se vale a pena criar um enum para o status da consulta. Utilizar as anotações para criar o banco de dados, chave primária e outras.*

**Validation**
* Fazer a validação nos campos nome, email e telefone.

**Controller**
Criar as classes abaixo:

**PacienteController**
* Criar um método para inserir um paciente.
* Criar um método para atualizar um paciente.
* Criar um método para apagar um paciente.
* Criar um método para listar um paciente e suas respectivas consultas.

**MedicoController**
* Criar um método para inserir um médico.
* Criar um método para listar todos os médicos.

**ConsultaController**
* Criar um método para inserir uma consulta.

**Exception**
* Criar a classe que intercepta os erros de exceção do Spring.
* Criar um método para tratar os erros de validação.
