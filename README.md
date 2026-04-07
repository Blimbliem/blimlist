# 📝 BlimList

O **BlimList** é um ecossistema Full Stack de gerenciamento de tarefas (To-Do List), desenvolvido para demonstrar práticas modernas de engenharia de software, desde a arquitetura do código até a orquestração em nuvem. O projeto utiliza o prefixo do sobrenome **Blimbliem** como marca de autoria e qualidade.

---

## 🏗️ O que foi realizado (Fase 1: Core & Backend)

Nesta primeira etapa, o foco foi construir uma fundação sólida seguindo os princípios de robustez e isolamento.

### **1. Arquitetura Limpa (Clean Architecture)**
O projeto segue o padrão de camadas para garantir o desacoplamento e a facilidade de manutenção:
* **Domínio**: Entidade `Task` com lógica de negócio pura (ID, Title, Description, Status).
* **Aplicação**: Casos de uso isolados (`CreateTaskUseCase`) e definição de portas de saída (`TaskRepository`).
* **Infraestrutura**: Adaptadores Web (REST Controller) e de Persistência (JPA/PostgreSQL).

### **2. Stack Tecnológica**
* **Linguagem**: Java 21.
* **Framework**: Spring Boot 3.
* **Banco de Dados**: PostgreSQL 15.
* **Ferramentas**: Maven, Lombok e JPA/Hibernate.

### **3. Containerização com Docker**
* **Dockerfile**: Empacotamento da aplicação Java em uma imagem leve e segura.
* **Docker Compose**: Orquestração local do Backend e Banco de Dados, garantindo que o sistema funcione da mesma forma em qualquer máquina.

---

## 🚀 O que está por vir (Roadmap)

O BlimList é um projeto vivo e continuará evoluindo com as seguintes metas:

### **Fase 2: Expansão do Backend (CRUD)**
* Finalização das operações de **Listagem**, **Atualização** e **Exclusão** de tarefas.

### **Fase 3: Interface Visual (Front-end) 💻**
* Desenvolvimento de uma Single Page Application (SPA) utilizando **React**.
* Estilização moderna e responsiva com **Tailwind CSS**.

### **Fase 4: Orquestração em Nuvem (Kubernetes)**
* Implementação de manifestos para implantação em clusters **Kubernetes**, focando em escalabilidade e auto-recuperação.

---

## 🛠️ Como rodar o projeto

### **1. Configuração de Segurança (.env)**
Por boas práticas de segurança, este repositório não armazena senhas. Antes de iniciar, crie um arquivo chamado `.env` na raiz do projeto com o seguinte conteúdo:

```text
DB_USER=postgres
DB_PASSWORD=sua_senha_aqui
DB_NAME=blimlist

Para subir o ambiente completo (Backend + Banco de Dados), execute o comando abaixo na raiz do diretório:

```bash
docker compose up --build