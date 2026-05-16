# Deploy da aplicação

Projeto publicado na Vercel para demonstração da entrega acadêmica.

Aplicação desenvolvida em Java Desktop.
* Observação:
A aplicação foi desenvolvida em Java Desktop, portanto o deploy serve apenas para publicação do repositório e demonstração da integração contínua.

# NutriLog - Controle de Hábitos Saudáveis 

##  Problema Real
Muitas pessoas têm dificuldade em manter uma dieta equilibrada por não acompanharem o que consomem ao longo do dia. A falta de registro leva ao consumo excessivo de alimentos não saudáveis sem que o indivíduo perceba.

##  Proposta da Solução
O **NutriLog** é uma aplicação desktop simples que permite ao usuário registrar rapidamente suas refeições e marcar se elas foram saudáveis ou não. Os dados são persistidos localmente para consultas futuras.

##  Público-alvo
Pessoas em processo de reeducação alimentar e entusiastas de hábitos saudáveis que buscam uma ferramenta minimalista de registro.

##  Funcionalidades
- Registro de nome da refeição.
- Classificação binária (Saudável / Não Saudável).
- Armazenamento persistente em banco de dados local (H2).
- Interface gráfica intuitiva (Swing).

##  Tecnologias Utilizadas
- **Linguagem:** Java 17
- **Banco de Dados:** H2 Database
- **Gerenciador de Dependências:** Maven
- **Testes:** JUnit 5
- **Linting:** Maven Checkstyle Plugin
- **CI:** GitHub Actions

##  Como Rodar
1. Clone o repositório:
   ```bash
   [https://github.com/filemoura/Controle-de-Refeicoes-e-Habitos-Saudaveis.git]

2. No terminal, digite:
   ```bash
   mvn clean compile exec:java -Dexec.mainClass="br.com.bootcamp.MainFrame"
   
3. Após o comando a janela da aplicação será aberta automaticamente.
