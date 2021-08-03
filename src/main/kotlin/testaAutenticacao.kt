fun testaAutenticacao() {
    val ger01 = Gerente(nome = "02 nome", cpf = "02 cpf", salario = 111.11, senha = 123)
    val dir01 = Diretor(nome = "03 nome", cpf = "03 cpf", salario = 111.11, senha = 123, plr = 1000.00)
    val ana01 = Analista(nome = "01 nome", cpf = "01 cpf", salario = 111.11)

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(ger01, 123)
    sistemaInterno.entra(dir01,1234)
    ger01.impressao()
    dir01.impressao()
    ana01.impressao() 


}