  #language: pt
  #enconding: UTF-8
  #author: IuriRaRedu
  #date: 14/07/2021
  #version: 1.0

  @Formulario
  Funcionalidade: Formulario do site Automacao com Batista

    Contexto: Acessar Pagina de Treinamento Automacao Web
      Dado que clico no botao "COMEÇAR AUTOMAÇÃO WEB"

    @web @CadastrarUsuario
    Cenario: Realizar cadastro de usuario com todos os dados validos
      Dado que navego ate o formulario de criar novo usuario
      E preencho os campos com dados validos
      Quando clico em "CRIAR"
      Entao sou redirecionado para pagina com a mensagem "Usuário Criado com sucesso"