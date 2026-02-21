# blimlist

BlimList 📝:
O BlimList é um ecossistema Full Stack de gerenciamento de tarefas, desenvolvido para demonstrar práticas modernas de engenharia de software, desde a arquitetura do código até a orquestração em nuvem. O projeto utiliza o prefixo do sobrenome Blimbliem como marca de autoria e qualidade.

🚀 O Projeto: 
O objetivo do BlimList é oferecer uma ferramenta de produtividade resiliente e escalável. Diferente de uma "To-Do List" comum, este projeto foi construído focando em separação de preocupações e independência de infraestrutura, permitindo que o sistema cresça e mude sem afetar o núcleo das regras de negócio.

🛠️ Tecnologias e Arquitetura
O projeto é dividido em três pilares principais:

1. Back-end 
Linguagem: Java 21+

Framework: Spring Boot 3

Padrão Arquitetônico: Clean Architecture (Arquitetura Limpa).

Domínio: Entidades puras e regras de negócio.

Aplicação: Casos de uso isolados.

Infraestrutura: Adaptadores para Web (REST) e Persistência.

Gerenciador de Dependências: Maven

2. Front-end (A Experiência)
Framework: React (ou sua escolha como Angular/Vue)

Estilização: Tailwind CSS (para uma interface moderna e responsiva).

Comunicação: Axios para consumo da API REST.

3. Banco de Dados (A Memória)
Principal: PostgreSQL (Banco de dados relacional robusto para garantir a integridade dos dados).

Persistência: Spring Data JPA / Hibernate.

4. DevOps & Infraestrutura (A Operação)
Containerização: Docker (para garantir que o sistema rode da mesma forma em qualquer máquina).

Orquestração: Kubernetes (para gerenciamento de réplicas, escalabilidade e disponibilidade).

Ambiente Local: Docker Compose e Minikube.

🎯 Objetivos de Aprendizado
Ao desenvolver o BlimList, os seguintes conceitos são aplicados:

SOLID: Princípios de design de software orientado a objetos.

DRY (Don't Repeat Yourself): Código limpo e reutilizável.

Portabilidade: Aplicação "empacotada" que não depende da instalação manual de bancos ou JRE no host.

Escalabilidade: Configuração de clusters para aguentar alta carga.

📋 Como rodar (Em breve)
(Aqui será adiconado os comandos do Docker e Kubernetes conforme o projeto avança)
