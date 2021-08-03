fun testeFuncionario() {

    val ger01 = Gerente(nome = "02 nome", cpf = "02 cpf", salario = 111.11, senha = 123)
    val dir01 = Diretor(nome = "03 nome", cpf = "03 cpf", salario = 111.11, senha = 123, plr = 1000.00)
    val ana01 = Analista(nome = "01 nome", cpf = "01 cpf", salario = 111.11)


    ger01.impressao()
    if (ger01.autentica(1213)) {
        println("Gerente autenticado")
    } else println("Gerente não autenticado")
    dir01.impressao()
    ana01.impressao()
    val calculadora = ClaculadoraBonificacao()

    //calculadora.registra(ger01)
    //calculadora.registra(dir01)
    calculadora.registra(ana01)

    println("** Total de bonificacao: ${calculadora.total}")
}